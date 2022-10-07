package Questao16;

public class arquivos {
    private String nomeArquivo;
    private int tamanho;
    private String formato;
    public arquivos(String nomeArquivo, int tamanho, String formato) {
        this.nomeArquivo = nomeArquivo;
        this.tamanho = tamanho;
        this.formato = formato;
    }
    public String getNomeArquivo() {
        return nomeArquivo;
    }
    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public void anexar(){

    }
    public void remover(){
        
    }
}
