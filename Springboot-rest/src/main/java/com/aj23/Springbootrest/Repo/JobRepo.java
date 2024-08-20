package com.aj23.Springbootrest.Repo;


import com.aj23.Springbootrest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository

public class JobRepo {
	List<JobPost> jobs = new ArrayList<>(Arrays.asList(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
			Arrays.asList("Core Java", "J2EE", "Spring Boot", "Hibernate")), new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
			Arrays.asList("HTML", "CSS", "JavaScript", "React")), new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
			Arrays.asList("Python", "Machine Learning", "Data Analysis")), new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
			Arrays.asList("Networking", "Cisco", "Routing", "Switching"))));


	public List<JobPost> getAllJobs() {
		return jobs;
	}
	public void addJob(JobPost jobPost) {
		jobs.add(jobPost);
	}
}
