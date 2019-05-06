package com.example.demo.dao;

import com.example.demo.core.universal.Mapper;
import com.example.demo.model.UserRole;

import java.util.List;

public interface UserRoleMapper extends Mapper<UserRole> {
    List<String> getRolesByUserId(String userId);
}