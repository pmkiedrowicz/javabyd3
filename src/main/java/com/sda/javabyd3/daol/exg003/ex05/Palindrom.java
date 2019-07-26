package com.sda.javabyd3.daol.exg003.ex05;

import com.sda.javabyd3.daol.exg003.ex03.InversChecker;


public class Palindrom {

    public String deleteEmpytChar(String text) {
        text = text.replaceAll("\\s", "");
        String text2 = text;
        return text2;
    }

    public boolean isPalindrom(String text) {
        InversChecker reversWord = new InversChecker();
        String text2 = reversWord.wordInvers(text);
        if (text2.equals(text)) {
            return true;
        } else return false;
    }
}



//        boolean palindrom = false;
//        if(word.length%2 == 0){
//            for(int i = 0; i < word.length/2-1; i++){
//                if(word[i] != word[word.length-i-1]){
//                    return false;
//                }else{
//                    palindrom = true;
//                }
//            }
//        }else{
//            for(int i = 0; i < (word.length-1)/2-1; i++){
//                if(word[i] != word[word.length-i-1]){
//                    return false;
//                }else{
//                    palindrom = true;
//                }
//            }
//        }
//        return palindrom;
//    }
//}
