package com.hyemin.api.member.service;

import com.hyemin.api.member.domain.CalcDTO;
import com.hyemin.api.member.domain.LottoDTO;
import com.hyemin.api.member.domain.MemberDTO;

/**
 * packageName: com.hyemin.api.member.service
 * fileName : MemberService
 * author   : 권혜민
 * date     : 2022-02-11
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-11    권혜민   최초 생성
 */

public interface MemberService {

    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);

    String login(MemberDTO login);

    String lotto(LottoDTO lotto);
}

