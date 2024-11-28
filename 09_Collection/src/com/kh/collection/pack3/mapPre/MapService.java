package com.kh.collection.pack3.mapPre;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapService {
    public void method1(){
        HashMap<String,String> 나라들 = new HashMap<String,String>();

        //데이터 추가
        나라들.put("KR","Korea");
        나라들.put("US","United States");
        나라들.put("EU","Europe");

        System.out.println("국가 약칭 확인:"+나라들);
        //작성순서와 무관히 출력
        /*
        * Key 띄어쓰기 유무 구분가능 -> 중복처럼 보이나 중복 아님
        *

        *키에 해당하는 값 반환 */
        System.out.println("---------------");
        System.out.println(나라들.get("EU"));
        System.out.println(나라들.get("CN")); //null 값 출력

        //size() 이용해 map에 저장된 Entry(K:V) 개수 출력 size는 int 값으로 나옴
        System.out.println("저장된 나라 종류수:"+나라들.size());

        //V remove(K k): 엔트리(키와 값) 제거
        나라들.remove("KR ");
        나라들.remove("EU ");
        System.out.println("제거후"+나라들);

        //지우는거 확인시 remove를 출력문 안에 작성
        System.out.println(나라들.remove("EU "));
        // 없는키 지우려할때 null 값 반환
        //모든 엔트리 삭제 clear()
        //비어있나 확인 boolean isEmpty()
        System.out.println("클리어로 지우기전 값 존재 확인"+나라들.isEmpty());
        나라들.clear();
        System.out.println("클리어로 지운것 확인"+나라들.isEmpty());



    }

    //향상 for문으로 순차접근해 출력
    //맵도 인덱스 없어서 Map.keySet()으로 접근
    public void method2(){
        Map.<String,String> map = new HashMap<String,String>();
        map.put("학원","서울 강남");
        map.put("집","경기");
        map.put("63","서울 영등");
        map.put("롯데","서울 송파");

        //
        Set<String> set = map.keySet();

        System.out.println(set);
/*
* set 안에 map 키인 [집,63,학원,롯데] 만 저장
*
*
* */
        //향상for문 + set
        for(String key : set){
  //순차적으로 키 저장, 저장된 키에 해당한 값을 map.get(key)로 키에 해당한 값을 get하겠다
            System.out.println(key+":"+map.get(key));
        }
    }

    //맵도 인덱스 없어서 Map.entrySet()으로 접근
    public void method3(){
        HashMap.<String,String> map = new HashMap<String,String>();
        map.put("학원","서울 강남");
        map.put("집","경기");
        map.put("63","서울 영등");
        map.put("롯데","서울 송파");

        Set<Map.Entry<String,String>> entrySet = map.entrySet();

        System.out.println(entrySet);
//set리스트에 작성한 목록을 키라는 변수명으로 하나씩 가져올때
        //<Map.Entry<String,String>> 형태로 가져온다
        for(Map.Entry<String,String> entry : entrySet){
//키와 값 한쌍씩 가져온 값에서 하나씩 출력
        System.out.println(entry.getKey+":"+map.get(key));
        }
    }
}
