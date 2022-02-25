package com.hyemin.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.hyemin.api.member.domain
 * fileName : MemberDTO
 * author   : 권혜민
 * date     : 2022-02-11
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-11    권혜민   최초 생성
 */
@Data
@Component
public class MemberDTO {

    private String userid;
    private String name;
    private String address;
    private String phone;
    private double height;
    private double weight;
    private String regdate;
    private int eng;
    private int kor;
    private int math;
    private String id;
    private String pw;
    private String Word;

}