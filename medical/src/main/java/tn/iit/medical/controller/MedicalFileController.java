package tn.iit.medical.controller;

import org.springframework.web.bind.annotation.*;
import tn.iit.medical.entity.MedicalFile;
import tn.iit.medical.service.MedicalFileService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/medicalFiles")
public class MedicalFileController {
    private MedicalFileService medicalFileService;

    public MedicalFileController(MedicalFileService medicalFileService) {
        this.medicalFileService = medicalFileService;
    }

    @PostMapping
    public void createMedicalFile(@Valid @RequestBody MedicalFile medicalFile) {
        medicalFileService.save(medicalFile);
    }

    @GetMapping
    public List<MedicalFile> getMedicalFiles() {
        List<MedicalFile> medicalFileList = medicalFileService.findAll();
        return medicalFileList;
    }

    @PutMapping
    public void updateMedicalFile(@Valid @RequestBody MedicalFile medicalFile) {
        medicalFileService.update(medicalFile);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicalFile(@PathVariable("id") Integer id) {
        medicalFileService.deleteById(id);
    }

}
