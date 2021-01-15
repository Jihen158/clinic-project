package tn.iit.medical.service;

import org.springframework.stereotype.Service;
import tn.iit.medical.entity.FileDetails;
import tn.iit.medical.dao.FileDetailsDao;

import java.util.List;
import java.util.Optional;

@Service
public class FileDetailsService {
    private FileDetailsDao fileDetailsDao;

    public FileDetailsService(FileDetailsDao fileDetailsDao) {
        this.fileDetailsDao = fileDetailsDao;
    }
    public void save(FileDetails fileDetails) {
        fileDetailsDao.saveAndFlush(fileDetails);
    }
    public FileDetails getById(Integer id) {
        Optional<FileDetails> opt = fileDetailsDao.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        }else  {
            return null;
        }
    }
    public void update(FileDetails fileDetails) {
        fileDetailsDao.saveAndFlush(fileDetails);
    }
    public void delete(FileDetails fileDetails) {
        fileDetailsDao.delete(fileDetails);
    }
    public void deleteById(Integer id) {
        fileDetailsDao.deleteById(id);
    }
    public List<FileDetails> findAll() {
        return  fileDetailsDao.findAll();
    }

}
