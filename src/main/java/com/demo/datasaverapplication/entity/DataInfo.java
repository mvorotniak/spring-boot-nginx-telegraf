package com.demo.datasaverapplication.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@org.springframework.data.elasticsearch.annotations.Document(indexName = "datainfo")
@Document("dataInfo")
public class DataInfo {

    @Id
    private String id;

    private String info;

    public DataInfo(String info) {
        this.info = info;
    }
    
}
