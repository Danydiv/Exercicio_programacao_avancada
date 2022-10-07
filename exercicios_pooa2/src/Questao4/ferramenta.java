package Questao4;

public class ferramenta extends itemDeLoja {
    private String categoria;
    private Integer serial;
    
    public ferramenta(int codigoDoItem, String nomeDoItem, String descricaoDoItem, Double valorDoItem, String categoria,
            Integer serial) {
        super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
        this.categoria = categoria;
        this.serial = serial;
    }
    
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Integer getSerial() {
        return serial;
    }
    public void setSerial(Integer serial) {
        this.serial = serial;
    }
    public int getIdentificador(){
        return serial;
    }
}
