package com.sda.javabyd3.mizi.exg009.ex06;

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
    private String pathToDirectory;
    private String fileToSaveInfo;
    private String pathToFileWithSavingInfo;
    private Path pathToFile;
    private List<String> listOfInformation;


    public IOmethodsOnFiles(String pathToDirectory)
    {
        this.pathToDirectory = pathToDirectory;
        this.fileToSaveInfo = "";
        this.pathToFileWithSavingInfo = "";
        this.listOfInformation = new ArrayList <>(  );
    }

    public void setFileToSaveInfo(String nameOfFile){
        this.fileToSaveInfo = nameOfFile;
        this.pathToFileWithSavingInfo = pathToDirectory + fileToSaveInfo;
        createPathToFile();
    }

    private void createPathToFile()
    {
        pathToFile = FileSystems.getDefault().getPath( pathToFileWithSavingInfo );
    }

    public void showInfoAboutFilesInDirectory(Integer howManyLookInto, File file)
    {

        if(file.exists()){
            long totalSpace = file.getTotalSpace();
            long usableSpace = file.getUsableSpace();
            long freeSpace = file.getFreeSpace();

            System.out.println("Total space: " + totalSpace/1024/1024 + " mb");
            System.out.println("Usable space: " + usableSpace/1024/1024 + " mb");
            System.out.println("Free space: " + freeSpace/1024/1024 + " mb");
            System.out.println("There are: " + file.list().length + " elements. ");

            //i am reading here name of file
            System.out.println("Name of files in this directory is: ");
            Arrays.stream( file.list() ).forEach( element -> System.out.println("-" + element) );

            // lower is recursion
            Arrays.stream( file.list() ).forEach( (element) -> {

                if(element.matches( "[A-Za-z0-9_-]+" ) && howManyLookInto > 0) {
                    String path = file.getPath()+ "\\" + element;
                    System.out.println("New directory path: " + path);
                    showInfoAboutFilesInDirectory( howManyLookInto - 1,
                            new File( path ) );
                }
                else return;
            });

        }
        else System.out.println("Files doesn't exist");
    }

    public void printToFileWithInfo() throws IOException
    {
        FileWriter fileWriter = new FileWriter( String.valueOf( pathToFile ) );
        PrintWriter printWriter = new PrintWriter( fileWriter );

        for(String key : listOfInformation)
        {
            printWriter.println( key );
        }
        printWriter.close();
    }

    public List<String> readFromFileWithInfo ()
    {
        List<String> listOfInfo = new ArrayList<>(  );
        Charset charset = Charset.forName( "UTF-8" );
        if(Files.exists(pathToFile)){
            try(BufferedReader bufferedReader = Files.newBufferedReader( pathToFile, charset )){

                String oneLine = null;
                while((oneLine = bufferedReader.readLine()) != null ){
                    listOfInfo.add( oneLine );
                }
            }catch (IOException e)
            {
                System.out.println("Problems with reading keys: " + e.getStackTrace());
            }
            System.out.println("Reading keys complete successed, size of list is: " + listOfInfo.size());
        }
        else{
            System.out.println("File key doesn't exits.");
        }
        return listOfInfo;
    }
}
