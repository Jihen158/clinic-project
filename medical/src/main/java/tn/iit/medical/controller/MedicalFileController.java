package tn.iit.medical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.iit.medical.dto.MedicalFileDto;
import tn.iit.medical.service.MedicalFileService;

import javax.validation.Valid;

import java.util.Collection;

@RestController
@RequestMapping("/api/medicalFiles")
public class MedicalFileController {
	
	@Autowired
    private MedicalFileService medicalFileService;


    @PostMapping
    public void createMedicalFile(@Valid @RequestBody MedicalFileDto medicalFileDto) {
        medicalFileService.save(medicalFileDto);
    }
    
    @PutMapping
    public void updateMedicalFile(@Valid @RequestBody MedicalFileDto medicalFileDto) {
        medicalFileService.update(medicalFileDto);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicalFile(@PathVariable("id") Integer id) {
        medicalFileService.deleteById(id);
    }

    @GetMapping
    public Collection<MedicalFileDto> getMedicalFiles() {
        return medicalFileService.getAll();
    }
    
    @GetMapping("/{id}")
    public MedicalFileDto getMedicalFileById(@PathVariable("id") Integer id) {
        return medicalFileService.getById(id);
    }



}
