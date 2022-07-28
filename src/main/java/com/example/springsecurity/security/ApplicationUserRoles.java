package com.example.springsecurity.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.springsecurity.security.ApplicationUserPermission.*;

/**
 * @author : AliIsayev
 * @mailto : aisayev@aris.az
 * @created : 7/28/2022, Thursday
 **/
public enum ApplicationUserRoles {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE,STUDENT_READ,STUDENT_WRITE));

    private final Set<ApplicationUserPermission> applicationUserPermissions;


    ApplicationUserRoles(Set<ApplicationUserPermission> applicationUserPermissions) {
        this.applicationUserPermissions = applicationUserPermissions;
    }

    public Set<ApplicationUserPermission> getApplicationUserPermissions() {
        return applicationUserPermissions;
    }
}
