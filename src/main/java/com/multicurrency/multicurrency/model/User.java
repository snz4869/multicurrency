package com.multicurrency.multicurrency.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String npk;

    @Column(name = "user_ad")
    private String userAd;

    private String email;

    private String role;

    private String status;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "approved_by")
    private String approvedBy;

    @Column(name = "approved_date")
    private Date approvedDate;

    public User(Long id, String npk, String userAd, String email, String role, String status, String createdBy, Date createdDate, String updatedBy, Date updatedDate, String approvedBy, Date approvedDate) {
        this.id = id;
        this.npk = npk;
        this.userAd = userAd;
        this.email = email;
        this.role = role;
        this.status = status;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.approvedBy = approvedBy;
        this.approvedDate = approvedDate;
    }

    public User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNpk() {
        return npk;
    }

    public void setNpk(String npk) {
        this.npk = npk;
    }

    public String getUserAd() {
        return userAd;
    }

    public void setUserAd(String userAd) {
        this.userAd = userAd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

}
