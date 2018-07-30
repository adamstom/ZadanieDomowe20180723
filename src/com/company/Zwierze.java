package com.company;

public class Zwierze {
    private String imie;
    private Integer wiek;
    public Zwierze(String imie, Integer wiek){
        setImie(imie);
        setWiek(wiek);
        //TODO powiniśmy użyć słowa this
        //np. this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    //TODO metoda toString powinna być na samym dole klasy
    @Override
    public String toString(){
        return("Jestem zwierzęciem o imieniu "+this.getImie()+" i mam "+this.getWiek()+" lat.");
    }
    public void kimJestem(){
        System.out.println("Jestem Zwierzę");
    }
}
