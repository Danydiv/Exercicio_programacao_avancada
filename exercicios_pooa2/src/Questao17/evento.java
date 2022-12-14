package Questao17;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;

public class evento {
    private String nome;
    private String descricao;
    private Timer horaInicio;
    private Timer horaFim;
    private Date dataInico;
    private Date dataFim;
    private nivelPrioridade nivelPrioridade;

    ArrayList<pessoa> pessoa;

    public evento(String nome, String descricao, Timer horaInicio, Timer horaFim, Date dataInico, Date dataFim,
            nivelPrioridade nivelPrioridade, ArrayList<pessoa> pessoa) {
        this.nome = nome;
        this.descricao = descricao;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.dataInico = dataInico;
        this.dataFim = dataFim;
        this.nivelPrioridade = nivelPrioridade;
        this.pessoa = pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timer getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timer horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Timer getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Timer horaFim) {
        this.horaFim = horaFim;
    }

    public Date getDataInico() {
        return dataInico;
    }

    public void setDataInico(Date dataInico) {
        this.dataInico = dataInico;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public nivelPrioridade getNivelPrioridade() {
        return nivelPrioridade;
    }

    public void setNivelPrioridade(nivelPrioridade nivelPrioridade) {
        this.nivelPrioridade = nivelPrioridade;
    }

    public void compartilharEvento() {
        System.out.println("Retornando m?todo compartilharEvento da classe Evento!");
    }

}
