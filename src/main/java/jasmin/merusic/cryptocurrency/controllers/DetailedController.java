package jasmin.merusic.cryptocurrency.controllers;

import jasmin.merusic.cryptocurrency.services.ApiService;
import jasmin.merusic.cryptocurrency.wrap.Detailed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

import java.util.Map;

@Controller
public class DetailedController {

    private ApiService apiService;

    public DetailedController(ApiService apiService) {
        this.apiService = apiService;
    }

    @ModelAttribute
    public void addModelAttribute(Map<String, Object> model) {
        model.put("detailed", new Detailed());
    }

    @GetMapping(value = {"/values2/{id}"} )
    public String index2(Model model, @PathVariable Integer id){

        model.addAttribute("valueBTC", apiService.getInDifferentValues2(id));

        return "nesto";
    }

    @PostMapping(value = "/values/detailedCurrency")
    public String detailCurrency(Model model,
                                 ServerWebExchange serverWebExchange) {

        MultiValueMap<String, String> map = serverWebExchange.getFormData().block();

        Integer idCurrency = Integer.valueOf(map.get("idCurrency").get(0));
        if(idCurrency == null || idCurrency == 0){

            idCurrency = 1;
        }

        model.addAttribute("valueBTC", apiService.getInDifferentValues2(idCurrency));
        return "nesto";
    }
}
