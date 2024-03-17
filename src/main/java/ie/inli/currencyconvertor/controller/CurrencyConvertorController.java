package ie.inli.currencyconvertor.controller;

import java.time.LocalTime;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ie.inli.currencyconvertor.api.v1.CurrencyConvertorApi;
import ie.inli.currencyconvertor.api.v1.model.ExchangeRate;

@RestController
@RequestMapping(value = "/currency-rate/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class CurrencyConvertorController implements CurrencyConvertorApi {
    @Override
    public ResponseEntity<ExchangeRate> getRate(final String from, final String to) {
        ExchangeRate rate = new ExchangeRate();
        rate.setStatus("succss");
        rate.setTimestamp(LocalTime.now().toString());
        rate.setBaseCurrencyCode("EUR");
        rate.setTargetCurrencyCode("USD");
        rate.setRate("1.2345");

        return ResponseEntity.ok(rate);
    }
}
