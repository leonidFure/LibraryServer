package com.library.models;

import java.sql.Date;

public class Service {
    private Integer id, readerId,bookBarCode,postId,employeeId;
    private Date lendingDate, returnDate;
    private Integer returnEmployeeId, returnDamageBook;

    public Service() { }

    public Service(Integer id, Integer readerId, Integer bookBarCode, Integer postId, Integer employeeId, Date lendingDate, Date returnDate, Integer returnEmployeeId, Integer returnDamageBook) {
        this.id = id;
        this.readerId = readerId;
        this.bookBarCode = bookBarCode;
        this.postId = postId;
        this.employeeId = employeeId;
        this.lendingDate = lendingDate;
        this.returnDate = returnDate;
        this.returnEmployeeId = returnEmployeeId;
        this.returnDamageBook = returnDamageBook;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReaderId() {
        return readerId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    public Integer getBookBarCode() {
        return bookBarCode;
    }

    public void setBookBarCode(Integer bookBarCode) {
        this.bookBarCode = bookBarCode;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getLendingDate() {
        return lendingDate;
    }

    public void setLendingDate(Date lendingDate) {
        this.lendingDate = lendingDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getReturnEmployeeId() {
        return returnEmployeeId;
    }

    public void setReturnEmployeeId(Integer returnEmployeeId) {
        this.returnEmployeeId = returnEmployeeId;
    }

    public Integer getReturnDamageBook() {
        return returnDamageBook;
    }

    public void setReturnDamageBook(Integer returnDamageBook) {
        this.returnDamageBook = returnDamageBook;
    }
}
