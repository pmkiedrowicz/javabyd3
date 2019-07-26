package com.sda.javabyd3.mizi.exg011.ex06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class TextChecker {
    private List<String> listOfLines;
    private Integer numberOfWords;
    private Integer numberOfCharacters;
    private Integer numberOfSentences;
    private Integer numberOfVowel;
    private Integer numberOfConsonant;
    private Integer whiteSpaceChar;
    private Double averageOfWords;
    private Double averageOfSentences;

    public TextChecker(){
        this.listOfLines = new ArrayList <>(  );
        this.numberOfWords = 0;
        this.numberOfCharacters = 0;
        this.numberOfSentences = 0;
        this.numberOfVowel = 0;
        this.numberOfConsonant = 0;
        this.whiteSpaceChar = 0;
        this.averageOfWords = 0.0;
        this.averageOfSentences = 0.0;
    }

    public TextChecker(List <String> listOfLines){
        this.listOfLines = listOfLines;
        this.numberOfWords = 0;
        this.numberOfCharacters = 0;
        this.numberOfSentences = 0;
        this.numberOfVowel = 0;
        this.numberOfConsonant =0;
        this.whiteSpaceChar = 0;
        this.averageOfWords = 0.0;
        this.averageOfSentences = 0.0;
    }

    public List <String> getListOfLines() {
        return listOfLines;
    }

    public void setListOfLines(List <String> listOfLines) {
        this.listOfLines = listOfLines;
    }

    public void CreateStatistics(){

        System.out.println("Number of words: " + checkNumberOfWords());
        System.out.println("Number of characters: " + checkNumberOfCharacters() + "(without whitespace characters)");
        System.out.println("Number of sentences: " + checkNumberOfSentences());
        System.out.println("Number of vowel: " + checkNumberOfVowel());
        System.out.println("Number of consonant: " + checkNumberOfConsonant());
        System.out.println("Number of whitespace character: " + checkNumberOfWhiteSpaceChar());
        System.out.printf("Average length of words: %.2f \n", checkAverageLengthOfWords());
        System.out.printf("Average length of sentence: %.2f \n", checkAverageLengthOfSentence());
    }

    public Integer checkNumberOfWords(){
        this.numberOfWords = 0;
        String[] temporary;
        for(String item: listOfLines){
            temporary = null;
            temporary = item.split( " " );
            // count if != empty lines
            if(temporary.length > 1) this.numberOfWords += temporary.length;
        }

        return this.numberOfWords;
    }

    public Integer checkNumberOfCharacters(){
        this.numberOfCharacters = 0;
        String temporary;
        for(String item: listOfLines){
            temporary = item.replace( " ", "" );
            // count if != empty lines
            if(!temporary.equals( "" ));
            this.numberOfCharacters += temporary.length();
        }
        return this.numberOfCharacters;
    }

    public Integer checkNumberOfSentences(){
        String temporary = "";
        for(String item: listOfLines){

            temporary += item;
        }
        String[] sentences = temporary.split( "\\." );
        this.numberOfSentences = sentences.length;
        return this.numberOfSentences;
    }

    public Integer checkNumberOfVowel(){
        String temporary = "";
        for(String item: listOfLines){

            temporary += item;
        }
        int counter = 0;
        for(int i = 0 ; i < temporary.length(); i++){
            if(temporary.charAt( i ) == 'a' || temporary.charAt( i ) == 'o' || temporary.charAt( i ) == 'ó'
                    || temporary.charAt( i ) == 'e' || temporary.charAt( i ) == 'u' || temporary.charAt( i ) == 'i'
                    || temporary.charAt( i ) == 'y')
                counter ++;
        }
        this.numberOfVowel = counter;

        return this.numberOfVowel;
    }

    public Integer checkNumberOfConsonant(){
        String temporary = "";
        for(String item: listOfLines){

            temporary += item;
        }
        int counter = 0;
        for(int i = 0 ; i < temporary.length(); i++){
            if(temporary.charAt( i ) != 'a' || temporary.charAt( i ) != 'o' || temporary.charAt( i ) != 'ó'
                    || temporary.charAt( i ) != 'e' || temporary.charAt( i ) != 'u' || temporary.charAt( i ) != 'i'
                    || temporary.charAt( i ) != 'y')
                counter ++;
        }
        this.numberOfConsonant = counter;

        return this.numberOfConsonant;
    }

    public Integer checkNumberOfWhiteSpaceChar(){
        String temporary = "";
        for(String item: listOfLines){

            temporary += item;
        }
        int counter = 0;
        for(int i = 0 ; i < temporary.length(); i++){
            //in ASCII: 10 -> \n | 9 -> \t | 13 ->\r | ' ' -> 32
            // there is problem with characters '\n' and '\r', I cant count them.
            if(temporary.charAt( i ) == '\n' || temporary.charAt( i ) == 9
                    || temporary.charAt( i ) == 13 || temporary.charAt( i ) == 32
                    || temporary.contains( "\r\n" ) || temporary.contains( "\n" ) || temporary.contains( "\r" ))
                counter ++;
        }
        // listOfLines.size() get us number of "\n" or "\r\n"
        this.whiteSpaceChar = counter + listOfLines.size();

        return this.whiteSpaceChar;
    }

    public Double checkAverageLengthOfWords(){
        int nrOfChar = checkNumberOfCharacters();
        int nrOfWords = checkNumberOfWords();
        this.averageOfWords = nrOfChar/(double)nrOfWords;

        return this.averageOfWords;
    }

    public Double checkAverageLengthOfSentence(){
        int nrOfChar = checkNumberOfCharacters();
        int nrOfSentences = checkNumberOfSentences();
        this.averageOfSentences = nrOfChar/(double)nrOfSentences;

        return this.averageOfSentences;
    }



}
