package com.kh.collection.pack2.setPre;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// 컬렉션 프레임워크 : Java에서 자료구조를 만들어서 모아둔 것
// java.util 폴더안에 있음
//특징
//1) 크기 제한 없음(부족하면 자동으로 증가)
//2) 추가 수정 삭제 검색 등 다양한 기능이 구현되어 있음
/*
 * Set (집합,주머니)
 * 기본적으로 순서 무작위, 인덱스 없음, 겟 메서드 없음
 * 중복데이터 저장불가-> 덮어쓰기됨
 *
 * set 인터페이스 자식클래스
 * 1.hashset (대표적): 처리속도 빠름
 * 2.linkedhashset : 순서유지
 * 3.treeset : 자동정렬
 *
 *
 * */
public class HashSetPre1 {
    public void method1() {
        HashSet set = new HashSet(); //자료형 무제한
        set.add("점심");
        set.add(100);
        set.add(true);
        set.add(3.14);

        set.add("점심");
        set.add("저녁");
        set.add("점심2");
        System.out.println(set);
//순서 무작위 저장

        ArrayList list = new ArrayList();
        list.add(1);
        list.add("점심");
        list.add("점심");
        list.add("점심");
        list.add("저녁");
        list.add("저녁2");
        System.out.println(list);
        //중복가능
    }

    public void method2() {
        HashSet<String> set = new HashSet<String>();
        set.add("사과");
        set.add("바나나");
        set.add("포도");
        set.add("사과");

        //순서 무작위 저장
        //중복 불허-> 띄어쓰기 유무 구분가능
        //set 에는 인덱스가 없어서 값이 정수라도 Integer.valueOf(정수값) 안써도 됨
        //인덱스와 혼동할 일이 없음

        System.out.println("set 의 리스트 출력" + set);
        System.out.println("갰수 확인:" + set.size());
        set.remove("포도");
        System.out.println("포도제거 확인:" + set);
        set.contains("바나나"); //있으면 true
        System.out.println("바나나 확인" + set.contains("바나나"));

        set.clear();
        System.out.println("제거 확인:" + set.isEmpty());


    }

    public void method3() {
        HashSet<Integer> intSet = new HashSet<Integer>();
        intSet.add(10);
        intSet.add(200);
        intSet.add(3000);
        intSet.add(500);
        intSet.add(40);
        intSet.remove(3000);
        System.out.println("3000 제거 확인:" + intSet);
        intSet.contains(500);
        System.out.println(intSet.contains(500));

        intSet.clear();
        System.out.println("제거 확인:" + intSet.isEmpty());


    }

    /*
     * set 을 향상된 for문 (for-each) 출력
     * 일반 for문 경우 index 가 존재하지 않아서 사용제한
     * 대신 Iterator 란 반복문으로 출력
     *
     *  */
    public void method4() {
        HashSet<String> strList = new HashSet<String>();
        strList.add("참외");
        strList.add("토마토");
        strList.add("수박");

        System.out.println("strList:" + strList);
        for (String str : strList) {
            System.out.println(str);
            //중복불허 set 목록에서 하나씩 꺼내 str 변수에 값 대입
        }
    }

//Iterator로 set 출력
    public void method5() {
        HashSet<String> str = new HashSet<String>();
        str.add("딸기");
        str.add("사과");
        str.add("바나나");
        str.add("포도");

        //hashset 목록 담은 str 변수명 가져오서 반복 설정
        Iterator<String> it = str.iterator();
        while (it.hasNext()) {    //hasNext() = 다음값 존재시 true
            System.out.println(it.next()); 
            //str 목록에서 하나씩 꺼내서 it 에 저장
            //next() 다음값 출력
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        /*
        * Iterator = 컬렉션 순차로 회전하는 객체
        * (hashset 이외에도 arraylist 등 collection으로 작성된 객체들에 모두 사용가능)
        *
        * iterator() = 반복 원하는 변수명 뒤에 작성한 후 반복하겠다는 설정
        *             값에다 순차적 접근
        *
        * hasNext() = 목록에 반복할 값 남았나 확인 -> 결과:true(남음)/false(없음)
        *
        * it.next() = 현재 iterator 가 가리키는 값 보여주고, 자동으로 다음값으로 이동설정(다음값 보여줄 준비)
        * set -> 로또번호 생성시 사용
        * */
    }

    //Iterator 이용해 로또번호 생성 -> 직접 값 삭제가능

    public void iterLotto(){
        //hashset 으로 로또번호 저장
        HashSet<Integer> lottoNumbers = new HashSet<Integer>();

        //중복없이 6개 번호 생성
        //로또숫자들 0~5 까지 6개 이하동안 for문 반복
        for(int i = 0; lottoNumbers.size() < 6; i++){
            //Math.random으로 가져온 숫자 사용 -> 0.0 ~ o.999999 사이 소수 출력
            //Math.random() * 45 = 45.xxxxxxxxxxxxxxxxx ...
            //(int) (Math.random() * 45) = 0~44 정수
            //(int) (Math.random() * 45)+1 = 1~45 정수

            int num = (int) (Math.random() * 45)+1;
            lottoNumbers.add(num); // 만든 숫자를 중복불허하는 set 에 담기
        }
        System.out.println("lottoNumbers:" + lottoNumbers);

        //번호 하나씩
        Iterator<Integer> it = lottoNumbers.iterator();
        System.out.println("lottoNumbers");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


    //향상된 for문 (for - each) 이용해 로또번호 생성 -> 읽기전용
    
    public void forLotto(){
        //hashset 으로 로또번호 저장
        HashSet<Integer> lottoNumbers = new HashSet<Integer>();

        //중복없이 6개 번호 생성
        //로또숫자들 0~5 까지 6개 이하동안 for문 반복
        for(int i = 0; lottoNumbers.size() < 6; i++){
            //Math.random으로 가져온 숫자 사용 -> 0.0 ~ o.999999 사이 소수 출력
            //Math.random() * 45 = 45.xxxxxxxxxxxxxxxxx ...
            //(int) (Math.random() * 45) = 0~44 정수
            //(int) (Math.random() * 45)+1 = 1~45 정수

            int num = (int) (Math.random() * 45)+1;
            lottoNumbers.add(num); // 만든 숫자를 중복불허하는 set 에 담기
        }
        System.out.println("lottoNumbers:" + lottoNumbers);

        //번호 하나씩
//        Iterator<Integer> it = lottoNumbers.iterator();
//        System.out.println("lottoNumbers");
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

    }
}

















