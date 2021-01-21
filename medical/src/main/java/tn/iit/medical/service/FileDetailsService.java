package tn.iit.medical.service;

import org.springframework.stereotype.Service;
import tn.iit.medical.entity.FileDetails;
import tn.iit.medical.mapper.FileDetailsMapper;
import tn.iit.medical.dao.FileDetailsDao;
import tn.iit.medical.dto.FileDetailsDto;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class FileDetailsService {
    private FileDetailsDao fileDetailsDao;

    public FileDetailsService(FileDetailsDao fileDetailsDao) {
        this.fileDetailsDao = fileDetailsDao;
    }
    
    public void save(FileDetailsDto fileDetailsDto) {
    	FileDetails fileDetails = FileDetailsMapper.convertFDDtoToFDE(fileDetailsDto);
        fileDetailsDao.saveAndFlush(fileDetails);
    }
    
    public void update(FileDetailsDto fileDetailsDto) {
    	FileDetails fileDetails = FileDetailsMapper.convertFDDtoToFDE(fileDetailsDto);
        fileDetailsDao.saveAndFlush(fileDetails);
    }
    
    public FileDetailsDto getById(Integer id) {
        Optional<FileDetails> fileDetails = fileDetailsDao.findById(id);
        return FileDetailsMapper.convertFDEToFDDto(fileDetails.get());        
    }

    public void deleteAll() {
        fileDetailsDao.deleteAll();
    }
    public void deleteById(Integer id) {
        fileDetailsDao.deleteById(id);
    }
    public Collection<FileDetailsDto> findAll() {
    	List<FileDetails> fileDetails = fileDetailsDao.findAll();
    	Collection<FileDetailsDto> filesDtos = FileDetailsMapper.convertFDEToFDDtos(fileDetails);
        return filesDtos;
    }

}
