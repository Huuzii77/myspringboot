 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.controller;

 import com.example.demo.model.UserInfo;
 import org.apache.shiro.SecurityUtils;
 import org.apache.shiro.authz.UnauthenticatedException;
 import org.apache.shiro.authz.UnauthorizedException;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/5/6 17:45
  */
 @RestController
 @RequestMapping("shiroUtils")
 public class ShiroUtilsController {
     @GetMapping("/noLogin")
     public void noLogin() {
         throw new UnauthenticatedException();
     }
    
     @GetMapping("/noAuthorize")
     public void noAuthorize() {
         throw new UnauthorizedException();
     }
    
    
     @PostMapping("/getNowUser")
     public UserInfo getNowUser() {
         UserInfo u = (UserInfo) SecurityUtils.getSubject().getPrincipal();
         return u;
     }
     
     
 }
