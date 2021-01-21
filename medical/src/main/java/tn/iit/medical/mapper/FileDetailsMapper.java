package tn.iit.medical.mapper;

import java.util.ArrayList;
import java.util.Collection;

import tn.iit.medical.dto.FileDetailsDto;
import tn.iit.medical.entity.FileDetails;

public class FileDetailsMapper {
	
	public static FileDetailsDto convertFDEToFDDto(FileDetails fileDetails) {
		FileDetailsDto fileDetailsDto = new FileDetailsDto();
		fileDetailsDto.setId(fileDetails.getId());
		fileDetailsDto.setItemId(fileDetails.getItemId());
		fileDetailsDto.setUnitPrice(fileDetails.getUnitPrice());
		fileDetailsDto.setQuantity(fileDetails.getQuantity());
		fileDetailsDto.setArrivalDate(fileDetails.getArrivalDate());
		//fileDetails.setMedicalFile(fileDetailsDto.getMedicalFile());
		return fileDetailsDto;	
	}
	public static FileDetails convertFDDtoToFDE(FileDetailsDto fileDetailsDto) {
		FileDetails fileDetails = new FileDetails();
		fileDetails.setId(fileDetailsDto.getId());
		fileDetails.setItemId(fileDetailsDto.getItemId());
		fileDetails.setUnitPrice(fileDetailsDto.getUnitPrice());
		fileDetails.setQuantity(fileDetailsDto.getQuantity());
		fileDetails.setArrivalDate(fileDetailsDto.getArrivalDate());
		//fileDetails.setMedicalFile(fileDetailsDto.getMedicalFile());
		return fileDetails;	
	}
	public static Collection<FileDetailsDto> convertFDEToFDDtos(Collection<FileDetails> details){
		 Collection<FileDetailsDto> detailsDtos = new ArrayList<>();
		 details.forEach(
				 detail -> {
					 detailsDtos.add(convertFDEToFDDto(detail));
				 } );
		 return detailsDtos;
	 }
}
