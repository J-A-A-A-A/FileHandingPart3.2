package com.company;
import java.io.RandomAccessFile;
import java.io.IOException;

public class Main {
    // read one character from the file at given position
    public static void randomRead(String fileName, int startPos) {
        try(RandomAccessFile rf = new RandomAccessFile(fileName, "rws");){
            rf.seek(startPos);
            String line =  rf.readLine();
            System.out.println(line);
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        System.out.println("Random File Access");
        for (int i = 4; i < 10; i++){
            randomRead("data.txt",i);
        }
        System.out.println("Random File Access");
        for (int i = 0; i < 3446; i = i + 2){
            fileHandler.randomRead("data.txt",i);
        }

    }
}
