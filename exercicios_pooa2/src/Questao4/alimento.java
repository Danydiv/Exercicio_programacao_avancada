package Questao4;


public class alimento extends itemDeLoja {

	    private Integer selo;

	    public alimento(Integer codigoDoItem, String nomeDoItem, String descricaoDoItem, Double valorDoItem, Integer selo) {
	        super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
	        this.selo = selo;
	    }

	    public Integer getSelo() {
	        return selo;
	    }

	    public void setSelo(Integer selo) {
	        this.selo = selo;
	    }

	    public int getIdentificador() {
	        return selo;
	    }

	}

