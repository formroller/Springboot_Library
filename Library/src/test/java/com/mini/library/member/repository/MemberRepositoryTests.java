package com.mini.library.member.repository;

import com.mini.library.domain.Member.entity.Member;
import com.mini.library.domain.Member.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTests {
    @Autowired
    private MemberRepository repository;

    @Test
    public void insertTest(){
        IntStream.rangeClosed(1,100).forEach(i->{

            Random random = new Random();


            ArrayList<String> lastName = new ArrayList<>(Arrays.asList("이","김","박","최","문","강","육","길","윤","한","전"));
            ArrayList<String> firstName = new ArrayList<>(Arrays.asList("춘","망","담","지","관","은","준","용","종","광"));
            ArrayList<String> middleName = new ArrayList<>(Arrays.asList("병","을","삼","직","환","승","일","기","혁","민"));

            Member member = Member.builder()
                    .mid(i)
                    .mname(lastName.get(random.nextInt(10))+middleName.get(random.nextInt(10))+firstName.get(random.nextInt(10)))
                    .password("1111")
                    .phone("010-"+numberGen(4)+"-"+numberGen(4))
                    .build();

            repository.save(member);
        });
    }


    // 전화번호 뒤 4자리 난수 생성
    public static String numberGen(int len){
        Random random = new Random();
        String numStr = ""; //난수가 저장될 변수

        for(int i=0; i<len; i++){
            // 0-9 난수 생성
            String ran = Integer.toString(random.nextInt(10));

            numStr+=ran;

            // 중복 검사
            if(!numStr.contains(ran)) numStr+= ran;
        }
        return numStr;
    }

// 휴대전화 4자리 난수 - [[Java] 인증번호 2자리 4자리 6자리 등 난수 생성 (중복허용, 중복제거)](https://6developer.com/4)
//    /**
//     * 전달된 파라미터에 맞게 난수를 생성한다
//     * @param len : 생성할 난수의 길이
//     * @param dupCd : 중복 허용 여부 (1: 중복허용, 2:중복제거)
//     *
//     * Created by 닢향
//     * http://niphyang.tistory.com
//     */
//    public static String numberGen(int len, int dupCd ) {
//
//        Random rand = new Random();
//        String numStr = ""; //난수가 저장될 변수
//
//        for(int i=0;i<len;i++) {
//
//            //0~9 까지 난수 생성
//            String ran = Integer.toString(rand.nextInt(10));
//
//            if(dupCd==1) {
//                //중복 허용시 numStr에 append
//                numStr += ran;
//            }else if(dupCd==2) {
//                //중복을 허용하지 않을시 중복된 값이 있는지 검사한다
//                if(!numStr.contains(ran)) {
//                    //중복된 값이 없으면 numStr에 append
//                    numStr += ran;
//                }else {
//                    //생성된 난수가 중복되면 루틴을 다시 실행한다
//                    i-=1;
//                }
//            }
//        }
//        return numStr;
//    }

}
