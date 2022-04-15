package com.spring.entities;

import javax.persistence.*;
@Entity
@Table(name = "LIBRARY")
public class Library {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "borid")
    private int borid;

    @Column(name = "borName")
    private String borName;

    @Column(name = "borMobno")
    private long borMobno;

    @Column(name = "Dept")
    private String Dept;
    
    @Column(name="bookName")
    private String bookName;

    public Library() {}

    public Library(int borid, String borName, long borMobno, String Dept, String bookName) {
        this.borid = borid;
        this.borName = borName;
        this.borMobno = borMobno;
        this.Dept = Dept;
        this.bookName = bookName;
    }

	public int getBorid() {
		return borid;
	}

	public void setBorid(int borid) {
		this.borid = borid;
	}

	public String getBorName() {
		return borName;
	}

	public void setBorName(String borName) {
		this.borName = borName;
	}

	public long getBorMobno() {
		return borMobno;
	}

	public void setBorMobno(long borMobno) {
		this.borMobno = borMobno;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	@Override
	public String toString()
	{
	return "Library [borid=" + borid + ", borName=" + borName + ", Dept=" + Dept + ", BookName="+ bookName + "]";
	}

   
}