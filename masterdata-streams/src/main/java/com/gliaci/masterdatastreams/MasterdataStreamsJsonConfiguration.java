package com.gliaci.masterdatastreams;

import com.gliaci.masterdatastreams.commons.json.ExchangeRate;
import com.gliaci.masterdatastreams.commons.json.ExchangeRateDetailed;
import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.function.Function;

@Configuration
public class MasterdataStreamsJsonConfiguration
{
    private static final Logger LOGGER = LoggerFactory.getLogger(MasterdataStreamsJsonConfiguration.class);

    @Bean
    public Function<KStream<String, ExchangeRate>, KStream<String, ExchangeRateDetailed>> process()
    {
        return exchangeRateKStream -> (
            exchangeRateKStream
                .mapValues(exchangeRate -> toExchangeRateDetailed(exchangeRate))
                .peek(this::logKeyValue)
        );
    }

    private ExchangeRateDetailed toExchangeRateDetailed(ExchangeRate exchangeRate) {
        ExchangeRateDetailed exchangeRateDetailed = new ExchangeRateDetailed();
        exchangeRateDetailed.setId(exchangeRate.id);
        exchangeRateDetailed.setExchangeRateDate(exchangeRate.exchangeRateDate);
        exchangeRateDetailed.setFromCurrency(exchangeRate.fromCurrency);
        exchangeRateDetailed.setToCurrency(exchangeRate.toCurrency);
        exchangeRateDetailed.setRate(exchangeRate.rate);
        exchangeRateDetailed.setEventDate(new Date());
        return exchangeRateDetailed;
    }

    private void logKeyValue(String key, Object value) {
        LOGGER.info("==> key: {}, value: {}", key, value);
    }
}
