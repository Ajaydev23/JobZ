package com.aj23.JobApp;

import com.aj23.JobApp.Service.JobService;
import com.aj23.JobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class JobController {
    @Autowired
    private JobService service;
    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }
    @GetMapping("addjob")
    public String addJob() {
        return "addJob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "succes";
    }
    @GetMapping("viewalljobs")
    public String viewAllJobs(Model m){
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }

}
