package Questao6;

import java.util.Date;

public class funcionario {
	 private Integer matricula;
	    private String nomeCompleto;
	    private String cpf;
	    private Date dataNascimento;
	    private String sexo;
	    private double salario;
	    private int telefone;

	    public funcionario(Integer matricula, String nomeCompleto, String cpf, Date dataNascimento, String sexo,
	            double salario, int telefone) {
	        this.matricula = matricula;
	        this.nomeCompleto = nomeCompleto;
	        this.cpf = cpf;
	        this.dataNascimento = dataNascimento;
	        this.sexo = sexo;
	        this.salario = salario;
	        this.telefone = telefone;
	    }

	    public Integer getMatricula() {
	        return matricula;
	    }

	    public void setMatricula(Integer matricula) {
	        this.matricula = matricula;
	    }

	    public String getNomeCompleto() {
	        return nomeCompleto;
	    }

	    public void setNomeCompleto(String nomeCompleto) {
	        this.nomeCompleto = nomeCompleto;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    public Date getDataNascimento() {
	        return dataNascimento;
	    }

	    public void setDataNascimento(Date dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }

	    public String getSexo() {
	        return sexo;
	    }

	    public void setSexo(String sexo) {
	        this.sexo = sexo;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public int getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(int telefone) {
	        this.telefone = telefone;
	    }


}
