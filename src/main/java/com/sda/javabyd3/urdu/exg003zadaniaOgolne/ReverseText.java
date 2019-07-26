package com.sda.javabyd3.urdu.exg003zadaniaOgolne;

public class ReverseText {

    public String reverseText(String text){
    String text2="";
     for(int i=text.length()-1;i>=0;i--){
         //System.out.print(text.charAt(i));  // wypisuje tylko odwrotnie
         text2+=text.charAt(i);
     }
    return text2;
    }

}
