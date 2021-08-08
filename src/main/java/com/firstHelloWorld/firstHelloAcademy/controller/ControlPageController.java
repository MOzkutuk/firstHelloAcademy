package com.firstHelloWorld.firstHelloAcademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControlPageController {

    @GetMapping("/forward-clazz")
    public String showClazzPage() {
        return "redirect:/showClazz";
    }

    @GetMapping("/forward-student")
    public String showStudentPage() {
        return "redirect:/showStudent";
    }

    @GetMapping("/forward-teacher")
    public String showTeacherPage() {
        return "redirect:/showTeacher";
    }

    @GetMapping("/forward-subject")
    public String showSubjectPage() {
        return "redirect:/showSubject";
    }

    @GetMapping("/forward-controlPage")
    public String showControlPage() {
        return "control-page";
    }


    @GetMapping("/forward-class-report")
    public String showClassReport() {
        return "redirect:/showClassReport";
    }

}
