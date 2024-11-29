//package com.kh.pack1.filePre;
//
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class FilePre2 {
//    public void method1() {
//        String folderPath = System.getProperty("user.home") + "/front-workspace/01_HTML";
//        File 폴더 = new File(System.getProperty("user.home") + "/front-workspace/01_HTML");
//
//        File[] files = File.listFiles();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        for (File f : files) {
//            System.out.println(f.toString()); //파일경로와 파일이름
//            System.out.println(f.getName());
//            String lastDate = sdf.format((f.lastModified()));
//            System.out.println(f.lastModified());
//
//
//        }
//
//    }
//}
