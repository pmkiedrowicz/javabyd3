package com.sda.javabyd3.mizi.designPatternExcercise.ex01;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class MiziLogger {
    public static MiziLogger miziLogger;

    private String pathToDirectory;
    private String nameOfFile;
    private String pathToFileInString;
    private Path pathToFile;

    private MiziLogger(){
        this.pathToDirectory = "C:\\Users\\Właściciel\\Desktop\\kurs_SDA_JAVA\\" +
                "SDA_repozytorium_grupowe\\javabyd3all\\src\\main\\java\\com\\sda\\" +
                "javabyd3\\mizi\\wzorceProjZad\\ex01\\";
        this.nameOfFile = "MiziLogger.txt";
        this.pathToFileInString = pathToDirectory + nameOfFile;
        createPathToFile();
    }

    public static MiziLogger getMiziLogger(){
        if(miziLogger == null){
            synchronized (MiziLogger.class){
                if(miziLogger == null) miziLogger = new MiziLogger();
            }
        }
        return miziLogger;
    }

    private void createPathToFile()
    {
        pathToFile = FileSystems.getDefault().getPath( pathToFileInString );
    }

    public void printToFile(String text) throws IOException
    {
        FileWriter fileWriter = new FileWriter( String.valueOf( pathToFile ) );
        PrintWriter printWriter = new PrintWriter( fileWriter );
        printWriter.println( text );

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
