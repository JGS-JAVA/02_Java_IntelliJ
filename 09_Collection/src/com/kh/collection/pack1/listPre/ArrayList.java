package com.kh.collection.pack1.listPre;

public class ArrayList {

    public void method1(){
        ArrayList<String> list1 = new ArrayList<String>(5);
        list1.add("새우깡");
        list1.add("맛동산");
        list1.add("포카칩");
        list1.add("고구마칩");
        list1.add("고래밥");

        System.out.println(list1);
        System.out.println(list1.size());

        list1.add(1,"허니버터칩");
    System.out.println("list확인:"+list1);
    System.out.println(list1.get(3));
    System.out.println(list1.set(2,"망고"));
    System.out.println("list확인:"+list1);
        list1.remove(1);
        list1.remove("포카칩");
    System.out.println("list확인:"+list1);
    System.out.println("망고과자 있나?"+list1.contains("망고"));
    list.clear();
    System.out.println("리스트 삭제 확인"+list);




    }

/*
* index = 1 자리에 허니버터칩 넣기-> add(1,"허니버터칩");
* 특정 위치값 가져오기 get(int index넙버);
* 특정 위치값 변경하기 set(index넘버,수정값);
* 특정 위치값 삭제하기 remove("삭제할값") 또는 remove(index넘버);
* 리스트에 찾는값 있나 확인하기
* 리스트의 모든값 삭제하기
* contains, isEmpty 는 값이 boolean 값으로 나옴
* */

    public void method2(){
        ArrayList<String> list2 = new ArrayList<String>(5);
        list2.add("사과");
        list2.add("포도");
        list2.add("바나나");
        list2.add("망고");

        System.out.println("초기 리스트"+list2);
        list2.add(1,"오렌지");
        System.out.println("오렌지추가 확인"+list2);
        list2.set(3,"파인애플");
        System.out.println("바나나를 파인애플로 바꿈 확인"+list2);

        list2.remove(0);
        System.out.println("삭제확인"+list2);
        list2.remove("망고");
        System.out.println("망고삭제 확인"+list2);

        if(list.contains("사과")){
            list.remove("사과");
            System.out.println(list2);
        }else{
            System.out.println("사과 없음");
        }
        list.clear();
        System.out.println("비어있나?");


    }

    /**/
    public void method3(){
        ArrayList<Integer> intList=new ArrayList<Integer>();
        intList.add(1);
        intList.add(10);
        intList.add(100);
        System.out.println(intList);

        ArrayList<Character> charList=new ArrayList<Character>();
        charList.add('a');
        charList.add('b');
        charList.add('c');
        charList.add('가');
        System.out.println(charList);

    }

}
