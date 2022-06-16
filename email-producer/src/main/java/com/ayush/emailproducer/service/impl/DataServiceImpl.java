package com.ayush.emailproducer.service.impl;

import com.ayush.emailproducer.entities.Data;
import com.ayush.emailproducer.service.DataProducerService;
import com.ayush.emailproducer.service.DataService;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {
    private final DataProducerService dataProducerService;

    public DataServiceImpl(DataProducerService dataProducerService) {
        this.dataProducerService = dataProducerService;
    }

    @Override
    public Long sendData(Data data) {
        try {
            dataProducerService.produce(data);
            return 1L;
        }catch (Exception e){
            e.printStackTrace();
            return 0L;
        }
    }
}
