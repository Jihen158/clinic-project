package tn.iit.medical.service;

import org.springframework.stereotype.Service;
import tn.iit.medical.entity.MedicalFile;
import tn.iit.medical.mapper.MedicalFileMapper;
import tn.iit.medical.dao.MedicalFileDao;
import tn.iit.medical.dto.ItemDto;
import tn.iit.medical.dto.MedicalFileDto;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
@Service
public class MedicalFileService {
	
    private MedicalFileDao medicalFileDao;
    private StoreManagementService storeManagementService;
    
    public MedicalFileService(MedicalFileDao medicalFileDao,StoreManagementService storeManagementService) {
    	this.medicalFileDao = medicalFileDao;
    	this.storeManagementService = storeManagementService;
    }
    
    public void save(MedicalFileDto medicalFileDto) {
    	MedicalFile medicalFile = MedicalFileMapper.convertDtoToEnt(medicalFileDto);   	
        medicalFileDao.saveAndFlush(medicalFile);
    }
    
    public void update(MedicalFileDto medicalFileDto) {
    	MedicalFile medicalFile = MedicalFileMapper.convertDtoToEnt(medicalFileDto);   	
        medicalFileDao.saveAndFlush(medicalFile);
    }
    
    public MedicalFileDto getById(Integer id) {
        Optional<MedicalFile> medical = medicalFileDao.findById(id);
        MedicalFileDto medicalFileDto = MedicalFileMapper.convertEntToDto(medical.get());
        List<ItemDto> items = storeManagementService.getAllItemsDto();
        
        medicalFileDto.getDetailsDtos().forEach(file -> {
        	Optional<ItemDto> itemDto = items.stream()
        	.filter(item -> item.getId().equals(file.getItemId())).findFirst();
        	file.setDescriptionItem(itemDto.get().getDescription());
        });
        return medicalFileDto;             
    }
    
    public void deleteAll() {
        medicalFileDao.deleteAll();;
    }
    public void deleteById(Integer id) {
        medicalFileDao.deleteById(id);
    }
    public Collection<MedicalFileDto> getAll() {
    	return MedicalFileMapper.convertEntToDtos(medicalFileDao.findAll());        
    }
}
