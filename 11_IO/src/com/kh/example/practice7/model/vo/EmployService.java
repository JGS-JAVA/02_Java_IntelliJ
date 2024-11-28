package com.kh.example.practice7.model.vo;


import java.util.HashMap;
import java.util.Map;


public class EmployService {
    public void method1(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("empNo","100");
        map.put("empName","홍길동");
        map.put("dept","영업부");
        map.put("job","과장");
        map.put("age","25");
        map.put("gender","남");
        map.put("salary","2500000");
        map.put("bonusPoint","0.05");
        map.put("phone","010-1234-5678");
        map.put("address","서울시 강남구");


        System.out.println(map);


    }

}
