package Questao14;


import java.util.ArrayList;

public class dadosImplement implements dados {
    private ArrayList<transporte> lista = new ArrayList<>();

    @Override
    public void adicionar(transporte t){
        lista.add(t);
    }

    @Override
    public void excluir(transporte t){
        lista.remove(t);
    }
}

