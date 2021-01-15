package tn.iit.storemanagement.controller;


import org.springframework.web.bind.annotation.*;
import tn.iit.storemanagement.dto.ItemDto;
import tn.iit.storemanagement.service.ItemService;

import java.util.Collection;

@RestController
@RequestMapping("/api/item")
public class ItemController {
    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public void createItem(@RequestBody ItemDto itemDto) {
        itemService.save(itemDto);
    }

    @GetMapping
    public Collection<ItemDto> getItems() {
        return itemService.findAll();
    }

    @PutMapping
    public void updateItem(@RequestBody ItemDto itemDto) {
        itemService.update(itemDto);
    }

    @DeleteMapping("/{id}")
    public void deleteItemById(@PathVariable("id") Integer id) {
        itemService.deleteById(id);
    }

    @GetMapping("/{id}")
    public ItemDto getItem(@PathVariable("id") Integer id) {
        return itemService.getById(id);
    }

}
