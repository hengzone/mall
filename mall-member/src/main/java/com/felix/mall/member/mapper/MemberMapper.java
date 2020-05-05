package com.felix.mall.member.mapper;

import com.felix.mall.member.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MemberMapper extends Mapper<UmsMember> {

  List<UmsMember> selectAllMember();

}
