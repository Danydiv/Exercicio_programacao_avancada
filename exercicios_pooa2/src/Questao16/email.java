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
        System.out.println("retornando método escrever da classe email");
    }

    public void excluir() {
        System.out.println("retornando método excluir da classe email");
    }

    public void anexar() {
        System.out.println("retornando método anexar da classe email");
    }

    public void responder() {
        System.out.println("retornando método responder da classe email");
    }

}