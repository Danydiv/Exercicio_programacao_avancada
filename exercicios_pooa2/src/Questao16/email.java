package Questao16;

public class email{
    private int nomeDoEmail;

    public int getNomeDoEmail() {
        return nomeDoEmail;
    }

    public void setNomeDoEmail(int nomeDoEmail) {
        this.nomeDoEmail = nomeDoEmail;
    }
    public void escrever() {
        System.out.println("retornando m�todo escrever da classe email");
    }

    public void excluir() {
        System.out.println("retornando m�todo excluir da classe email");
    }

    public void anexar() {
        System.out.println("retornando m�todo anexar da classe email");
    }

    public void responder() {
        System.out.println("retornando m�todo responder da classe email");
    }

}