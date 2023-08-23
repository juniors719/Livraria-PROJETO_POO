package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.GerenciadorDeCupons;

public class ConsultaDeDescontos {
    
    public static void main(String[] args) {
        
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
        Double desconto = gerenciador.validaCupom("cab11");

        if (desconto != null) {
            System.out.println("Cupom de desconto válido");
            System.out.println("Valor: " + desconto);
        } else {
            System.out.println("Este cupom não existe");
        }

    }

}
