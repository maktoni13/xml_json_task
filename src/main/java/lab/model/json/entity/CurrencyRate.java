package lab.model.json.entity;

import java.time.LocalDate;

/**
 * Class Curre
 */
public class CurrencyRate {
    private String r030;
    private String txt;
    private double rate;
    private String cc;
    private String exchangedate;

    public CurrencyRate() {
    }

    public String getR030() {
        return r030;
    }

    public void setR030(String r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "r030='" + r030 + '\'' +
                ", txt='" + txt + '\'' +
                ", rate=" + rate +
                ", cc='" + cc + '\'' +
                ", exchangedate=" + exchangedate +
                '}';
    }
}
