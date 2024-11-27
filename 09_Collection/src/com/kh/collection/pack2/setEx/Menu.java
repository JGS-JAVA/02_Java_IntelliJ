package com.kh.collection.pack2.setEx;

import java.util.Objects;

public class Menu {
    //필드
    private int id;
    private String name;
    private double price;

    //메서드


    public Menu() {
    }

    public Menu(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
/*
* 객체가 같다를 비교
* 동일: 가리키는 것이 같다 Object.hashCode()
* 동등: 값이 같다         Object.equals()
*
* 동등비교: Object.equals 메서드 재정의(오버라이딩)
* 현재 객체 필드와 전달받은 객체 필드 같으면 true, 다르면 false
* */
    @Override
    public boolean equals(Object o) {
        //들어온 값이 Menu 타입여부 확인 아니면 같은것인지 비교할 필요없이 리턴
        //들어온 값이 Menu 타입이면 id,price,menu name 일치여부 확인
        if (!(o instanceof Menu menu)) return false; 
        return id == menu.id && Double.compare(price, menu.price) == 0 && Objects.equals(name, menu.name);
        // Double.compare(price, menu.price) == 0 정수나 실수 비교시 사용
        //두 값이 같으면 0, 첫번째가 더 작으면 음수, 첫번째가 더 크면 양수
        ///  2=2 == 0
        ///  2=1 == 1
        ///  1=2 == -1
    }

    /*
    * 동일비교: Object.hashCode() 메서드 재정의(오버라이딩)
    * hash함수: 값 넣으면 같은 길이 문자열 반환
    * hashCode(): 객체별 식별코드 (객체 구분 정수) 반환
    * 주민번호,학번,은행번호표와 같이 암호화 처리 진행시 사용
    *
    * */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
    /* equals
    두 값이 논리적으로 같은지 비교 = 같은 주소인지 확인
    재정의해서 쓸경우 객체 안에서 특정 필드값 같을때 논리적으로 같다고 정의하고
    비교내용 구현

    hashCode
    두 값이 논리적으로 같은지 비교 = 주소기반으로 해시값 계산해서 그 결과 같은지 확인하고
    같으면 같은 해시코드 반환

    hash : 컴퓨터 과학에서 조각내다, 잘게 자르다
           요리에서 고기 잘게 썰어 섞음
           프로그래밍에서 데이터를 규칙에 따라 조작,변환하고 그 결과가 같은지 확인




     */
}
