package jasmin.merusic.cryptocurrency.services;

import jasmin.merusic.detailed.Data;
import jasmin.merusic.domain.Crypto;


import java.util.List;
import java.util.Map;

public interface ApiService {

    Map<Integer,Crypto> getCrypto(Integer limit);

    Map<Integer,Crypto> getInDifferentValues(String fiatCurrency);

    Map<Integer,Crypto> getCrypto2(Integer limit);

    Data getInDifferentValues2(Integer idCurrency);


}
