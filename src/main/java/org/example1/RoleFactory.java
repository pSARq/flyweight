package org.example1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoleFactory {
    private static final Map<String, Role> roles = new HashMap<>();

    private RoleFactory() {
    }

    //Este método me reemplaza lo mismo que está comentado abajo.
    public static Role getRole(String roleName, List<String> permissions) {
        return roles.computeIfAbsent(roleName, key -> new UserRole(key, permissions));
    }

    /*

    public static Role getRole(String roleName, List<String> permissions) {
        if (!roles.containsKey(roleName)) {
            roles.put(roleName, new UserRole(roleName, permissions));
        }
        return roles.get(roleName);
    }

    */

}
