package tn.iit.medical.controller;

import org.springframework.web.bind.annotation.*;
import tn.iit.medical.entity.FileDetails;
import tn.iit.medical.service.FileDetailsService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/fileDetails")
public class FileDetailsController {
    private FileDetailsService fileDetailsService;

    public FileDetailsController(FileDetailsService fileDetailsService) {
        this.fileDetailsService = fileDetailsService;
    }

    @PostMapping
    public void createPrescribedMedication(@Valid @RequestBody FileDetails fileDetails) {
        fileDetailsService.save(fileDetails);
    }

    @GetMapping
    public List<FileDetails> getPrescribedMedication() {
        List<FileDetails> fileDetails = fileDetailsService.findAll();
        return fileDetails;
    }

    @PutMapping
    public void updatePrescribedMedication(@Valid @RequestBody FileDetails fileDetails) {
        fileDetailsService.update(fileDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePrescribedMedication(@PathVariable("id") Integer id) {
        fileDetailsService.deleteById(id);
    }

}
