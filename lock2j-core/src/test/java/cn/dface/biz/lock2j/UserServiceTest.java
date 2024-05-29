package cn.dface.biz.lock2j;

import cn.dface.biz.lock.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author akun
 * @create 2024-05-29 下午3:26
 **/
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void lockTest() {

        userService.save(1, "jack", "13758180638");
    }
}
