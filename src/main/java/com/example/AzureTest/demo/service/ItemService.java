package com.example.AzureTest.demo.service;

import com.example.AzureTest.demo.model.Item;
import com.example.AzureTest.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        Iterable<Item> itemsIterable = itemRepository.findAll();
        return StreamSupport.stream(itemsIterable.spliterator(), false)
                .collect(Collectors.toList());
    }
}
