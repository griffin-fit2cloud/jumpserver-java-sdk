package jms;

import com.jumpserver.sdk.v2.model.Role;
import org.junit.Test;

import java.util.List;

public class JmsRoleServiceTest extends CommonBeforeTest {
    @Test
    public void list() {
        List<Role> list = os.roles().list();
        System.out.println(com.alibaba.fastjson.JSONObject.toJSONString(list));
    }
}
