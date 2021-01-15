package tn.iit.medical.dto;


import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

public class MedicalFileDto {
    private Integer id;
    @Size(
            min = 1,
            max = 100
    )
    private String patientName;
    private LocalDateTime arrivalDate;
    private List<FileDetailsDto> prescribedMedications;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public List<FileDetailsDto> getPrescribedMedications() {
        return prescribedMedications;
    }

    public void setPrescribedMedications(List<FileDetailsDto> prescribedMedications) {
        this.prescribedMedications = prescribedMedications;
    }
}
