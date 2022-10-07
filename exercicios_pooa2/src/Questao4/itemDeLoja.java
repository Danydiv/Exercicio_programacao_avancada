package Questao4;

public class itemDeLoja 
{
	 private int codigoDoItem;
	    private String nomeDoItem;
	    private String descricaoDoItem;
	    private Double valorDoItem;

	    public itemDeLoja(int codigoDoItem, String nomeDoItem, String descricaoDoItem, Double valorDoItem) {
	        this.codigoDoItem = codigoDoItem;
	        this.nomeDoItem = nomeDoItem;
	        this.descricaoDoItem = descricaoDoItem;
	        this.valorDoItem = valorDoItem;
	    }

	    public int getCodigoDoItem() {
	        return codigoDoItem;
	    }

	    public void setCodigoDoItem(int codigoDoItem) {
	        this.codigoDoItem = codigoDoItem;
	    }

	    public String getNomeDoItem() {
	        return nomeDoItem;
	    }

	    public void setNomeDoItem(String nomeDoItem) {
	        this.nomeDoItem = nomeDoItem;
	    }

	    public String getDescricaoDoItem() {
	        return descricaoDoItem;
	    }

	    public void setDescricaoDoItem(String descricaoDoItem) {
	        this.descricaoDoItem = descricaoDoItem;
	    }

	    public Double getValorDoItem() {
	        return valorDoItem;
	    }

	    public void setValorDoItem(Double valorDoItem) {
	        this.valorDoItem = valorDoItem;
	    }

	    public int getIdentificador(){
	        return codigoDoItem;
	    }

}
