package com.carousel.school.mapper;

import com.carousel.school.model.RolePermission;
import com.carousel.school.model.RolePermissionWithBLOBs;

public interface RolePermissionMapper {

    int deleteByPrimaryKey(String user);

    int insert(RolePermissionWithBLOBs record);

    int insertSelective(RolePermissionWithBLOBs record);

    RolePermissionWithBLOBs selectByPrimaryKey(String user);

    int updateByPrimaryKeySelective(RolePermissionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RolePermissionWithBLOBs record);

    int updateByPrimaryKey(RolePermission record);
}