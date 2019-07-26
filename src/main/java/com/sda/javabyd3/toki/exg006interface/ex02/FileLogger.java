package com.sda.javabyd3.toki.exg006interface.ex02;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class FileLogger implements Logger {
    @Override
    public void log(String message) {

        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("name.txt"));
            bufferedWriter.write(message);
            log.info("File name.txt was created");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            PrintWriter printWriter=new PrintWriter("\\temp.txt","UTF-8");
//        printWriter.println(message);
//        printWriter.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
    }
}
