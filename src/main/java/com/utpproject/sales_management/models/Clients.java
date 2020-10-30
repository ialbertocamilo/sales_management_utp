package com.utpproject.sales_management.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Clients {

    private Integer id;
    private String nDoc;
    private String name;
    private String gender;
    private String phone;
    private String email;
    private String address;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "n_doc")
    public String getnDoc() {
        return nDoc;
    }

    public void setnDoc(String nDoc) {
        this.nDoc = nDoc;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clients clients = (Clients) o;
        return Objects.equals(id, clients.id) &&
                Objects.equals(nDoc, clients.nDoc) &&
                Objects.equals(name, clients.name) &&
                Objects.equals(gender, clients.gender) &&
                Objects.equals(phone, clients.phone) &&
                Objects.equals(email, clients.email) &&
                Objects.equals(address, clients.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nDoc, name, gender, phone, email, address);
    }
}
