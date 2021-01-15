package tn.iit.storemanagement.service;

import org.springframework.stereotype.Service;
import tn.iit.storemanagement.dao.ItemDao;
import tn.iit.storemanagement.dto.ItemDto;
import tn.iit.storemanagement.entity.Item;
import tn.iit.storemanagement.mapper.ItemMapper;

import java.util.Collection;
import java.util.Optional;

@Service
public class ItemService {
    private ItemDao itemDao;

    public ItemService(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public void save(ItemDto itemDto) {
        Item item = ItemMapper.convertItemDtoToItem(itemDto);
        itemDao.saveAndFlush(item);
    }

    public ItemDto getById(Integer id) {
        Optional<Item> opt = itemDao.findById(id);
        ItemDto itemDto = ItemMapper.convertItemToItemDto(opt.get());

        if (opt.isPresent()) {
            return itemDto;
        } else {
            return null;
        }
    }

    public void update(ItemDto itemDto) {
        Item item = ItemMapper.convertItemDtoToItem(itemDto);
        itemDao.saveAndFlush(item);
    }

    public void deleteById(Integer id) {
        itemDao.deleteById(id);
    }

    public Collection<ItemDto> findAll() {
        Collection<Item> items = itemDao.findAll();
        return ItemMapper.convertItemsToDto(items);
    }
}
