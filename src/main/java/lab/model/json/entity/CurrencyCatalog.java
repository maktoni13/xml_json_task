package lab.model.json.entity;

import java.util.ArrayList;
import java.util.List;

public class CurrencyCatalog {
    private List<CurrencyRate> rates;

    public CurrencyCatalog() {
        rates = new ArrayList<>();
    }

    public List<CurrencyRate> getRates() {
        return rates;
    }

    public void setRates(List<CurrencyRate> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "CurrencyCatalog{" +
                "rates=" + rates +
                '}';
    }
}
