package br.com.usjt.aeroporto.entity;

import org.springframework.security.core.GrantedAuthority;

public class PermissionAuthority implements GrantedAuthority {

    private String permission;

    private static final long serialVersionUID = -2459640291975462835L;

    public PermissionAuthority(String permission) {
        this.permission = permission;
    }

    @Override
    public String getAuthority() {
        return permission;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((permission == null) ? 0 : permission.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof PermissionAuthority)) {
            return false;
        }
        PermissionAuthority other = (PermissionAuthority) obj;
        if (permission == null) {
            if (other.permission != null) {
                return false;
            }
        } else if (!permission.equals(other.permission)) {
            return false;
        }
        return true;
    }

}
