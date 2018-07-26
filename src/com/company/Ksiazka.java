package com.company;

public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private String wydawnictwo;

    public Ksiazka(String tytul, String autor, int liczbaStron, String wydawnictwo) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.wydawnictwo = wydawnictwo;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }
    public String toString(){
        return("tytuł: "+this.tytul+", autor: "+this.autor+", liczba stron: "+this.liczbaStron+", wydawnictwo: "+this.wydawnictwo);
    }
}
