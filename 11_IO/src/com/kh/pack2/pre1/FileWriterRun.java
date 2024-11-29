package com.kh.pack2.pre1;

public class FileWriterRun {
    public static void main(String[] args) {


        String path = System.getProperty("user.home") + "/Desktop/";
        String filename = "food.txt";
        FileWriterPre5 fwp5 = new FileWriterPre5();
        //파일생성기능(path,fileName);
        fwp5.createFile(path, filename);
        fwp5.writeFile(path, filename);

        //파일작성기능
    }
}