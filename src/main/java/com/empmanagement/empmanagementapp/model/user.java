package com.empmanagement.empmanagementapp.model;


import javax.persistence.*;

@Entity
public class user {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

    @Column
    private String fname;
    @Column
    private String lname;
    @Column
    private  String designation;


    public long getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
