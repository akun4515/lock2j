package cn.dface.biz.lock2j;

import cn.dface.biz.lock2j.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author akun
 * @create 2024-05-29 下午5:25
 **/
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void saveTest() {

        userService.save(11, "测试");
    }
}
