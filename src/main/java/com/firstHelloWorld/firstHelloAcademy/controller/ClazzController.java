package com.firstHelloWorld.firstHelloAcademy.controller;

import com.firstHelloWorld.firstHelloAcademy.api.Clazz;
import com.firstHelloWorld.firstHelloAcademy.api.Subject;
import com.firstHelloWorld.firstHelloAcademy.api.Teacher;
import com.firstHelloWorld.firstHelloAcademy.service.ClazzService;
import com.firstHelloWorld.firstHelloAcademy.service.SubjectService;
import com.firstHelloWorld.firstHelloAcademy.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;


@Controller
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private SubjectService subjectService;


    @GetMapping("/showClazz")
    public String showClazzes(Model model) {

        //call dao method to get the data

        List<Clazz> clazzList = clazzService.loadClazzes();

        model.addAttribute("clazzes", clazzList);

        return "clazz-list";

    }

    @GetMapping("/showAddClazzPage")
    public String addClazz(Model model) {

        // Creating list for Spring format tags
        // Creating a new attribute (list)

        List<Clazz> clazzList = clazzService.loadClazzes();

        List<Teacher> teachers = teacherService.loadTeachers();

        List<Subject> subjects = subjectService.loadSubjects();

        List<Integer> teacherIdList = new ArrayList<>();
        List<Integer> subjectIdList = new ArrayList<>();

        for (Teacher teacher : teachers) {
            teacherIdList.add(teacher.getId());
        }

        for (Subject subject : subjects) {
            subjectIdList.add(subject.getId());
        }

        model.addAttribute("subjects", subjectIdList);

        model.addAttribute("teachers", teacherIdList);


        Clazz clazz = new Clazz();

        model.addAttribute("clazz", clazz);

        return "add-clazz";
    }

    @PostMapping("/save-clazz")
    public String saveClazz(Clazz clazz, Model model, int id) throws BindException {

        //write the logic to save the data(DTO) to the database
        //do a condition check
        //if the user does have a id -> do a update
        //if the user doesn't have an id then do a insert

        try {


            if (clazz.getName().equals("") || clazz.getSubject().getId() == 0 || clazz.getTeacher().getId() == 0
                    || clazz.getSubject().getName().equals("") || clazz.getTeacher().getFirst_name().equals("")
                    || clazz.getTeacher().getLast_name().equals("")) {

                model.addAttribute("error", "Invalid Class credintials");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                return "add-clazz";

            } else {
                System.out.println("ikinci kisma gidiyor");
                if (clazz.getId() == 0) {

                    //insert a new record
                    clazzService.saveClazz(clazz);

                } else {

                    //do an update
                    clazzService.update(clazz);

                }

                System.out.println(clazz);

                return "redirect:/showClazz";
            }
        } catch (Throwable e) {

            model.addAttribute("duplicateError", "Given data does not match");

            return "/add-clazz";

        }
    }

    @GetMapping("/updateClazz")
    public String updateClazz(@RequestParam("id") int id, Model model) {

        //give the user object who clicked on the update link
        System.out.println("looking for the class having id : " + id);

        Clazz theClazz = clazzService.getClazz(id);

        List<Clazz> clazzList = clazzService.loadClazzes();

        List<Teacher> teachers = teacherService.loadTeachers();

        List<Subject> subjects = subjectService.loadSubjects();

        List<Integer> teacherIdList = new ArrayList<>();
        List<Integer> subjectIdList = new ArrayList<>();

        for (Teacher teacher : teachers) {
            teacherIdList.add(teacher.getId());
        }

        for (Subject subject : subjects) {
            subjectIdList.add(subject.getId());
        }

        model.addAttribute("subjects", subjectIdList);

        model.addAttribute("teachers", teacherIdList);


        System.out.println(theClazz);

        //setting the class information
        model.addAttribute("clazz", theClazz);


        return "add-clazz";
    }

    @GetMapping("/deleteClazz")
    public String deleteClazz(@RequestParam("id") int id) {

        //capture the id of the data whom you are trying to delete
        //once captured the id do a service call to delete the data

        try{
            clazzService.deleteClazz(id);
        }catch (Exception e){
            return "delete-fail" ;
        }

        return "redirect:/showClazz";

    }

}
