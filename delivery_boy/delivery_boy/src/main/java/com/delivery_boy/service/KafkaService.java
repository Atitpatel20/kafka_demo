package com.delivery_boy.service;

import com.delivery_boy.config.AppConstans;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class KafkaService {
    private Logger logger =LoggerFactory.getLogger(KafkaService.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLoaction(String locaction) {

            this.kafkaTemplate.send(AppConstans.LOCATION_TOPIC_NAME, locaction);
            this.logger.info("message1 produced");
        return true;
    }
}
