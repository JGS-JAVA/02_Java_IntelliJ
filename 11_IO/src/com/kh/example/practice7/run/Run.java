package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.EmployService;
import com.kh.example.practice7.model.vo.Employee;

public class Run {
    public static void main(String[] args) {
        Employee em = new Employee();
        EmployService es = new EmployService();
        es.method1();
    }
}
