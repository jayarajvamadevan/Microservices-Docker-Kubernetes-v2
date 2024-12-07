package com.Java.microservices.currency_conversion_services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="currency-exchange-service",url="localhost:8000")
//@FeignClient(name="currency-exchange-service")
// CHANGE-KUBERNETES
//@FeignClient(name= "currency-exchange-service", url = "${CURRENCY_EXCHANGE_SERVICE_SERVICE_HOST:http://localhost}:8000")
@FeignClient(name = "currency-exchange-service", url = "${CURRENCY_EXCHANGE_SERVICE_URI:http://localhost}:8000")
public interface    CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public  CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
