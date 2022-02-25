package com.hyemin.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.hyemin.api.member.domain
 * fileName : CalcDTO
 * author  : 권혜민
 * date   : 2022-02-25
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-02-25     권혜민       최초 생성
 */
@Data
@Component
public class CalcDTO {

    private int num1;
    private String opcode;
    private int num2;
}
