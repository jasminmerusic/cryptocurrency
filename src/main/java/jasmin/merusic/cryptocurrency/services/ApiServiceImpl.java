package jasmin.merusic.cryptocurrency.services;


import jasmin.merusic.detailed.CryptoDetail;
import jasmin.merusic.detailed.Data;
import jasmin.merusic.domain.Crypto;
import jasmin.merusic.domain.CryptoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



import java.util.Map;

@Service
public class ApiServiceImpl implements ApiService{

    private  RestTemplate restTemplate;

    @Autowired
    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Map<Integer,Crypto> getCrypto(Integer limit) {


        CryptoData cryptoData = restTemplate.getForObject("https://api.coinmarketcap.com/v2/ticker/?convert=USD&limit=" + limit , CryptoData.class);


        return cryptoData.getData();
    }

    @Override
    public Map<Integer, Crypto> getInDifferentValues(String fiatCurrency) {

        CryptoData cryptoData = restTemplate.
                getForObject("https://api.coinmarketcap.com/v2/ticker/?convert=" + fiatCurrency + "&limit=100", CryptoData.class);

        return cryptoData.getData();
    }

    @Override
    public Map<Integer, Crypto> getCrypto2(Integer limit) {
        CryptoData cryptoData = restTemplate.getForObject("https://api.coinmarketcap.com/v2/ticker/?convert=USD&limit=" + limit , CryptoData.class);


        return cryptoData.getData();
    }

    @Override
    public Data getInDifferentValues2(Integer idCurrency) {

        CryptoDetail cryptoData=restTemplate.getForObject("https://api.coinmarketcap.com/v2/ticker/" + idCurrency  + "/?convert=BTC",CryptoDetail.class);

        return cryptoData.getData();
    }
}
