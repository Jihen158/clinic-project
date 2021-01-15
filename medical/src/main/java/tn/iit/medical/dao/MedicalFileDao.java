package tn.iit.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.medical.entity.MedicalFile;
@Repository
public interface MedicalFileDao extends JpaRepository<MedicalFile, Integer> {
}
