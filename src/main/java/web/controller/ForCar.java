package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarServiseImpl;

@Controller
public class ForCar {

    @Autowired
    private CarServiseImpl carServise;


    @GetMapping("/cars")
    public String numberOfCar(@RequestParam(value = "count", required = false) Integer number, Model model) {
        model.addAttribute("car", carServise.list(number));
        return "cars";
    }


}
