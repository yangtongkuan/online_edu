package net.online.edu.mapper;

import net.online.edu.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2020/5/18 21:16
 * @To change this template use File | Settings | File Templates.
 */
@Repository
public class UserMapper {

    private static Map<Integer,User> userMap = new HashMap<>();

    static {
        userMap.put(1,new User(1,"jack","123"));
        userMap.put(2,new User(2,"xdclass-lw","123456"));
        userMap.put(3,new User(3,"tom","123456789"));
    }

}
