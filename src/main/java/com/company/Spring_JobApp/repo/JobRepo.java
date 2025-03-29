package com.company.Spring_JobApp.repo;

import com.company.Spring_JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Software Engineer", "Develop and maintain applications", 2, Arrays.asList("Java", "Spring Boot", "SQL")),
            new JobPost(2, "Frontend Developer", "Work on UI components", 3, Arrays.asList("React", "TypeScript", "CSS")),
            new JobPost(3, "Data Scientist", "Analyze and model data", 4, Arrays.asList("Python", "TensorFlow", "Pandas")),
            new JobPost(4, "DevOps Engineer", "Manage CI/CD pipelines", 5, Arrays.asList("Docker", "Kubernetes", "AWS")),
            new JobPost(5, "Backend Developer", "Build REST APIs", 3, Arrays.asList("Node.js", "Express", "MongoDB"))
    ));

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);
    }
}
