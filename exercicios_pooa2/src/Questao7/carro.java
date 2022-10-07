package Questao7;

import java.util.Date;

public class carro extends item {
    private String chassi;
    private String cor;
    private int anoFabricacao;
    private Date dataEnteada;

    public carro(int codigo, String nome, String descricao, String chassi, String cor, int anoFabricacao,
            Date dataEnteada) {
        super(codigo, nome, descricao);
        this.chassi = chassi;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.dataEnteada = dataEnteada;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Date getDataEnteada() {
        return dataEnteada;
    }

    public void setDataEnteada(Date dataEnteada) {
        this.dataEnteada = dataEnteada;
    }

}