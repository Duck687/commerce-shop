package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class user {
    private Integer id_user;
    private String name;
    private String surname;
    private String mail;
    private String password;
    private String phone_number;
    private String role;

    public user(Integer id_user, String name, String surname, String mail, String password, String phone_number, String role) {
        this.id_user = id_user;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.phone_number = phone_number;
        this.role = role;
    }

    public user() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
