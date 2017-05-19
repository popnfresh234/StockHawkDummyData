package com.udacity.stockhawk.data;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by Alexander on 5/19/2017.
 */

public class HistoricalQuote {
    private BigDecimal closingPrice;
    private Calendar calendar;

    public HistoricalQuote(Calendar calendar, BigDecimal closingPrice) {
        this.closingPrice = closingPrice;
        this.calendar = calendar;
    }

    public BigDecimal getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(BigDecimal closingPrice) {
        this.closingPrice = closingPrice;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
