package com.demo.datasaverapplication.service;

import com.demo.datasaverapplication.entity.DataInfo;
import com.demo.datasaverapplication.repository.elasticsearch.DataInfoElasticsearchRepository;
import com.demo.datasaverapplication.repository.mongo.DataInfoMongoDBRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class DataSaverService {

    private final DataInfoMongoDBRepository mongoRepository;
    
    private final DataInfoElasticsearchRepository elasticsearchRepository;
    
    public void save(String data) {
        log.info("Saving [{}] into MongoDB and Elasticsearch", data);
        DataInfo dataInfo = new DataInfo(data);

        mongoRepository.save(dataInfo);
        elasticsearchRepository.save(dataInfo);
    }

    public void cleanAll() {
        log.info("Removing all records from MongoDB and Elasticsearch");
        mongoRepository.deleteAll();
        elasticsearchRepository.deleteAll();
    }
}
