package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String displaySkillsAtRoot() {
        return "<html>" +
                "<body>" +
                "<h1>Skills tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<li>Java</li>" +
                "</ol>" +
                "<br>" +
                "Click <a href='/form'>HERE</a> to rank your fave skills!" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String displayForm() {

        return "<form action='/form' method='post'>" +
                "<label>Name: </label> <input type='text'>" +
                "<br><label>My favorite language:</label>" +
                "<br><select name ='fave' id = 'fave'>" +
                "<option value=''>--SELECT A LANGUAGE--</option>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<br><label>My second favorite language:</label>" +
                "<br><select name ='secondFave' id = 'secondFave'>" +
                "<option value=''>--SELECT A LANGUAGE--</option>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<br><label>My third favorite language:</label>" +
                "<br><select name ='thirdFave' id = 'thirdFave'>" +
                "<option value=''>--SELECT A LANGUAGE--</option>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type ='submit' value='SUBMIT'>";
    }
    @PostMapping("/form")
    @ResponseBody
    public String displayFormSubmission(@RequestParam String name, String fave, String secondFave, String thirdFave) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + fave + "</li>" +
                "<li>" + secondFave + "</li>" +
                "<li>" + thirdFave + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
