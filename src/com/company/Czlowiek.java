package com.company;

public class Czlowiek {
    private String imie;
    private String nazwisko;
    private Zwierze zwierze;
    private DaneAdresowe daneAdresowe;

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Zwierze getZwierze() {
        return zwierze;
    }

    public void setZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }

    public DaneAdresowe getDaneAdresowe() {
        return daneAdresowe;
    }

    public void setDaneAdresowe(DaneAdresowe daneAdresowe) {
        this.daneAdresowe = daneAdresowe;
    }
    public void autoprezentacja(){
        System.out.print("Cześć nazywam się "+this.getImie()+" "+this.getNazwisko()+".");
    }
    public void autoprezentacja(String komentarz){
        this.autoprezentacja();
        System.out.print(komentarz);
    }
}
