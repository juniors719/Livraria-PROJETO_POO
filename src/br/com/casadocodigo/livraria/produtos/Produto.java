package br.com.casadocodigo.livraria.produtos;
// @FunctionalInterface
public interface Produto extends Comparable<Produto> {

    double getValor();
    
}
