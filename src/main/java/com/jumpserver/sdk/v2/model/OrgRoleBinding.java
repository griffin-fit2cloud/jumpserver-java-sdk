package com.jumpserver.sdk.v2.model;

import com.jumpserver.sdk.v2.model.entity.ModelEntity;

public class OrgRoleBinding implements ModelEntity {
    private String id;
    private String user;
    private String user_display;
    private String role;//系String[] roles，奈何Api不支持
    private String role_display;
    private String scope;
    private String org;
    private String org_name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser_display() {
        return user_display;
    }

    public void setUser_display(String user_display) {
        this.user_display = user_display;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole_display() {
        return role_display;
    }

    public void setRole_display(String role_display) {
        this.role_display = role_display;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }
}
