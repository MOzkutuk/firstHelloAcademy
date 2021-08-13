package com.firstHelloWorld.firstHelloAcademy.controller;

import com.firstHelloWorld.firstHelloAcademy.api.Clazz;
import com.firstHelloWorld.firstHelloAcademy.api.Student;
import com.firstHelloWorld.firstHelloAcademy.api.Subject;
import com.firstHelloWorld.firstHelloAcademy.api.Teacher;
import com.firstHelloWorld.firstHelloAcademy.service.ClazzService;
import com.firstHelloWorld.firstHelloAcademy.service.StudentService;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ClazzService clazzService;


    @GetMapping("/showStudent")
    public String showStudents(Model model) {

        //call dao method to get the data

        List<Student> studentList = studentService.loadStudents();

        model.addAttribute("students", studentList);

        return "student-list";

    }


    @GetMapping("/showClassReport")
    public String showClassReport(Model model) {


        List<Student> studentList = studentService.loadStudents();
        List<Clazz> clazzList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();
        List<Subject> subjectList = new ArrayList<>();

        for (Student student : studentList) {
            clazzList.add(student.getClazz());
        }

        for (Clazz clazz : clazzList) {
            teacherList.add(clazz.getTeacher());
            subjectList.add(clazz.getSubject());
        }

        model.addAttribute("studentList", studentList);
        model.addAttribute("clazzList", clazzList);
        model.addAttribute("teacherList", teacherList);
        model.addAttribute("subjectList", subjectList);

        return "/class-report";

    }


    @GetMapping("/showAddStudentPage")
    public String addStudent(Model model) {

        List<Clazz> clazzList = clazzService.loadClazzes();

        List<Integer> clazzes = new ArrayList<>();

        for (Clazz clazz : clazzList) {
            clazzes.add(clazz.getId());
        }

        model.addAttribute("clazzes", clazzes);

        Student student = new Student();

        model.addAttribute("student", student);

        return "add-student";
    }

    @PostMapping("/save-student")
    public String saveStudent(Student student, Model model, Clazz clazz) {

        //write the logic to save the data(studentDTO) to the database
        //do a condition check
        //if the user does have a id -> do a update
        //if the user doesn't have an id then do a insert

        List<Clazz> clazzList = clazzService.loadClazzes();

        List<Integer> clazzes = new ArrayList<>();

        for (Clazz theClazz : clazzList) {
            clazzes.add(theClazz.getId());
        }

        model.addAttribute("clazzes", clazzes);



        try {

            if (student.getFirst_name().equals("") || student.getLast_name().equals("") || student.getClazz().getId() == 0) {

                model.addAttribute("error", "Invalid Student credintials");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return "add-student";

            } else {


                if (student.getId() == 0) {

                    //insert a new record
                    studentService.saveStudent(student);

                } else {

                    //do an update
                    studentService.update(student);

                }

                System.out.println(student);

                return "redirect:/showStudent";
            }
        } catch (ConstraintViolationException | DataIntegrityViolationException exception) {

            model.addAttribute("error3", "Class ID Does Not Exist");

            return "/add-student";

        } catch (NumberFormatException e) {

            model.addAttribute("numberError", "Please enter the data in numeric format");

            return "/add-clazz";
        }
    }

    @GetMapping("/updateStudent")
    public String updateStudent(@RequestParam("id") int id, Model model) {


        List<Clazz> clazzList = clazzService.loadClazzes();

        List<Integer> clazzes = new ArrayList<>();

        for (Clazz clazz : clazzList) {
            clazzes.add(clazz.getId());
        }

        model.addAttribute("clazzes", clazzes);

        Student student = new Student();

        model.addAttribute("student", student);

        //give the user object who clicked on the update link
        System.out.println("looking for the student having id : " + id);

        Student theStudent = studentService.getStudent(id);
        System.out.println(theStudent);

        //setting the student information
        model.addAttribute("student", theStudent);

        return "add-student";
    }

    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("id") int id, Student student, Clazz clazz) {


        //capture the id of the student whom you are trying to delete
        //once captured the id do a service call to delete the student

        try {
            studentService.deleteStudent(id);
        } catch (Exception e) {
            return "delete-fail";
        }

        return "redirect:/showStudent";

    }
}
