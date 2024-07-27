package com.demo.datasaverapplication.repository.elasticsearch;

import com.demo.datasaverapplication.entity.DataInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface DataInfoElasticsearchRepository extends ElasticsearchRepository<DataInfo, String> {
}
