package Questao17;

import java.net.URL;
import java.util.ArrayList;

public class usuario extends pessoa {
    private String login;
    private String senha;

    public usuario(String nome, String cpf, URL foto, String email, disciplina disciplina, ArrayList<evento> evento,
            ArrayList<amigo> amigo, String login, String senha) {
        super(nome, cpf, foto, email, disciplina, evento, amigo);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}