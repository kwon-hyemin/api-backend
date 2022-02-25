package com.hyemin.api.member.repository;

import com.hyemin.api.member.domain.CalcDTO;
import com.hyemin.api.member.domain.MemberDTO;
import org.springframework.stereotype.Repository;

/**
 * packageName: com.hyemin.api.member.repository
 * fileName : MemberRepositoryimpl
 * author   : 권혜민
 * date     : 2022-02-11
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-11    권혜민   최초 생성
 */
@Repository
public class MemberRepositoryimpl implements MemberRepository   {

    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String bmi(MemberDTO bmi) {
        return null;
    }

    @Override
    public String grade(MemberDTO grade) {
        return null;
    }

    @Override
    public String login(MemberDTO login){return null;}

    @Override
    public String lotto(MemberDTO lotto){return null;}

}
