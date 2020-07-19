package com.hackerrank.stocktrade.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackerrank.stocktrade.model.Trade;
import com.hackerrank.stocktrade.repository.TradeRepository;
import com.hackerrank.stocktrade.response.TradeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    public Trade createNewTrade(String input) {

        ObjectMapper objectMapper = new ObjectMapper();
        Trade response = null;

        try {
            Trade trade = objectMapper.readValue(input, Trade.class);
            response = tradeRepository.save(trade);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;

    }
}
