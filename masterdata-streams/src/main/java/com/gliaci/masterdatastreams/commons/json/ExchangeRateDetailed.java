package com.gliaci.masterdatastreams.commons.json;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class ExchangeRateDetailed
{
  private Long id;
  private Date exchangeRateDate;
  private String fromCurrency;
  private String toCurrency;
  private BigDecimal rate;
  private Date eventDate;

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public Date getExchangeRateDate()
  {
    return exchangeRateDate;
  }

  public void setExchangeRateDate(Date exchangeRateDate)
  {
    this.exchangeRateDate = exchangeRateDate;
  }

  public String getFromCurrency()
  {
    return fromCurrency;
  }

  public void setFromCurrency(String fromCurrency)
  {
    this.fromCurrency = fromCurrency;
  }

  public String getToCurrency()
  {
    return toCurrency;
  }

  public void setToCurrency(String toCurrency)
  {
    this.toCurrency = toCurrency;
  }

  public BigDecimal getRate()
  {
    return rate;
  }

  public void setRate(BigDecimal rate)
  {
    this.rate = rate;
  }

  public Date getEventDate()
  {
    return eventDate;
  }

  public void setEventDate(Date eventDate)
  {
    this.eventDate = eventDate;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    ExchangeRateDetailed that = (ExchangeRateDetailed) o;
    return Objects.equals(id, that.id) && Objects.equals(exchangeRateDate,
                                                         that.exchangeRateDate)
        && Objects.equals(fromCurrency, that.fromCurrency) && Objects.equals(toCurrency,
                                                                             that.toCurrency)
        && Objects.equals(rate, that.rate) && Objects.equals(eventDate, that.eventDate);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, exchangeRateDate, fromCurrency, toCurrency, rate, eventDate);
  }

  @Override public String toString()
  {
    return String.format(
        "ExchangeRateDetailed{id=%d, exchangeRateDate=%s, fromCurrency='%s', toCurrency='%s', rate=%s, eventDate=%s}",
        id,
        exchangeRateDate,
        fromCurrency,
        toCurrency,
        rate,
        eventDate);
  }
}
