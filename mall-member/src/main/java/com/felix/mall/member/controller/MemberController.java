package com.felix.mall.member.controller;

import com.felix.mall.member.bean.UmsMember;
import com.felix.mall.member.bean.UmsMemberReceiveAddress;
import com.felix.mall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

  @Autowired
  MemberService memberService;

  @RequestMapping("getAllMember")
  @ResponseBody
  public List<UmsMember> getAllMember() {
    List<UmsMember> umsMembersList =  memberService.getAllMember();
    return umsMembersList;
  }

  @RequestMapping("getReceiveAddressByMemberId")
  @ResponseBody
  public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
    List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = memberService.getReceiveAddressByMemberId(memberId);
    return umsMemberReceiveAddresses;
  }

  @RequestMapping("index")
  @ResponseBody
  public String index() {
    return "hello";
  }

}
