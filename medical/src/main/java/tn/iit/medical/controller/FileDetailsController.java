package tn.iit.medical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.iit.medical.dto.FileDetailsDto;
import tn.iit.medical.service.FileDetailsService;
import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/api/fileDetails")
public class FileDetailsController {
	
	@Autowired
    private FileDetailsService fileDetailsService;

    @PostMapping
    public void createPrescribedMedication(@Valid @RequestBody FileDetailsDto fileDetailsDto) {
        fileDetailsService.save(fileDetailsDto);
    }

    @GetMapping
    public Collection<FileDetailsDto> getPrescribedMedication() {
        return fileDetailsService.findAll();
    }

    @PutMapping
    public void updatePrescribedMedication(@Valid @RequestBody FileDetailsDto fileDetailsDto) {
        fileDetailsService.update(fileDetailsDto);
    }

    @DeleteMapping("/{id}")
    public void deletePrescribedMedication(@PathVariable("id") Integer id) {
        fileDetailsService.deleteById(id);
    }

}
