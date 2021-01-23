package tn.iit.medical.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import tn.iit.medical.dto.FileDetailsDto;
import tn.iit.medical.dto.MedicalFileDto;
import tn.iit.medical.entity.FileDetails;
import tn.iit.medical.entity.MedicalFile;

public class MedicalFileMapper {
	// Medical File Entity --> DTO 
	public static MedicalFileDto convertEntToDto(MedicalFile medicalFile) {		
		MedicalFileDto medicalFileDto = new MedicalFileDto();
		medicalFileDto.setId(medicalFile.getId());
		medicalFileDto.setPatientName(medicalFile.getPatientName());	
		medicalFileDto.setDetailsDtos(convertFileDetailsEntToDtos(medicalFile.getFileDetails()));
		return medicalFileDto;	
	}
	// DTO --> Entity 
	public static MedicalFile convertDtoToEnt(MedicalFileDto medicalFileDto) {
		MedicalFile medicalFile = new MedicalFile();
		medicalFile.setId(medicalFileDto.getId());
		medicalFile.setPatientName(medicalFileDto.getPatientName());		
		medicalFile.setFileDetails(medicalFileDto.getDetailsDtos()
				.stream().map(
						file -> {
						FileDetails details = convertFileDetailsDtoToEnt(file);
						details.setMedicalFile(medicalFile);
						return details;							
						}).collect(Collectors.toList()));
		return medicalFile;		
	}
	// list of Entity -->  list of DTO
	public static Collection<MedicalFileDto> convertEntToDtos(Collection<MedicalFile> medicalFiles) {
		List<MedicalFileDto> medicalFileDtos = new ArrayList<>();
		medicalFiles.forEach(file -> {
			medicalFileDtos.add(convertEntToDto(file));
		});
           return medicalFileDtos;                            
    }
	//*******************************************************
	// FileDetails  list of Entity -->  list of DTO 
	public static List<FileDetailsDto> convertFileDetailsEntToDtos(List<FileDetails> details){
		List<FileDetailsDto> detailsDtos = new ArrayList<>();
		 details.forEach(detail -> {
				 detailsDtos.add(convertFileDetailsEntToDto(detail));
				 } );
		 return detailsDtos;
	 }   
	// FileDetails  Entity --> DTO 
	public static FileDetailsDto convertFileDetailsEntToDto(FileDetails fileDetails) {
		FileDetailsDto fileDetailsDto = new FileDetailsDto();
		fileDetailsDto.setId(fileDetails.getId());
		fileDetailsDto.setItemId(fileDetails.getItemId());
		fileDetailsDto.setUnitPrice(fileDetails.getUnitPrice());
		fileDetailsDto.setQuantity(fileDetails.getQuantity());
		fileDetailsDto.setArrivalDate(fileDetails.getArrivalDate());
		return fileDetailsDto;	
	}
	// DTO --> Entity 
	public static FileDetails convertFileDetailsDtoToEnt(FileDetailsDto fileDetailsDto) {
		FileDetails fileDetails = new FileDetails();
		fileDetails.setId(fileDetailsDto.getId());
		fileDetails.setItemId(fileDetailsDto.getItemId());
		fileDetails.setUnitPrice(fileDetailsDto.getUnitPrice());
		fileDetails.setQuantity(fileDetailsDto.getQuantity());
		fileDetails.setArrivalDate(fileDetailsDto.getArrivalDate());
		return fileDetails;	
	}
	   
}
