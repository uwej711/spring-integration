package com.valiton.spring.web;

import com.valiton.spring.service.ConvertInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConvertController {

    @Autowired
    private ConvertInterface converter;

    @RequestMapping("/c2f/{degrees}")
    @ResponseBody
    String celsius(@PathVariable String degrees) {
        return Float.toString(converter.celsiusToFahrenheit(Float.parseFloat(degrees)));
    }

}
