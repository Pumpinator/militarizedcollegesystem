package edu.mx.utleon.militarizedcollegesystem.microservices.admissions.admissions;

import edu.mx.utleon.militarizedcollegesystem.common.dtos.ApplicantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @GetMapping("/applicants")
    public List<ApplicantDto> getAllApplicants() {
        return applicantService.getAllApplicants();
    }

    @PostMapping("/applicants")
    public ApplicantDto createApplicant(@RequestBody ApplicantDto applicantDto) {
        return applicantService.createApplicant(applicantDto);
    }

}
