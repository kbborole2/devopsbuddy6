package com.devopsbuddy6.enums;

/**
 * Created by kb on 7/20/2017.
 */

public enum RolesEnum {

    BASIC(1, "ROLE_BASIC"),
    PRO(2, "ROLE_PRO"),
    ADMIN(3, "ROLE_ADMIN");

    private int id;

    private final String roleName;


    RolesEnum(int id, String roleName) {
        this.id=id;
        this.roleName=roleName;
    }

    public int getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }
}
