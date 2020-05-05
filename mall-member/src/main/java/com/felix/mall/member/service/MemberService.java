package com.felix.mall.member.service;

import com.felix.mall.member.bean.UmsMember;
import com.felix.mall.member.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface MemberService {

  List<UmsMember> getAllMember();

  List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
  
}
