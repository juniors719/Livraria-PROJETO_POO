package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional {
    
    private String watermark;

    public Ebook(Autor autor){
        super(autor);
    }

    public String getWatermark() {
        return watermark;
    }
    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem > 0.15) return false;
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no Ebook");
        return true;
    }
    

}
