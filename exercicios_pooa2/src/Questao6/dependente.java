package Questao6;

import java.util.Date;

public class dependente extends funcionario {
    private int sequencial;
    private boolean participaPlano;

    public dependente(Integer matricula, String nomeCompleto, String cpf, Date dataNascimento, String sexo,
            double salario, int telefone, int sequencial, boolean participaPlano) {
        super(matricula, nomeCompleto, cpf, dataNascimento, sexo, salario, telefone);
        this.sequencial = sequencial;
        this.participaPlano = participaPlano;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public boolean isParticipaPlano() {
        return participaPlano;
    }

    public void setParticipaPlano(boolean participaPlano) {
        this.participaPlano = participaPlano;
    }

}
