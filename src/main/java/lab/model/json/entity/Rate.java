package lab.model.json.entity;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class Rate {
    @SerializedName("r030")
    private String numberCode; // r030
    @SerializedName("name")
    private String name; // txt
    private double rate; // rate
    @SerializedName("cc")
    private String alfaCode; //cc
    @SerializedName("exchangedate")
    private LocalDate exchangeDate; // exchangedate

    public Rate() {
    }

    public String getNumberCode() {
        return numberCode;
    }

    public void setNumberCode(String numberCode) {
        this.numberCode = numberCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getAlfaCode() {
        return alfaCode;
    }

    public void setAlfaCode(String alfaCode) {
        this.alfaCode = alfaCode;
    }

    public LocalDate getExchangeDate() {
        return exchangeDate;
    }

    public void setExchangeDate(LocalDate exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "numberCode='" + numberCode + '\'' +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", alfaCode='" + alfaCode + '\'' +
                ", exchangeDate=" + exchangeDate +
                '}';
    }
}
