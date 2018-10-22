package jasmin.merusic.cryptocurrency.services;


import jasmin.merusic.domain.Crypto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService  apiService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetCrypto()throws Exception{
        Map<Integer,Crypto> cryptos=apiService.getCrypto(3);

        assertEquals(3,cryptos.size());
    }

}