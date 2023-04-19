package com.example.myspring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myspring.Entity.Forms;
import com.example.myspring.repository.FormRepository;

@RestController
public class FormController {
    
    @Autowired
    private FormRepository formrepo;
   
    @GetMapping("/get-all")
    public List<Forms> getForms(){
        return formrepo.findAll();

    }
    
    @PostMapping("/post-data")
    public Forms postForm(@RequestBody Forms forms){
        return formrepo.save(forms);
    }
}
