package com.bz.smart_city.commom.util;

import com.bz.smart_city.entity.UserEntity;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtil {
    public static UserEntity getCurrentUser() {
        return (UserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
