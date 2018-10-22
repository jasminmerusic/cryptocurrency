package jasmin.merusic.domain;

import java.io.Serializable;
import java.util.Map;

public class CryptoData  implements Serializable {
    private static final long serialVersionUID = -4414133031697686349L;
     Map<Integer,Crypto> data;

    public Map<Integer,Crypto> getData() {
        return data;
    }

    public void setData(Map<Integer,Crypto> data) {
        this.data = data;
    }
}
