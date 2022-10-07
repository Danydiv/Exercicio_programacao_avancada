package Questao3;

public class meioDeTransporte {

	 private int id;
	    private short ano;
	    private String modelo;
	    private Double cargaMaxima;

	    public meioDeTransporte(int id, short ano, String modelo, Double cargaMaxima) {
	        this.id = id;
	        this.ano = ano;
	        this.modelo = modelo;
	        this.cargaMaxima = cargaMaxima;
	    }

		public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public short getAno() {
	        return ano;
	    }

	    public void setAno(short ano) {
	        this.ano = ano;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public Double getCargaMaxima() {
	        return cargaMaxima;
	    }

	    public void setCargaMaxima(Double cargaMaxima) {
	        this.cargaMaxima = cargaMaxima;
	    }
}
