package com.example.adressservice.controller;


import com.example.adressservice.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class adressController {


    @GetMapping("/api_adresses")

    public Response getvalue(){

        Response r = new Response();


        r.setMessage("hello nada !! ");
        return r;
    }
}
