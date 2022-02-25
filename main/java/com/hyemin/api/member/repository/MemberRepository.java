package com.hyemin.api.member.repository;

import com.hyemin.api.member.domain.CalcDTO;
import com.hyemin.api.member.domain.MemberDTO;

/**
 * packageName: com.hyemin.api.member.repository
 * fileName : MemberRepository
 * author   : 권혜민
 * date     : 2022-02-11
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-11    권혜민   최초 생성
 */
public interface MemberRepository {

    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);

    String login(MemberDTO login);

    String lotto(MemberDTO lotto);
}
