package kz.bitlab.g130springtasktwo.controller;

import kz.bitlab.g130springtasktwo.db.DBManager;
import kz.bitlab.g130springtasktwo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model) {
        List<Student> students = DBManager.getStudents();
        model.addAttribute("studentter", students);
        return "home";
    }
}
