package AvaiacaoPainelAbas;


public class Item {
    private String tipo;
    private String produto;
    private String valor;
    private String desconto;
    
    public Item(String tipo, String produto, String valor, String desconto){
        
        this.tipo = tipo;
        this.produto = produto;
        this.valor = valor;
        this.desconto = desconto;
            
    }

    public String getTipo() {
        return tipo;
    }

    public String getProduto() {
        return produto;
    }

    public String getValor() {
        return valor;
    }

    public String getDesconto() {
        return desconto;
    }
    
    
}
