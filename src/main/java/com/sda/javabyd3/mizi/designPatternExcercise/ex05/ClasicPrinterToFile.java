package com.sda.javabyd3.mizi.designPatternExcercise.ex05;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class ClasicPrinterToFile implements Printer{

    private String pathToDirectory;
    private String nameOfFile;
    private String pathToFileInString;
    private Path pathToFile;
    List<Message> listOfVerse;

    public ClasicPrinterToFile(List<Message> listOfVerse)
    {
        this.pathToDirectory = "C:\\Users\\Właściciel\\Desktop\\kurs_SDA_JAVA\\SDA_repozytorium_grupowe\\" +
                "javabyd3all\\src\\main\\java\\com\\sda\\javabyd3\\mizi\\designPatternExcercise\\";
        this.nameOfFile = "Clasic";
        this.pathToFileInString = pathToDirectory + nameOfFile;
        this.listOfVerse = listOfVerse;
    }

    @Override
    public void printToFile()
    {
        try{

            FileWriter fileWriter = new FileWriter(  pathToFileInString + ".txt" );
            PrintWriter printWriter = new PrintWriter( fileWriter );
            for(Message verse : listOfVerse)
            {
                printWriter.println( verse.toString() );
            }
            printWriter.close();

        }catch(IOException e){
            e.getStackTrace();
        }

        System.out.println("Print to: " + pathToFileInString);
    }

    public String getPath() {
        return pathToFileInString;
    }

    public List<Message> getList(){
        return listOfVerse;
    }
}
