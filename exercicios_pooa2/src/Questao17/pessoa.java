package Questao17;

import java.net.URL;
import java.util.ArrayList;

public class pessoa {
    private String nome;
    private String cpf;
    private URL foto;
    private String email;
    private disciplina disciplina;

    ArrayList<evento> evento;
    ArrayList<amigo> amigo;

    public pessoa(String nome, String cpf, URL foto, String email, disciplina disciplina, ArrayList<evento> evento,
            ArrayList<amigo> amigo) {
        this.nome = nome;
        this.cpf = cpf;
        this.foto = foto;
        this.email = email;
        this.disciplina = disciplina;
        this.evento = evento;
        this.amigo = amigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public URL getFoto() {
        return foto;
    }

    public void setFoto(URL foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<evento> getEvento() {
        return evento;
    }

    public void setEvento(ArrayList<evento> evento) {
        this.evento = evento;
    }

    public ArrayList<amigo> getAmigo() {
        return amigo;
    }

    public void setAmigo(ArrayList<amigo> amigo) {
        this.amigo = amigo;
    }

}