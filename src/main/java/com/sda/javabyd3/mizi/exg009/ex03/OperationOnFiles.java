package com.sda.javabyd3.mizi.exg009.ex03;

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
public class OperationOnFiles {
    private String pathToDirectory;
    private String personalDataFile;
     String pathToFilePersonalData;
    private Path pathToFile;


    public OperationOnFiles()
    {
        this.pathToDirectory = "C:\\Users\\Właściciel\\Desktop\\kurs_SDA_JAVA\\" +
                "SDA_repozytorium_grupowe\\javabyd3all\\" +
                "src\\main\\java\\com\\sda\\javabyd3\\mizi\\exg009general\\";
        this.personalDataFile = "PersonalData.txt";
        this.pathToFilePersonalData = pathToDirectory + personalDataFile;
        createPathToFile();
    }

    private void createPathToFile()
    {
        pathToFile = FileSystems.getDefault().getPath( pathToFilePersonalData );
    }

    // ta metoda zbedna w JSONie zad 3 a i b
    public void printToFileKey(List<String> listOfKeys) throws IOException
    {
        FileWriter fileWriter = new FileWriter( String.valueOf( pathToFile ) );
        PrintWriter printWriter = new PrintWriter( fileWriter );

        for(String key : listOfKeys)
        {
            printWriter.println( key );
        }
        printWriter.close();
    }

    //zbedna metoda w JSONie zad3 a i b
    public List<String> readFromFileKeys ()
    {
        List<String> listOfKeys = new ArrayList<>(  );
        Charset charset = Charset.forName( "UTF-8" );
        if(Files.exists(pathToFile)){
            try(BufferedReader bufferedReader = Files.newBufferedReader( pathToFile, charset )){

                String oneLine = null;
                while((oneLine = bufferedReader.readLine()) != null ){
                    listOfKeys.add( oneLine );
                }
            }catch (IOException e)
            {
                System.out.println("Problems with reading keys: " + e.getStackTrace());
            }
            System.out.println("Reading keys complete successed, size of list is: " + listOfKeys.size());
        }
        else{
            System.out.println("File key doesn't exits.");
        }
        return listOfKeys;
    }
}
