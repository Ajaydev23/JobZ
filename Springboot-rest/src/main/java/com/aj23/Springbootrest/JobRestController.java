package com.aj23.Springbootrest;

import com.aj23.Springbootrest.Service.JobService;
import com.aj23.Springbootrest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin(origins= "http://localhost:3000")
public class JobRestController {
    @Autowired
    private JobService service;


    @GetMapping("jobPosts")
//    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
}
