package org.example1;

/*En el patrón esta clase representa el estado extrínseco (información que se puede cambiar desde el exterior) */
public class User {
    private String userId;
    private String userName;
    private Role role;

    public User(String userId, String userName, Role role) {
        this.userId = userId;
        this.userName = userName;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", role=" + role.getRoleName() +
                ", permissions=" + role.getPermissions() +
                '}';
    }
}
