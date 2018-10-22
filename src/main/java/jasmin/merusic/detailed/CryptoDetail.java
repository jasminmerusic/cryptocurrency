
package jasmin.merusic.detailed;

import java.io.Serializable;

public class CryptoDetail implements Serializable
{

    private Data data;

    private final static long serialVersionUID = 2785183952016525113L;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


}
