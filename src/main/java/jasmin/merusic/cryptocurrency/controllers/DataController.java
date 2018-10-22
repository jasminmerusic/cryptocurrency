package jasmin.merusic.cryptocurrency.controllers;

import jasmin.merusic.cryptocurrency.services.ApiService;
import jasmin.merusic.cryptocurrency.wrap.Fiat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Controller
public class DataController {

  private  ApiService apiService;

    public DataController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping(value = {"/values","/values/","", "/", "/index","/cryptos"} )
    public String index(Model model){

        model.addAttribute("cryptos",apiService.getCrypto(100));

        return "index";
    }
    @ModelAttribute
    public void addModelAttribute(Map<String, Object> model) {
        model.put("fiat", new Fiat());

    }


    @PostMapping(value = "/values/fiatCurrency")
    public String choseCurrency(Model model,
                                @ModelAttribute Fiat fiat) {
          model.addAttribute("cryptos", apiService.getInDifferentValues(fiat.getFiatCurrency()));
        return "index";
    }
}
