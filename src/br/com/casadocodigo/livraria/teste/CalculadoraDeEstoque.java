package br.com.casadocodigo.livraria.teste;
public class CalculadoraDeEstoque {
    public static void main(String[] args) {

        double soma = 0;

        for (double i = 0; i < 35; i++) {
            soma += 59.90;
        }

        System.out.println("O total em estoque é "+soma);

        // double = representar numero ponto flutuante
        // representar um inteiro: byte, short, int ou long

        // boolean -> 1 bit
        // byte -> 1 byte
        // short -> 2 bytes
        // char -> 2 bytes
        // int -> 4 bytes
        // float -> 4 bytes
        // long -> 8 bytes
        // double -> 8 bytes


        // CONDICIONAIS

        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >= 2000){
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom!");
        }

        // OPERADOR TERNÁRIO

        // double valor = 0;
        // if (v1 > v2) {
        //     valor = 100;
        // } else {
        //     valor = 0;
        // }

        // É IGUAL A:

        // double valor = v1 > v2 ? 100 : 0;

        
        

    }
}
