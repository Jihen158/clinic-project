package tn.iit.medical.service;

import org.springframework.stereotype.Service;
import tn.iit.medical.entity.MedicalFile;
import tn.iit.medical.dao.MedicalFileDao;

import java.util.List;
import java.util.Optional;
@Service
public class MedicalFileService {
    private MedicalFileDao medicalFileDao;
    public MedicalFileService(MedicalFileDao medicalFileDao) {
    this.medicalFileDao = medicalFileDao;
    }
    public void save(MedicalFile medicalFile) {
        medicalFileDao.saveAndFlush(medicalFile);
    }
    public MedicalFile getById(Integer id) {
        Optional<MedicalFile> opt = medicalFileDao.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        }else  {
            return null;
        }
    }
    public void update(MedicalFile medicalFile) {
        medicalFileDao.saveAndFlush(medicalFile);
    }
    public void delete(MedicalFile medicalFile) {
        medicalFileDao.delete(medicalFile);
    }
    public void deleteById(Integer id) {
        medicalFileDao.deleteById(id);
    }
    public List<MedicalFile> findAll() {
        return  medicalFileDao.findAll();
    }
}
