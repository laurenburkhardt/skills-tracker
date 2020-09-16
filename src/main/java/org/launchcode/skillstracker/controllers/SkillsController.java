package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller

public class SkillsController {

    @RequestMapping(value = "programmingLanguages", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String programmingLanguages(@RequestParam String coder, @RequestParam  String choice1, @RequestParam String choice2, @RequestParam String choice3) {


        return "<html>" +
                "<body>"+
                "<h1>Skills Tracker</h1> " +
                "<h2>Skills List</h2> " +
                "<ol>" +
                "<li name = 'choice1'>"+choice1+"</li>" +
                "<li name = 'choice2'>\"+choice2+\"</li>" +
                "<li name = 'choice3'>\"+choice3+\"</li>" +
                "</ol>"+
                "</body>"+
                "</html>";
    }
@GetMapping(value = "form")
@ResponseBody
    public String programmingLanguagesForm() {
        String html =
        "<html>" +
                    " <body> " +
                "<form method = 'post' action = '/form' choice1 = 'choice1'>"+
                    "<h2>Name:</h2>"+
                         "<input type = 'text' name = 'coder'/> " +
                "<h2>My favorite language:</h2>"+
                "<select name = 'choice1'>" +
                                "<option value = 'JavaScript'>JavaScript</option>" +
                                "<option value = 'Java'>Java</option>" +
                                "<option value = 'Python'>Python</option>" +
                            "</select>" +
                "<h2>My second favorite language:</h2>"+
                "<select name = 'choice2'>" +
                                "<option value = 'JavaScript'>JavaScript</option>" +
                                "<option value = 'Java'>Java</option>" +
                                "<option value = 'Python'>Python</option>" +
                            "</select>" +
                "<h2>My third favorite language:</h2>"+
                "<select name = 'choice3'>" +
                                "<option value = 'JavaScript'>JavaScript</option>" +
                                "<option value = 'Java'>Java</option>" +
                                "<option value = 'Python'>Python</option>" +
                            "</select>" +
                        "<input type = 'submit' value = 'Submit'>"+
                     "</body>" +
                "</html>";
        return html;
    }

    @GetMapping
    @ResponseBody
    public String programmingLanguages() {
        String html =
                "<html>" +
                        "<body>"+
                        "<h1>Skills Tracker</h1> " +
                        "<h2>Skills List</h2> " +
                        "<ol>" +
                        "<li>JavaScript</li>" +
                        "<li>Java</li>" +
                        "<li>Python</li>" +
                        "</ol>"+
                        "</body>"+
                        "</html>";
        return html;
    }



}
