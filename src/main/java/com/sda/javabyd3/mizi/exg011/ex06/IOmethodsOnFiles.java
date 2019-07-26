package com.sda.javabyd3.mizi.exg011.ex06;

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
public class IOmethodsOnFiles {
    //C:\Users\Właściciel\Desktop\kurs_SDA_JAVA\SDA_repozytorium_grupowe\javabyd3all\src\main\java\com\sda\javabyd3\mizi\exg011\ex06
    private String pathToDirectory;
    private String nameOfFile;
    String pathToFileInString;
    private Path pathToFile;


    public IOmethodsOnFiles()
    {
        this.pathToDirectory = "C:\\Users\\Właściciel\\Desktop\\kurs_SDA_JAVA\\" +
                "SDA_repozytorium_grupowe\\javabyd3all\\src\\main\\java\\com\\sda\\" +
                "javabyd3\\mizi\\exg011\\ex06\\";
        this.nameOfFile = "dane.txt";
        this.pathToFileInString = pathToDirectory + nameOfFile;
        createPathToFile();
    }

    private void createPathToFile()
    {
        pathToFile = FileSystems.getDefault().getPath( pathToFileInString );
    }

    public void printToFile(List<String> listOfVerse) throws IOException
    {
        FileWriter fileWriter = new FileWriter( String.valueOf( pathToFile ) );
        PrintWriter printWriter = new PrintWriter( fileWriter );

        for(String verse : listOfVerse)
        {
            printWriter.println( verse );
        }
        printWriter.close();
    }

    public List<String> readFromFile ()
    {
        List<String> listOfLines = new ArrayList<>(  );
        Charset charset = Charset.forName( "UTF-8" );
        if(Files.exists(pathToFile)){
            try(BufferedReader bufferedReader = Files.newBufferedReader( pathToFile, charset )){
                String oneLine = null;
                while((oneLine = bufferedReader.readLine()) != null ){
                    listOfLines.add( oneLine );
                }
            }catch (IOException e)
            {
                System.out.println("Problems with reading file: " + e.getStackTrace());
            }
            System.out.println("Reading file complete successed, size of list is: " + listOfLines.size());
        }
        else{
            System.out.println("File doesn't exits.");
        }
        return listOfLines;
    }
}
