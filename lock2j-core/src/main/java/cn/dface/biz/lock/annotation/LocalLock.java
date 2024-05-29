package cn.dface.biz.lock.annotation;

import cn.dface.biz.lock.excutor.LocalLockExecutor;

import java.lang.annotation.*;

/**
 * @author akun
 * @create 2024-05-29 下午2:47
 **/
@Lock4j(executor = LocalLockExecutor.class)
@Target(value = {ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
public @interface LocalLock {
}
