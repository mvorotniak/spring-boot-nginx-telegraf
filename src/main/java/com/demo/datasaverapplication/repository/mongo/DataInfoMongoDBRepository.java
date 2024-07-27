package com.demo.datasaverapplication.repository.mongo;

import com.demo.datasaverapplication.entity.DataInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataInfoMongoDBRepository extends MongoRepository<DataInfo, String> {
}
