package com.newfly101.studykiosk.repository.mapper;

import com.newfly101.studykiosk.model.BaseUser;
import com.newfly101.studykiosk.model.support.BaseUserType;

import java.util.List;

public interface UserMapper {
    BaseUser selectUser(String id);
    List<BaseUser> selectUsersWhereType(BaseUserType type);
    int insertUser(BaseUser account);
}
