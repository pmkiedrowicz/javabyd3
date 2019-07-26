package com.sda.javabyd3.mizi.Zadania_dodatkowe001.ZadDod6;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class CreateFiles {
   private String pathToDirectory;
   private String keys;
   private String value;
   private String map;
   private String pathToFileKey;
   private String pathToFileValue;
   private String pathToFileMap;
   private Path pathToMap;
   private Path pathToKey ;
   private Path pathToValue;

    public CreateFiles()
    {
        this.pathToDirectory = "C:\\Users\\Właściciel\\Desktop\\kurs_SDA_JAVA\\" +
                "SDA_repozytorium_grupowe\\javabyd3all\\src\\Main\\java\\com\\sda\\" +
                "javabyd3\\mizi\\Zadania_dodatkowe001\\ZadDod6\\";
        this.keys = "Key.txt";
        this.value = "Value.txt";
        this.map = "Map.txt";
        this.pathToFileKey = pathToDirectory + keys;
        this.pathToFileValue = pathToDirectory + value;
        this.pathToFileMap = pathToDirectory + map;
        createPathToFile();
    }

    private void createPathToFile()
    {
        pathToKey = FileSystems.getDefault().getPath( pathToFileKey );
        pathToValue = FileSystems.getDefault().getPath( pathToFileValue );
        pathToMap = FileSystems.getDefault().getPath( pathToFileMap );
    }

    public void printToFileKey(List<String> listOfKeys) throws IOException
    {
        FileWriter fileWriter = new FileWriter( String.valueOf( pathToKey ) );
        PrintWriter printWriter = new PrintWriter( fileWriter );

        for(String key : listOfKeys)
        {
            printWriter.println( key );
        }
        printWriter.close();
    }

    public void printToFileValue(List<String> listOfValue) throws IOException
    {
        FileWriter fileWriter = new FileWriter( String.valueOf( pathToValue ) );
        PrintWriter printWriter = new PrintWriter( fileWriter );

        for(String value : listOfValue)
        {
            printWriter.println( value );
        }
        printWriter.close();
    }

    public void printToFileMap(HashMap<String,String> myHashMap) throws IOException
    {
        FileWriter fileWriter = new FileWriter( String.valueOf( pathToMap ) );
        PrintWriter printWriter = new PrintWriter( fileWriter );

//        myHashMap.values().stream().sorted()
//                .forEach( item -> printWriter.println(item) );
        myHashMap.forEach( (key, value) -> {
            printWriter.println(key + ", " + value );
        } );

        printWriter.close();
    }

    public List<String> readFromFileKeys ()
    {
        List<String> listOfKeys = new ArrayList <>(  );
        Charset charset = Charset.forName( "UTF-8" );
        if(Files.exists(pathToKey)){
            try(BufferedReader bufferedReader = Files.newBufferedReader( pathToKey, charset )){

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

    public List<String> readFromFileValue ()
    {
        List<String> listOfValue = new ArrayList <>(  );
        Charset charset = Charset.forName( "UTF-8" );
        if(Files.exists(pathToValue)){
            try(BufferedReader bufferedReader = Files.newBufferedReader( pathToValue, charset )){
                String oneLine = null;
                while((oneLine = bufferedReader.readLine()) != null ){
                    listOfValue.add( oneLine );
                }
            }catch (IOException e)
            {
                System.out.println("Problems with reading value: " + e.getStackTrace());
            }
            System.out.println("Reading value complete successed, size of list is: " + listOfValue.size());
        }
        else{
            System.out.println("File value doesn't exits.");
        }
        return listOfValue;
    }

    public void printHashMapToFile()
    {

    }
}
