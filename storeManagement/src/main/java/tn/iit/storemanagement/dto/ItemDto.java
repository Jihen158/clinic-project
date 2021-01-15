package tn.iit.storemanagement.dto;

public class ItemDto {
    private Integer id;
    private String description;

    public ItemDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
