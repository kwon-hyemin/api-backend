package com.hyemin.api.member.service;

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
   String memberList();
   String memberInformation();
   String viewShippingList();
   String registerToSendMail();
   String listOfPoints();
   String DepositDetails();
   String accumulate();
   String delete();



}
