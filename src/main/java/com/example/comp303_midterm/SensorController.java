package com.example.comp303_midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class SensorController {

    @Autowired
    private SensorRepository sensorRepository;

    @GetMapping("/")
    public String Home(Model model) {
        model.addAttribute("sensors", sensorRepository.findAll());
        model.addAttribute("sensorCount", sensorRepository.count());
        model.addAttribute("sensor", new Sensor());
        return "index";
    }

    @PostMapping("/add")
    public String addSensor(@Valid Sensor sensor, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "index";
        }
        sensorRepository.save(sensor);
        model.addAttribute("sensors", sensorRepository.findAll());
        model.addAttribute("sensorCount", sensorRepository.count());
        return "redirect:/";
    }


}
