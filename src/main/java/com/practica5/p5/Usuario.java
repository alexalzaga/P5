package com.practica5.p5;

public class Usuario {
    private String firstname;
    private String lastname;
    private String email;
    private String user;
    private String password;
    private String newsletter;

    public Usuario(String firstname, String lastname, String email, String user, String password, String newsletter) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.user = user;
        this.password = password;
        this.newsletter = newsletter;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    @Override
    public String toString() {
        return "Usuario [username=" + user + ", email=" + email + ", password=" + password + ", firstname=" + firstname
                + ", lastname=" + lastname + ", newsletter=" + newsletter + "]";
    }
}
