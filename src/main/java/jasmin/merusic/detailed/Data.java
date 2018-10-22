package jasmin.merusic.detailed;

import java.io.Serializable;
import java.util.Map;

public class Data implements Serializable
{

    private Integer id;
    private String name;
    private String symbol;
    private String website_slug;
    private Integer rank;
    private Double circulating_supply;
    private Double total_supply;
    private Double max_supply;
    private Map<String,USD> quotes;
    private Integer lastUpdated;
    private final static long serialVersionUID = -6473084660888555303L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getWebsite_slug() {
        return website_slug;
    }

    public void setWebsite_slug(String website_slug) {
        this.website_slug = website_slug;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Double getCirculating_supply() {
        return circulating_supply;
    }

    public void setCirculating_supply(Double circulating_supply) {
        this.circulating_supply = circulating_supply;
    }

    public Double getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(Double total_supply) {
        this.total_supply = total_supply;
    }

    public Double getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(Double max_supply) {
        this.max_supply = max_supply;
    }

    public Map<String, USD> getQuotes() {
        return quotes;
    }

    public void setQuotes(Map<String, USD> quotes) {
        this.quotes = quotes;
    }

    public Integer getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Integer lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
