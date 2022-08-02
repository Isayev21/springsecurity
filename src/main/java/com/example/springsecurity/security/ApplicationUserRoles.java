package com.example.springsecurity.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.example.springsecurity.security.ApplicationUserPermission.*;

/**
 * @author : AliIsayev
 * @mailto : aisayev@aris.az
 * @created : 7/28/2022, Thursday
 **/
public enum ApplicationUserRoles {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE,STUDENT_READ,STUDENT_WRITE)),
    ADMINTRAINEE(Sets.newHashSet(COURSE_READ,STUDENT_READ));


    private final Set<ApplicationUserPermission> applicationUserPermissions;


    ApplicationUserRoles(Set<ApplicationUserPermission> applicationUserPermissions) {
        this.applicationUserPermissions = applicationUserPermissions;
    }

    public Set<ApplicationUserPermission> getApplicationUserPermissions() {
        return applicationUserPermissions;
    }

    public List<SimpleGrantedAuthority> getGrantedAuthorities(){
        List<SimpleGrantedAuthority> permissions = getApplicationUserPermissions().stream()
                .map(applicationUserPermission -> new SimpleGrantedAuthority(applicationUserPermission.getPermission()))
                .collect(Collectors.toList());
        permissions.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
        return permissions;
    }
}
