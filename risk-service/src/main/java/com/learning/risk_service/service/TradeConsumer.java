package com.learning.risk_service.service;

import com.learning.risk_service.model.Trade;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TradeConsumer {

    @KafkaListener(topics = "trade-orders", groupId = "risk-group")
    public void consumeTrade(Trade trade) {

        System.out.println("Received Trade: " + trade);

        if (trade.getQuantity() > 1000) {
            System.out.println("TRADE REJECTED");
        } else {
            System.out.println("TRADE APPROVED");
        }
    }
}