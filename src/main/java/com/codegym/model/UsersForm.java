package com.codegym.model;

import org.springframework.web.multipart.MultipartFile;

public class UsersForm {

    private Long id;
    private String name;
    private String email;
    private String address;
    private String doB;
    private String phone;
    private MultipartFile img;

    public UsersForm() {
    }


    public UsersForm(String name, String email, String address, String doB, String phone, MultipartFile img) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.doB = doB;
        this.phone = phone;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }
}
