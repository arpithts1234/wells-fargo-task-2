package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.repository.AdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advisors")
public class AdvisorController {

    private final AdvisorRepository advisorRepository;

    @Autowired
    public AdvisorController(AdvisorRepository advisorRepository) {
        this.advisorRepository = advisorRepository;
    }

    @PostMapping("/add")
    public Advisor addAdvisor(@RequestBody Advisor advisor) {
        return advisorRepository.save(advisor);
    }

    @GetMapping("/all")
    public List<Advisor> getAllAdvisors() {
        return advisorRepository.findAll();
    }
}
