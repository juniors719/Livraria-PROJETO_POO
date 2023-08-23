package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.AutorNuloException;

public abstract class Livro implements Produto {
    
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    /* @Override
    public void toString(){
        String mensagem = "MOSTRANDO DETALHES DO LIVRO";
        System.out.println(mensagem);
        System.out.println("Nome: "+getNome());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Valor: "+getValor());
        System.out.println("ISBN: "+getIsbn());
        System.out.println("---");

        if(temAutor()){
            getAutor().mostrarDetalhes();
        } 
        System.out.println("---");
    } */

    @Override
    public int compareTo (Produto outro) {
        if (this.getValor() < outro.getValor()) {
            return -1;
        }
        if (this.getValor() > outro.getValor()) {
            return 1;
        }
        return 0;
    }

    public Livro(Autor autor){
        if (autor == null) {
            throw new AutorNuloException("O autor do livro não pode ser nulo");
        }
        this.isbn = "000-00-00000-00-0";
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void mostrarDetalhes() {
        String mensagem = "MOSTRANDO DETALHES DO LIVRO";
        System.out.println(mensagem);
        System.out.println("Nome: "+getNome());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Valor: "+getValor());
        System.out.println("ISBN: "+getIsbn());
        System.out.println("---");

        if(temAutor()){
            getAutor().mostrarDetalhes();
        } 
        
    }

    public abstract boolean aplicaDescontoDe(double porcentagem);

    boolean temAutor(){
        return this.getAutor() != null;
    }

}


