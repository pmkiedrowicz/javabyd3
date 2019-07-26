package com.sda.javabyd3.mizi.exg001.watki.ex05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Created by Michal Ziolecki.
 */
public class SaveToFileZ5 {
    private String pathToDirectory;
    private String nameOfFile;
    private String pathToFile;
    private PersonZ5 personZ5;

    public SaveToFileZ5(PersonZ5 person, String name)
    {
        this.personZ5 = person;
        this.pathToDirectory = "C:\\Users\\Właściciel\\Desktop\\JavaSDAlogExample\\src\\Main\\java\\Zad001\\Watki\\";
        this.nameOfFile = name;
        joinPathToFile();

    }

    public void joinPathToFile()
    {
        this.pathToFile = pathToDirectory + nameOfFile + ".json";
    }

    public void saveFileinDirectory() throws IOException
    {
        Path path = FileSystems.getDefault().getPath( pathToFile );
        FileWriter fileWriter = new FileWriter( String.valueOf( path ) );
        PrintWriter printWriter = new PrintWriter( fileWriter );

        printWriter.print( personZ5.toString() );

        printWriter.close();
    }

}
