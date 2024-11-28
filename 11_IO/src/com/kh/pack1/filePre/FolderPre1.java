package com.kh.pack1.filePre;

import java.io.File;
import java.io.IOException;

public class FolderPre1 {
    public void method1() {
        File dir = new File(System.getProperty("user.home")
                + "/Desktop/profileImg");
        if (dir.exists()) {
            System.out.println("이미 존재하는 폴더");

        } else {
            dir.mkdir();
            System.out.println("폴더 생성완료");
        }
    }

    public void method2() {
        File txtFile = new File(System.getProperty("user.home")+"/Desktop/newFile.txt");
        if (txtFile.exists()) {
            System.out.println("이미 존재");
        } else {
            try {
                txtFile.createNewFile();
                System.out.println("생성 성공"+txtFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
