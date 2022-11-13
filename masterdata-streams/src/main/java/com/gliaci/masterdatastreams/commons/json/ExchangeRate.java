package com.gliaci.masterdatastreams.commons.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class ExchangeRate
{
  @JsonProperty("ID")
  public Long id;
  @JsonProperty("EXCHANGE_RATE_DATE")
  public Date exchangeRateDate;
  @JsonProperty("FROM_CURRENCY")
  public String fromCurrency;
  @JsonProperty("TO_CURRENCY")
  public String toCurrency;
  @JsonProperty("RATE")
  public BigDecimal rate;
  @JsonProperty("LAST_UPDATE")
  public Date lastUpdate;

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    ExchangeRate that = (ExchangeRate) o;
    return Objects.equals(id, that.id) && Objects.equals(exchangeRateDate,
                                                         that.exchangeRateDate)
        && Objects.equals(fromCurrency, that.fromCurrency) && Objects.equals(toCurrency,
                                                                             that.toCurrency)
        && Objects.equals(rate, that.rate) && Objects.equals(lastUpdate, that.lastUpdate);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, exchangeRateDate, fromCurrency, toCurrency, rate, lastUpdate);
  }

  @Override public String toString()
  {
    return String.format(
        "ExchangeRate{id=%d, exchangeRateDate=%s, fromCurrency='%s', toCurrency='%s', rate=%s, lastUpdate=%s}",
        id,
        exchangeRateDate,
        fromCurrency,
        toCurrency,
        rate,
        lastUpdate);
  }
}
