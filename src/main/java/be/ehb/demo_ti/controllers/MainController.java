package be.ehb.demo_ti.controllers;

import be.ehb.demo_ti.model.Student;
import be.ehb.demo_ti.model.StudentDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class MainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(){
        return "Hello World!";
    }

    @RequestMapping(value = "/power", method = RequestMethod.POST)
    @ResponseBody
    public int macht(@RequestParam(name = "a", defaultValue = "1") int a){
        return a * a;
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Student> getAllStudents(){
        return StudentDAO.getStudList();
    }
}
