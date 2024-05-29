package cn.dface.biz.lock2j.service;

import cn.dface.biz.lock2j.annotation.RedisssonLock;
import org.springframework.stereotype.Service;

/**
 * @author akun
 * @create 2024-05-29 下午5:19
 **/
@Service
public class UserServiceImpl implements UserService {

    @Override
    @RedisssonLock(keys = {"#userId", "#name"})
    public void save(Integer userId, String name) {
        System.out.println("save user success");
    }
}
