 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.example.demo.core.aop;

 import java.lang.annotation.*;

 /**
  * @author chendesheng chendesheng@tuhu.cn
  * @since 2019/5/6 17:13
  */
 @Target(ElementType.METHOD)
 @Retention(RetentionPolicy.RUNTIME)
 @Documented
 public @interface AnnotationLog {
     String remark() default "";
 }
