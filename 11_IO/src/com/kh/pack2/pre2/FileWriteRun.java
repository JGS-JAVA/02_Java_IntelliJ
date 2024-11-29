package com.kh.pack2.pre2;

public class FileWriteRun {
    public static void main(String[] args) {
        FileWritePre fwp = new FileWritePre();
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "user.txt";
        System.out.println("생성시작");
        fwp.createTxt();
        fwp.writeTxt();
    }
}
