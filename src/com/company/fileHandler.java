package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;

public class fileHandler {

    public static void randomRead(String fileName, int start) {
        RandomAccessFile rf = null;

        try {
            rf = new RandomAccessFile(fileName, "rws");
            rf.seek((long)start);
            char letter = (char)rf.read();
            System.out.println(letter);
        } catch (IOException var12) {
            var12.printStackTrace();
        } finally {
            try {
                rf.close();
            } catch (IOException var11) {
                var11.printStackTrace();
            }

        }

    }
}