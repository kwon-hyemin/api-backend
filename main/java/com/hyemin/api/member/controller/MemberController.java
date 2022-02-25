package com.hyemin.api.member.controller;

import com.hyemin.api.member.domain.CalcDTO;
import com.hyemin.api.member.domain.LottoDTO;
import com.hyemin.api.member.domain.MemberDTO;
import com.hyemin.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * packageName: com.hyemin.api.member.controller
 * fileName : MemberController
 * author   : 권혜민
 * date     : 2022-02-11
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-11    권혜민   최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService service;

    @PostMapping("/calc")
    public String calc(@RequestBody CalcDTO calc){
        return service.calc(calc);
    }
    @PostMapping("/bmi")
    public String bmi(@RequestBody MemberDTO bmi){
        return service.bmi(bmi);
    }

    @PostMapping("/grade")
    public String grade(@RequestBody MemberDTO grade){
        return service.grade(grade);
    }

    @PostMapping("/login")
    public String login(@RequestBody MemberDTO login){
        return service.login(login);
    }

    @PostMapping("/lotto")
    public String lotto(@RequestBody LottoDTO lotto){
        return service.lotto(lotto);
    }

}

