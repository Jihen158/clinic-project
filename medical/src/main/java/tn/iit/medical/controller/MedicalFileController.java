package tn.iit.medical.controller;

import org.springframework.web.bind.annotation.*;

import tn.iit.medical.dto.MedicalFileDto;
import tn.iit.medical.service.MedicalFileService;

import javax.validation.Valid;

import java.util.Collection;

@RestController
@RequestMapping("/api/medicalFiles")
public class MedicalFileController {
    private MedicalFileService medicalFileService;

    public MedicalFileController(MedicalFileService medicalFileService) {
        this.medicalFileService = medicalFileService;
    }

    @PostMapping
    public void createMedicalFile(@Valid @RequestBody MedicalFileDto medicalFileDto) {
        medicalFileService.save(medicalFileDto);
    }

    @GetMapping
    public Collection<MedicalFileDto> getMedicalFiles() {
        Collection<MedicalFileDto> medicalFileList = medicalFileService.findAll();
        return medicalFileList;
    }

    @PutMapping
    public void updateMedicalFile(@Valid @RequestBody MedicalFileDto medicalFileDto) {
        medicalFileService.update(medicalFileDto);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicalFile(@PathVariable("id") Integer id) {
        medicalFileService.deleteById(id);
    }

}
