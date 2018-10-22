package jasmin.merusic.domain;

import java.io.Serializable;

class CryptoForm implements Serializable {

    private Crypto crypto3;

    public Crypto getCrypto() {
        return crypto3;
    }

    public void setCrypto(Crypto crypto3) {
        this.crypto3 = crypto3;
    }
}
