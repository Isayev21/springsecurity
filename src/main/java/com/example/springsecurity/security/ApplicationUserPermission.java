package com.example.springsecurity.security;

/**
 * @author : AliIsayev
 * @mailto : aisayev@aris.az
 * @created : 7/28/2022, Thursday
 **/
public enum ApplicationUserPermission {
    STUDENT_WRITE("student:write"),
    STUDENT_READ("student:read"),
    COURSE_WRITE("course_write"),
    COURSE_READ("course:read");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
