package com.firstHelloWorld.firstHelloAcademy.controller;

import com.firstHelloWorld.firstHelloAcademy.api.Clazz;
import com.firstHelloWorld.firstHelloAcademy.api.Subject;
import com.firstHelloWorld.firstHelloAcademy.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SubjectController {

    @Autowired
    private SubjectService subjectService;


    @GetMapping("/showSubject")
    public String showSubjects(Model model){

        //call dao method to get the data

        List<Subject> subjectList = subjectService.loadSubjects();

        model.addAttribute("subjects",subjectList);

        return "subject-list";

    }

    @GetMapping("/showAddSubjectPage")
    public String addSubject(Model model) {

        Subject subject = new Subject();

        model.addAttribute("subject",subject);

        return "add-subject";
    }

    @PostMapping("/save-subject")
    public String saveSubject(Subject subject, Model model) {


        //write the logic to save the data(studentDTO) to the database
        //do a condition check
        //if the user does have a id -> do a update
        //if the user doesn't have an id then do a insert

        if(subject.getName().equals("")) {

            model.addAttribute("error", "Invalid Subject credintials");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("error basarili");

            return "add-subject";

        }else{
            System.out.println("ikinci kisma gidiyor");
            if(subject.getId() == 0) {

                //insert a new record
                subjectService.saveSubject(subject);

            }else {

                //do an update
                subjectService.update(subject);

            }

            System.out.println(subject);

            return "redirect:/showSubject";
        }
    }

    @GetMapping("/updateSubject")
    public String updateSubject(@RequestParam("id") int id, Model model) {

        //give the user object who clicked on the update link
        System.out.println("looking for the subject having id : " + id);

        Subject theSubject = subjectService.getSubject(id);
        System.out.println(theSubject);

        //setting the student information
        model.addAttribute("subject", theSubject);

        return "add-subject";
    }

    @GetMapping("/deleteSubject")
    public String deleteSubject(@RequestParam("id") int id,Subject subject,Clazz clazz,Model model) {

        //capture the id of the subject which you are trying to delete
        //once captured the id do a service call to delete the subject

        if(subject == null){

            return "delete-fail";

        }else{

            subjectService.deleteSubject(id);

            return "redirect:/showSubject";
        }






    }
}
