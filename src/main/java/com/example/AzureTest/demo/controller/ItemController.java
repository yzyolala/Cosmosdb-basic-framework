package com.example.AzureTest.demo.controller;

import com.example.AzureTest.demo.model.Item;
import com.example.AzureTest.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        System.out.println("Received POST request with item: " + item);
        return itemService.saveItem(item);
    }

    @GetMapping
    public List<Item> getAllItems() {
        System.out.println("Received GET request for all items");
        return itemService.getAllItems();
    }
}
