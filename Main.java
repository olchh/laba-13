package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try(FileReader fr = new FileReader("text.txt");
            FileWriter fw = new FileWriter("read.txt")){
            int w;
            String tet = "";
            while((w = fr.read()) != -1){
                tet = tet + (char)w;
            }

            String rur = tet.replaceAll("\\//.+", ""); //заменить все
            String fuf = rur.replaceAll("/\\*(?s).*?\\*/", "");

            fw.write(fuf); //записывает код без комментариев
            fw.flush(); //очищает буфер и сбрасывает его содержимое
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    }
