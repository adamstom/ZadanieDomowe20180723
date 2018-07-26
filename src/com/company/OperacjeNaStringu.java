package com.company;

public class OperacjeNaStringu {
    public static String usunWszystkieSpacje(String tekstWejsciowy){
        String tekstWyjsciowy="";
        for(int i=0; i<tekstWejsciowy.length(); i++){
            if((tekstWejsciowy.charAt(i))==(' ')){
//                System.out.println("znalazłęm spacje");
            }
            else{
//                System.out.println("to nie spacja");
                tekstWyjsciowy=tekstWyjsciowy+tekstWejsciowy.charAt(i);
            }
        }
        return tekstWyjsciowy;
    }

    public static String odwrocKolejnoscStringa(String tekstWejsciowy){
        String tekstWyjsciowy="";
        for(int i=tekstWejsciowy.length()-1; i>=0;i--){
            tekstWyjsciowy=tekstWyjsciowy+tekstWejsciowy.charAt(i);
        }
        return tekstWyjsciowy;
    }

    public static boolean czyStringJestPalindromem(String tekstWejsciowy){
        String tekstBezSpacji=usunWszystkieSpacje(tekstWejsciowy);
        String tekstBezSpacjiOdwrotnaKolejnosc=odwrocKolejnoscStringa(tekstBezSpacji);
        if(tekstBezSpacji.equalsIgnoreCase(tekstBezSpacjiOdwrotnaKolejnosc)){
            return true;
        }
        else{
            return false;
        }
    }
}
