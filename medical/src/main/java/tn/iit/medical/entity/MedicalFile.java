package tn.iit.medical.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "medicalFile")
@Entity
public class MedicalFile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String patientName;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicalFile", fetch = FetchType.EAGER)
    private List<FileDetails> fileDetails;

    public MedicalFile() {
    }

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

    public List<FileDetails> getFileDetails() {
        return fileDetails;
    }

    public void setFileDetails(List<FileDetails> fileDetails) {
        this.fileDetails = fileDetails;
    }
}
