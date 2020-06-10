package com.ssmimooc.entity;

public class Users {
    private Integer id;

    private String icon;

    private String nickname;

    private String position;

    private String city;

    private String gender;

    private String signature;

    private String higheateducation;

    private String graduateinstitutions;

    private String tel;

    private String email;

    private String password;

    private Double balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getHigheateducation() {
        return higheateducation;
    }

    public void setHigheateducation(String higheateducation) {
        this.higheateducation = higheateducation == null ? null : higheateducation.trim();
    }

    public String getGraduateinstitutions() {
        return graduateinstitutions;
    }

    public void setGraduateinstitutions(String graduateinstitutions) {
        this.graduateinstitutions = graduateinstitutions == null ? null : graduateinstitutions.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}