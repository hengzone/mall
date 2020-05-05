package com.felix.mall.service;

import com.felix.mall.bean.UmsMember;
import com.felix.mall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface MemberService {

  List<UmsMember> getAllMember();

  List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
  
}
