package com.example.AzureTest.demo.repository;


import com.example.AzureTest.demo.model.Item;
import org.springframework.stereotype.Repository;
import com.azure.spring.data.cosmos.repository.CosmosRepository;

@Repository
public interface ItemRepository extends CosmosRepository<Item, String> {
}

