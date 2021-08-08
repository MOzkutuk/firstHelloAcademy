package com.firstHelloWorld.firstHelloAcademy.controller;


import com.firstHelloWorld.firstHelloAcademy.api.Teacher;
import com.firstHelloWorld.firstHelloAcademy.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @GetMapping("/showTeacher")
    public String showTeachers(Model model) {

        //call dao method to get the data

        List<Teacher> teacherList = teacherService.loadTeachers();

        model.addAttribute("teachers", teacherList);

        return "teacher-list";

    }

    @GetMapping("/showAddTeacherPage")
    public String addTeacher(Model model) {

        Teacher teacher = new Teacher();

        model.addAttribute("teacher", teacher);

        return "add-teacher";
    }

    @PostMapping("/save-teacher")
    public String saveStudent(Teacher teacher, Model model) {


        //write the logic to save the data(studentDTO) to the database
        //do a condition check
        //if the user does have a id -> do a update
        //if the user doesn't have an id then do a insert

        if (teacher.getFirst_name().equals("") || teacher.getLast_name().equals("")) {

            model.addAttribute("error", "Invalid Teacher credintials");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("error basarili");

            return "add-teacher";

        } else {
            System.out.println("ikinci kisma gidiyor");
            if (teacher.getId() == 0) {

                //insert a new record
                teacherService.saveTeacher(teacher);

            } else {

                //do an update
                teacherService.update(teacher);

            }

            System.out.println(teacher);

            return "redirect:/showTeacher";
        }
    }

    @GetMapping("/updateTeacher")
    public String updateStudent(@RequestParam("id") int id, Model model) {

        //give the user object who clicked on the update link
        System.out.println("looking for the teacher having id : " + id);

        Teacher theTeacher = teacherService.getTeacher(id);
        System.out.println(theTeacher);

        //setting the student information
        model.addAttribute("teacher", theTeacher);

        return "add-teacher";
    }

    @GetMapping("/deleteTeacher")
    public String deleteTeacher(@RequestParam("id") int id) {

        //capture the id of the student whom you are trying to delete
        //once captured the id do a service call to delete the student

        try{

            teacherService.deleteTeacher(id);

        }catch (Exception e){
            return "delete-fail" ;
        }

        return "redirect:/showTeacher";

    }

}
