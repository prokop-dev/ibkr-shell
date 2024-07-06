package dev.prokop.ibkr.webapi.model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class HistoricalMarketDataSetTest {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            ;

    private HistoricalMarketDataSet historicalMarketDataSet;

    @BeforeEach
    void setUp() throws IOException {
        InputStream inputStream = HistoricalMarketDataSetTest.class.getResourceAsStream("/http-captures/GET-hmds-history.json");
        this.historicalMarketDataSet = objectMapper.readValue(inputStream, HistoricalMarketDataSet.class);
    }

    @Test
    void getData() {
        assertEquals(10, historicalMarketDataSet.getData().size());
        historicalMarketDataSet.getData().forEach(System.out::println);
    }

    @Test
    void getSize() {
        assertEquals(10, historicalMarketDataSet.getSize());
    }

}