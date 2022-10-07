package Questao15;

public class parceiro extends fisica{

    private String tipoPessoa;
    private Float desempenho;
    public parceiro(String tipoPessoa, Float desempenho) {
        this.tipoPessoa = tipoPessoa;
        this.desempenho = desempenho;
    }
    public String getTipoPessoa() {
        return tipoPessoa;
    }
    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    public Float getDesempenho() {
        return desempenho;
    }
    public void setDesempenho(Float desempenho) {
        this.desempenho = desempenho;
    }
    
    public void cadastrar(){
        System.out.println("cadastrado");


    }
    public void bloquear(){
        System.out.println("bloqueado");

    }
    public void excluir(){
        System.out.println("excluido");

    }
}

