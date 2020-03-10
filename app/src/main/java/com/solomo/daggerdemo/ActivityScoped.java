package com.solomo.daggerdemo;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @作者 ：  allens
 * @创建日期 ：2017/7/14 下午3:04
 * @方法作用：
 * 参考Singleton 的写法
 * Scope 标注是Scope
 * Documented 标记在文档
 * @Retention(RUNTIME) 运行时级别
 */
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScoped {
}
