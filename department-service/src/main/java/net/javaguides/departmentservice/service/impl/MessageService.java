package net.javaguides.departmentservice.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(id = "employeeGroup", topics = "employeeTopic")
    public void listen(String msg) {
        logger.info("Received: {}", msg);
    }

}
