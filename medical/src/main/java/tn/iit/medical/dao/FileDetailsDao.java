package tn.iit.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.medical.entity.FileDetails;
@Repository
public interface FileDetailsDao extends JpaRepository<FileDetails, Integer> {
}
