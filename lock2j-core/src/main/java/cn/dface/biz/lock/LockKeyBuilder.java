package cn.dface.biz.lock;

import org.aopalliance.intercept.MethodInvocation;

/**
 * @author akun
 * @create 2024-05-29 上午10:18
 **/
public interface LockKeyBuilder {

    /**
     * 构建key
     *
     * @param invocation     invocation
     * @param definitionKeys 定义
     * @return key
     */
    String buildKey(MethodInvocation invocation, String[] definitionKeys);
}
