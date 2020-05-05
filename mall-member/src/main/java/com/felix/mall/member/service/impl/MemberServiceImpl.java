package com.felix.mall.member.service.impl;

import com.felix.mall.member.bean.UmsMember;
import com.felix.mall.member.bean.UmsMemberReceiveAddress;
import com.felix.mall.member.mapper.MemberMapper;
import com.felix.mall.member.mapper.UmsMemberReceiveAddressMapper;
import com.felix.mall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

  @Autowired
  MemberMapper memberMapper;

  @Autowired
  UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

  @Override
  public List<UmsMember> getAllMember() {
//    List<UmsMember> umsMemberList =  memberMapper.selectAllMember();
    List<UmsMember> umsMemberList =  memberMapper.selectAll();
    return umsMemberList;
  }

  @Override
  public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

//    UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
//    umsMemberReceiveAddress.setMemberId(memberId);
//    List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

    Example example = new Example(UmsMemberReceiveAddress.class);
    example.createCriteria().andEqualTo("memberId", memberId);
    List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.selectByExample(example);

    return umsMemberReceiveAddressList;
  }
}
