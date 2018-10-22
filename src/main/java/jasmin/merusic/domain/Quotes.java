
package jasmin.merusic.domain;

import java.io.Serializable;

public class Quotes implements Serializable
{

    private USD USD;
    private final static long serialVersionUID = 5651619642935185269L;

    public USD getUsd() {
        return USD;
    }

    public void setUsd(USD USD) {
        this.USD = USD;
    }

}
