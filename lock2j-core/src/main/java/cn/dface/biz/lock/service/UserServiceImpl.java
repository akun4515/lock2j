package cn.dface.biz.lock.service;

import cn.dface.biz.lock.annotation.LockWithDefault;
import org.springframework.stereotype.Service;

/**
 * @author akun
 * @create 2024-05-29 下午3:25
 **/
@Service
public class UserServiceImpl implements UserService{


    @Override
    @LockWithDefault(keys = {"#userId","#name","#phone"})
    public void save(Integer userId, String name, String phone) {
        System.out.println("save user success");
    }
}
