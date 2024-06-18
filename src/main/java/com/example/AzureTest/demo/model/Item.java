package com.example.AzureTest.demo.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Container(containerName = "mycontainer")
public class Item {

    @Id
    private String id;
    private String name;

    @PartitionKey
    private String partitionKey;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPartitionKey() {
        return partitionKey;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", partitionKey='" + partitionKey + '\'' +
                '}';
    }
}
