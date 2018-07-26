package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.company.OperacjeNaStringu.czyStringJestPalindromem;

public class Main {

    public static void main(String[] args) {
	// write your code here
//     Klasy i dziedziczenie
        System.out.println("Klasy i dziedziczenie");
//     Zadanie 1
        System.out.println("Zadanie 1");
        Pies pies = new Pies("Azor",2);
        System.out.println(pies.toString());
        Kot kot = new Kot("Mruczek", 4);
        System.out.println(kot.toString());
//     Zadanie 2
        System.out.println("Zadanie 2");
        pies.kimJestem();
        kot.kimJestem();
//     Zadanie 3 i 4
        System.out.println("Zadanie 3 i 4");
        Czlowiek czlowiek1 = new Czlowiek("Jan", "Kowalski");
        czlowiek1.setZwierze(pies);
        Czlowiek czlowiek2 = new Czlowiek("Anna", "Nowak");
        czlowiek2.setZwierze(kot);
//     Zadanie 5
        System.out.println("Zadanie 5");
        czlowiek1.autoprezentacja();
        System.out.println();
        czlowiek1.autoprezentacja("Kocham zwierzęta.");
//     LISTY
        System.out.println("LISTY");
//     Zadanie 6
        System.out.println("Zadanie 6");
        List<String> listaStringow = new ArrayList<>();
        for(int i=0;i<10;i++){
            listaStringow.add("pozycja "+i);
        }
        System.out.println("Wyświeltenie listy za pomocą pętli for");
        for(int i=0; i<listaStringow.size();i++){
            System.out.println(listaStringow.get(i));
        }
        System.out.println("Wyświeltenie listy za pomocą pętli for each");
        for(String pozycja : listaStringow){
            System.out.println(pozycja);
        }
//      Zadanie 7
        System.out.println("Zadanie 7");
        Integer tablicaIntegerow[] = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        List listaIntegerow = Arrays.asList(tablicaIntegerow);
        for(Object j : listaIntegerow){
            System.out.println(j);
        }
        System.out.println("Wielkość powyższej listy to "+listaIntegerow.size()+" pozycji.");
//        tak stworzona lista jest traktowana jako tablica i nie można usówać w niej elemontów jak w normalnej liście
//        listaIntegerow.remove(0);
//        listaIntegerow.remove(listaIntegerow.size()-1);
        System.out.println("tak stworzona lista jest traktowana jako tablica i nie można usówać w niej elemontów jak w normalnej liście");
        System.out.println("Chyba że źle zrozumiałem polecenie:  Do listy dodajemy 15 elementów poprzez wykorzystanie Arrays.asList () ");
//        System.out.println("Po usunięciu 1 i ostatniej pozycji wielkość powyższej listy to "+listaIntegerow.size()+" pozycji.");

//        Zadanie 8
        System.out.println("Zadanie 8");
        Ksiazka ksiazka1 = new Ksiazka("Tytuł1","Autor1",100,"Wydawnictwo1");
        Ksiazka ksiazka2 = new Ksiazka("Tytuł2","Autor2",200,"Wydawnictwo2");
        Ksiazka ksiazka3 = new Ksiazka("Tytuł3","Autor3",10,"Wydawnictwo3");
        Ksiazka ksiazka4 = new Ksiazka("Tytuł4","Autor4",1000,"Wydawnictwo4");
        Ksiazka ksiazka5 = new Ksiazka("Tytuł5","Autor5",104,"Wydawnictwo5");
        Ksiazka ksiazka6 = new Ksiazka("Tytuł6","Autor6",300,"Wydawnictwo6");
        Ksiazka ksiazka7 = new Ksiazka("Tytuł7","Autor7",144,"Wydawnictwo7");
        Ksiazka ksiazka8 = new Ksiazka("Tytuł8","Autor8",560,"Wydawnictwo8");
        Ksiazka ksiazka9 = new Ksiazka("Tytuł9","Autor9",30,"Wydawnictwo9");
        Ksiazka ksiazka10 = new Ksiazka("Tytuł10","Autor10",12,"Wydawnictwo10");
        Ksiazka ksiazka11 = new Ksiazka("Tytuł11","Autor11",450,"Wydawnictwo11");

        List<Ksiazka> listaKsiazek = new ArrayList<>();
        listaKsiazek.add(ksiazka1);
        listaKsiazek.add(ksiazka2);
        listaKsiazek.add(ksiazka3);
        listaKsiazek.add(ksiazka4);
        listaKsiazek.add(ksiazka5);
        listaKsiazek.add(ksiazka6);
        listaKsiazek.add(ksiazka7);
        listaKsiazek.add(ksiazka8);
        listaKsiazek.add(ksiazka9);
        listaKsiazek.add(ksiazka10);
        listaKsiazek.add(ksiazka11);
        for (Ksiazka ksiazka : listaKsiazek) {
            System.out.println(ksiazka.toString());
        }
        System.out.println("usuwamy środkowy element listy");
        listaKsiazek.remove(listaKsiazek.size()/2);
        for (Ksiazka ksiazka : listaKsiazek) {
            System.out.println(ksiazka.toString());
        }
        System.out.println("Teraz wielkość listy książek jest równa: "+listaKsiazek.size());
        System.out.println("Książki mające powyżej 200 stron to:");
        for (Ksiazka ksiazka : listaKsiazek) {
            if(ksiazka.getLiczbaStron()>200) {
                System.out.println(ksiazka.toString());
            }
        }
//        Zadanie 9
        System.out.println("Zadanie 9");
        Ksiazka ksiazka12 = new Ksiazka("Tytuł12","Autor12",40,"Wydawnictwo12");
        Ksiazka ksiazka13 = new Ksiazka("Tytuł13","Autor13",50,"Wydawnictwo13");
        Ksiazka ksiazka14 = new Ksiazka("Tytuł14","Autor14",45,"Wydawnictwo14");
        Ksiazka ksiazka15 = new Ksiazka("Tytuł15","Autor15",540,"Wydawnictwo15");

        List<Ksiazka> listaKsiazek2 = new ArrayList<>();

        listaKsiazek2.add(ksiazka12);
        listaKsiazek2.add(ksiazka13);
        listaKsiazek2.add(ksiazka14);
        listaKsiazek2.add(ksiazka15);

        listaKsiazek.addAll(listaKsiazek2);
        System.out.println("Powiekszona lista 1 ma rozmiar: "+listaKsiazek.size()+" i zawiera następujące pozycje:");
        for (Ksiazka ksiazka : listaKsiazek) {
            System.out.println(ksiazka.toString());
        }

//        Zadanie 10
        System.out.println("Zadanie 10");
        System.out.println("Wprowadź imię i naciśnij ENTER. Aby zakońćzyć wpisz END");
        List<String> listaImion = new ArrayList<>();
        Scanner scanner10 = new Scanner(System.in);
        String odczytaneImie;
        boolean flagaDodaniaImienia;
        do{
            flagaDodaniaImienia=true;
            odczytaneImie = scanner10.nextLine();
            for(String imie : listaImion){
                if(odczytaneImie.equalsIgnoreCase(imie)){
                    flagaDodaniaImienia=false;
                    System.out.println("To imie już jest na liście");
                    break;
                }
            }
            if(flagaDodaniaImienia && !odczytaneImie.equals("END")){
                listaImion.add(odczytaneImie);
            }
        }while (!odczytaneImie.equals("END"));
        System.out.println("Dopisano "+ listaImion.size()+" imion do listy imion. Oto one:");
        for(String imie : listaImion){
            System.out.println(imie);
        }

//        Zadanie 11
        System.out.println("Zadanie 11");
        System.out.println("Wprowadź palindrom i naciśnij ENTER. Aby zakońćzyć wpisz END");
        List<String> listaPalindromow = new ArrayList<>();
        Scanner scanner11 = new Scanner(System.in);
        String odczytanyPalindrom;
        boolean flagaDodaniaPalindromu;
        do {
            flagaDodaniaPalindromu=true;
            odczytanyPalindrom = scanner11.nextLine();
            if(czyStringJestPalindromem(odczytanyPalindrom)){
                for( String pozycjaZListy : listaPalindromow){
                    String stringPomocniczy1=OperacjeNaStringu.usunWszystkieSpacje(odczytanyPalindrom);
                    String stringPomocniczy2 = OperacjeNaStringu.usunWszystkieSpacje(pozycjaZListy);
                    if(stringPomocniczy1.equalsIgnoreCase(stringPomocniczy2)){
                        flagaDodaniaPalindromu=false;
                    }
                }
                if(flagaDodaniaPalindromu==true && odczytanyPalindrom.length()>0){
                    listaPalindromow.add(odczytanyPalindrom);
                }
            }
            else{
                System.out.println("Podany tekst nie jest palindromem.");
            }
        } while (!odczytanyPalindrom.equals("END"));

        System.out.println("Lista Twoich palindromów:");
        for(String palindrom : listaPalindromow){
            System.out.println(palindrom);
        }
    }
}
