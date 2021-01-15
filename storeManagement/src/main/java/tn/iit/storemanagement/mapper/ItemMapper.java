package tn.iit.storemanagement.mapper;

import tn.iit.storemanagement.dto.ItemDto;
import tn.iit.storemanagement.entity.Item;

import java.util.ArrayList;
import java.util.Collection;

public class ItemMapper {
    public static ItemDto convertItemToItemDto(Item item){
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setDescription(item.getDescription());
        return itemDto;
    }
    public static Item convertItemDtoToItem(ItemDto itemDto){
        Item item = new Item();
        item.setId(itemDto.getId());
        item.setDescription(itemDto.getDescription());
        return item;
    }
    public static Collection<ItemDto> convertItemsToDto(Collection<Item> items){
        Collection<ItemDto> itemDtos = new ArrayList<>();
        items.forEach(item -> {
            itemDtos.add(convertItemToItemDto(item));
        });
        return itemDtos;
    }
}
