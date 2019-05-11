package com.library.models;

import java.sql.Date;
import java.util.List;

public class DetailReader {
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
    private List<Service> services;
    private List<Book> books;
    private String groupName;
    private String instituteName;

    public DetailReader() {
    }

    public DetailReader(Integer id, String firstName, String secondName, String patronymic, Date birthDate, Date registrationDate, Integer debt, String statusShort, String eMail, String phoneNumber, List<Service> services, List<Book> books, String groupName, String instituteName) {
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
        this.services = services;
        this.books = books;
        this.groupName = groupName;
        this.instituteName = instituteName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getDebt() {
        return debt;
    }

    public void setDebt(Integer debt) {
        this.debt = debt;
    }

    public String getStatusShort() {
        return statusShort;
    }

    public void setStatusShort(String statusShort) {
        this.statusShort = statusShort;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }
}
