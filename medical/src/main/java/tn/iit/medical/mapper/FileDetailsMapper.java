package tn.iit.medical.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import tn.iit.medical.dto.FileDetailsDto;
import tn.iit.medical.entity.FileDetails;

public class FileDetailsMapper {
	// FileDetails  Entity --> DTO 
	public static FileDetailsDto convertFDEToFDDto(FileDetails fileDetails) {
		FileDetailsDto fileDetailsDto = new FileDetailsDto();
		fileDetailsDto.setId(fileDetails.getId());
		fileDetailsDto.setItemId(fileDetails.getItemId());
		fileDetailsDto.setUnitPrice(fileDetails.getUnitPrice());
		fileDetailsDto.setQuantity(fileDetails.getQuantity());
		fileDetailsDto.setArrivalDate(fileDetails.getArrivalDate());
		return fileDetailsDto;	
	}
	// DTO --> Entity 
	public static FileDetails convertFDDtoToFDE(FileDetailsDto fileDetailsDto) {
		FileDetails fileDetails = new FileDetails();
		fileDetails.setId(fileDetailsDto.getId());
		fileDetails.setItemId(fileDetailsDto.getItemId());
		fileDetails.setUnitPrice(fileDetailsDto.getUnitPrice());
		fileDetails.setQuantity(fileDetailsDto.getQuantity());
		fileDetails.setArrivalDate(fileDetailsDto.getArrivalDate());
		return fileDetails;	
	}
	// FileDetails  list of Entity -->  list of DTO 
	public static List<FileDetailsDto> convertFDEToFDDtos(List<FileDetails> fileDetails){
		List<FileDetailsDto> detailsDtos = new ArrayList<>();
		 fileDetails.forEach(
				 detail -> {
					 detailsDtos.add(convertFDEToFDDto(detail));
				 } );
		 return detailsDtos;
	 }
}
