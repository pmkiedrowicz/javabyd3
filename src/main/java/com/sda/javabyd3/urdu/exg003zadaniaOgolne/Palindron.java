package com.sda.javabyd3.urdu.exg003zadaniaOgolne;

public class Palindron {

    public Boolean isPalindron(String text){

      ReverseText rev =  new ReverseText();

      //text =text.toLowerCase();
      text = text.replaceAll("\\s","").toLowerCase();
      String text2;

        text2 = rev.reverseText(text);
         if(text.equals(text2)){
            return true;
         } else{
             return false;
         }
    }
}
