package com.example.myfirstspringclass.controllers;

import com.example.myfirstspringclass.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(/*Model model*/) {

       /* Person person = new Person();
        person.setId(12);
        person.setFirstName("Luke");
        person.setLastName("Baduke");

        model.addAttribute("id", person.getId());
        model.addAttribute("firstName", person.getFirstName());
        model.addAttribute("lastName", person.getLastName());

        Person anotherPerson = new Person();
        anotherPerson.setId(34);
        anotherPerson.setFirstName("Spring");
        anotherPerson.setLastName("Patbooster");

        model.addAttribute("anotherPerson", anotherPerson);
*/
        return "home/index";
    }
}
