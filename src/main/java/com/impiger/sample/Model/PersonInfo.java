package com.impiger.sample.Model;

import javax.persistence.*;

@Entity
@Table(name = "user_info")

public class PersonInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int personId;

    @Basic
    @Column(name = "name")
    String name;

    @Basic
    @Column(name = "email")
    String email;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
