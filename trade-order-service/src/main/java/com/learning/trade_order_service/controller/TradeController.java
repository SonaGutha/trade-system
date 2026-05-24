package com.learning.trade_order_service.controller;

import com.learning.trade_order_service.model.Trade;
import com.learning.trade_order_service.service.TradeProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/trade")
public class TradeController {

    @Autowired
    private TradeProducer producer;

    @PostMapping
    public String createTrade(@RequestBody Trade trade) {

        trade.setTradeId(UUID.randomUUID().toString());

        producer.sendTrade(trade);

        return "Trade sent successfully";
    }
}