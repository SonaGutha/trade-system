package com.learning.risk_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trade {

    private String tradeId;
    private String symbol;
    private int quantity;
    private double price;
    private String type;
}