package com.company;

public class Kot extends Zwierze{
    public Kot(String imie, Integer wiek) {
        super(imie, wiek);
    }

    private RasyKotow rasa;

    public RasyKotow getRasa() {
        return rasa;
    }

    public void setRasa(RasyKotow rasa) {
        this.rasa = rasa;
    }


    @Override
    public void kimJestem(){
        System.out.println("Jestem Kot");
    }
}
