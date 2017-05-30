package tech.pratikacharya.apps.messaging.domain;

import java.time.LocalDate;

/**
 * Created by Pratik Acharya on 5/30/2017.
 */
public class Rate {
    private String code;
    private double rate;
    private LocalDate date;

    public Rate(){};

    public Rate(String base, double rate, LocalDate date){
        this.code = base;
        this.rate = rate;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rate{");
        sb.append("code='").append(code).append('\'');
        sb.append(", rate=").append(rate);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
