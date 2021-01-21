package tn.iit.medical.dto;


import javax.validation.constraints.Size;
import java.util.List;

public class MedicalFileDto {
    private Integer id;
    @Size(
            min = 1,
            max = 100
    )
    private String patientName;
    private List<FileDetailsDto> detailsDtos;

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

	public List<FileDetailsDto> getDetailsDtos() {
		return detailsDtos;
	}

	public void setDetailsDtos(List<FileDetailsDto> detailsDtos) {
		this.detailsDtos = detailsDtos;
	}

}
