package com.library.models;

import java.sql.Date;

public class Reader {
    private Integer id;
    private String firstName;
    private String secondName;
    private String patronymic;
    private Date birthDate;
    private Date registrationDate;
    private Integer debt;
    private String statusShort;
    private String eMail;
    private String phoneNumber;

    public Reader() {
    }

    public Reader(Integer id,
                  String firstName,
                  String secondName,
                  String patronymic,
                  Date birthDate,
                  Date registrationDate,
                  Integer debt,
                  String statusShort,
                  String eMail,
                  String phoneNumber) {

        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.registrationDate = registrationDate;
        this.debt = debt;
        this.statusShort = statusShort;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public Integer getDebt() {
        return debt;
    }

    public void setDebt(Integer debt) {
        this.debt = debt;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatusShort() {
        return statusShort;
    }

    public void setStatusShort(String statusShort) {
        this.statusShort = statusShort;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }
}
