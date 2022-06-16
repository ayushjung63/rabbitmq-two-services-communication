package com.ayush.emailproducer.service;

import com.ayush.emailproducer.entities.Data;

public interface DataProducerService {
    void produce(Data data) throws Exception;
}
