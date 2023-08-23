package br.com.casadocodigo.livraria;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {
    
    private Map<String, Double> cupons;
    
    public GerenciadorDeCupons() {
        this.cupons = new HashMap<>();
        this.cupons.put("cab11", 10.0);
        this.cupons.put("cab22", 12.0);
        this.cupons.put("cab33", 13.0);
        this.cupons.put("cab44", 14.0);
    }

    public Double validaCupom(String cupom) {
        return this.cupons.get(cupom);
    }



}
