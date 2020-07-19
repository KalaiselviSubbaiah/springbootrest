package com.hackerrank.stocktrade.controller;

import com.hackerrank.stocktrade.model.Trade;
import com.hackerrank.stocktrade.response.TradeResponse;
import com.hackerrank.stocktrade.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

@RestController
@RequestMapping(value = "/trades")
public class TradesController {

    @Autowired
    TradeService tradeService;

    @RequestMapping(method= RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Trade createNewTrade(@RequestBody String input) {
        tradeService.createNewTrade(input);

        return  null;

    }

    @RequestMapping(method= RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public TradeResponse getAllTrades() {

        return  null;

    }

    @RequestMapping(value = "/{id}",method= RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public TradeResponse findTradeById(@PathVariable int id ) {

        return  null;

    }

    @RequestMapping(value = "/users/{userID}",method= RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public TradeResponse findTradesByUserId(@PathVariable int userID) {

        return  null;

    }

    @RequestMapping(value = "/stocks/{stockSymbol}",method= RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public TradeResponse findTradeStocksByStockSymbol(@PathVariable String  stockSymbol) {

        return  null;

    }

    @RequestMapping(value = "/users/{userID}/stocks/{stockSymbol}"
            ,method= RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public TradeResponse findUserTradeStocksByStockSymbol(@PathVariable int userID,@PathVariable String  stockSymbol) {

        return  null;

    }
}
