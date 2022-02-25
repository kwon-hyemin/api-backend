package com.hyemin.api.member.service;

import com.hyemin.api.member.domain.CalcDTO;
import com.hyemin.api.member.domain.LottoDTO;
import com.hyemin.api.member.domain.MemberDTO;
import com.hyemin.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Scanner;


/**
 * packageName: com.hyemin.api.member.service
 * fileName : MemberServiceimpl
 * author   : 권혜민
 * date     : 2022-02-11
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-11    권혜민   최초 생성
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private  final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
        switch (calc.getOpcode()){
            case "+" :
                res = a+b;break;
            case "-" :
                res = a-b;break;
            case "*" :
                res = a*b;break;
            case "/" :
                res = a/b;break;
            case "%" :
                res = a%b;break;
        }

        return String.format("%d %s %d = %d",a,op,b,res) ;

    }

    @Override
    public String bmi(MemberDTO bmi) {
        Scanner scanner = new Scanner(System.in);
        double bmi1 = bmi.getWeight() / (bmi.getHeight() * bmi.getHeight()) * 10000;
        String s = "";
        if(bmi1 >= 35){
            s = "고도비만";
        }else if(bmi1 >= 30){
            s = "중(重)도 비만 (2단계 비만)";
        }else if(bmi1 >= 25){
            s = "경도 비만 (1단계 비만)";
        }else if(bmi1 >= 23){
            s = "과체중";
        }else if(bmi1 >= 18.5){
            s = "정상";
        }else {
            s = "저체중";
        }
        return bmi.getName()+" : "+s;
    }

    @Override
    public String grade(MemberDTO grade) {

        System.out.println(" GradeService 에 들어옴 ");
        System.out.println(grade.toString());
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String res = (avg >=60) ? "합격" : "불합격";
        return String.format(
                        " * 이름: %s\n" +
                        " * > 국어: %d점\n" +
                        " * > 영어: %d점\n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점\n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################", grade.getName(), grade.getKor(),
                grade.getEng(), grade.getMath(), total, avg, res);

    }

    @Override
    public String login(MemberDTO login) {
        return String.format("### %s ###\n" +
                        "%s 검색결과 ",
                login.getWord());
    }

    @Override
    public String lotto(LottoDTO lotto) {
        return null;
    }

}