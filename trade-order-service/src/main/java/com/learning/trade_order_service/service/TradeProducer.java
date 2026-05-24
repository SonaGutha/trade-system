package com.learning.trade_order_service.service;

import com.learning.trade_order_service.model.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TradeProducer {

    private static final String TOPIC = "trade-orders";

    @Autowired
    private KafkaTemplate<String, Trade> kafkaTemplate;

    public void sendTrade(Trade trade) {

        kafkaTemplate.send(TOPIC, trade);

        System.out.println("Trade sent: " + trade);
    }
}