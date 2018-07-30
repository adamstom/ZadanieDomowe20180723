package com.company;

public class Pies extends Zwierze{
    //TODO konstrukotr powinien znajdować się po deklaracji pól w klasie
    public Pies(String imie, Integer wiek) {
        super(imie, wiek);
    }
    private RasyPsow rasa;
    public RasyPsow getRasa() {
        return rasa;
    }

    public void setRasa(RasyPsow rasa) {
        this.rasa = rasa;
    }

    @Override
    public void kimJestem(){
        System.out.println("Jestem Pies");
    }
}
