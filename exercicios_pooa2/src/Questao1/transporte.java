package Questao1;

public class transporte {
	private Integer id;
    private Integer ano;
    private String modelo;
    private Double cargaMaxima;
    private Double potencia;

public transporte(Integer id, Integer ano, String modelo, Double cargaMaxima, Double potencia) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.potencia = potencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
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

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public Double consumo() {
        return potencia * cargaMaxima * 100;
    }

    public String leiaModelo() {
        return "Retornando o m�todo leiaModelo da classe Transporte";
    }

    public void gravaModelo(String modelo) {
        System.out.println("Retornando o m�todo gravaModelo da classe Transporte");
    }

}

