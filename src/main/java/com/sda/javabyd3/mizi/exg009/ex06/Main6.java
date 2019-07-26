package com.sda.javabyd3.mizi.exg009.ex06;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main6 {
    /*
    *   path to directory (to testing):
    *   "C:\Users\Właściciel\Desktop\kurs_SDA_JAVA\SDA_repozytorium_grupowe\javabyd3all\src\main\java\com\sda\javabyd3\mizi\exg009general"
    *
    * */
    public static void main(String[] args) {
        IOmethodsOnFiles ioMethodsOnFiles;
        Scanner scanner = new Scanner( System.in );
        System.out.println(" Write here directory, what you want to check: ");
        String pathToDirectory = scanner.nextLine();
        System.out.println(" Write here how many catalog you want look into: ");
        Integer howManyDirectoryCheck =  scanner.nextInt();
        ioMethodsOnFiles = new IOmethodsOnFiles(pathToDirectory);
        File file = new File( pathToDirectory );
        ioMethodsOnFiles.showInfoAboutFilesInDirectory(howManyDirectoryCheck, file);

    }
}
