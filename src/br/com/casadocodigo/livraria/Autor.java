package br.com.casadocodigo.livraria;
public class Autor {

    private String nome;
    private String email;
    private String cpf;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarDetalhes() {
        String mensagem = "MOSTRANDO DETALHES DO AUTOR";
        System.out.println(mensagem);
        System.out.println("Nome: "+getNome());
        System.out.println("Email: "+getEmail());
        System.out.println("CPF: "+getCpf());
        System.out.println("---");
    }
}
