package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller

public class SkillsController {

//    @RequestMapping
//    @ResponseBody
//    public String programmingLanguages(){
//       return "<html>" +
//                "<body>"+
//                "<h1>Skills Tracker</h1> " +
//                "<h2>Skills List</h2> " +
//                "<ol>" +
//                "<li name = 'a'><li>" +
//                "<li name = 'b'></li>" +
//                "<li name = 'c'></li>" +
//                "</ol>"+
//                "</body>"+
//                "</html>";
//    }

    @RequestMapping
    @ResponseBody
    public String languageChoices(@RequestParam String choice1, @RequestParam String choice2, @RequestParam String choice3, @RequestParam String coder) {

    }

}
