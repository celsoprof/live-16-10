package br.dev.celso.games.model;

public enum UserRole {

    ADMIN("ADMIN"), USER("USER");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
