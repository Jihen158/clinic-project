package tn.iit.medical.dto;

import java.time.LocalDateTime;


public class FileDetailsDto {
    private Integer id;
    private Integer itemId;
    private float unitPrice;
    private LocalDateTime arrivalDate;
    private Integer quantity;
    private String descriptionItem;
    //private MedicalFile medicalFile;
	public FileDetailsDto() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public LocalDateTime getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(LocalDateTime arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getDescriptionItem() {
		return descriptionItem;
	}
	public void setDescriptionItem(String descriptionItem) {
		this.descriptionItem = descriptionItem;
	}

}
