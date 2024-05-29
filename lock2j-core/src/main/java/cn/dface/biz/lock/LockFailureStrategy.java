package cn.dface.biz.lock;

import java.lang.reflect.Method;

/**
 * @author akun
 * @create 2024-05-29 上午10:16
 **/
public interface LockFailureStrategy {

    /**
     * 当加锁失败时的处理策略
     *
     * @param key 用于获取锁的key
     * @param method 方法
     * @param arguments 方法参数
     * @throws Exception 处理过程中可能抛出的异常，如果抛出异常则会终止方法执行
     */
    void onLockFailure(String key, Method method, Object[] arguments) throws Exception;
}
