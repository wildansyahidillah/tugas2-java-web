package com.example.latihantugas2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping ("/")
    @ResponseBody
    public String index() {
        return "Nama saya: Wildan Syahidillah || NIM Saya: 1912510995";
    }

}
