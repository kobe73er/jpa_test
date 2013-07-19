package com.dengpf.database.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the EMP database table.
 * 
 */
@Entity
public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long empno;

	private BigDecimal comm;

	private BigDecimal deptno;

	private String ename;

	@Temporal(TemporalType.DATE)
	private Date hiredate;

	private String job;

	private BigDecimal mgr;

	private BigDecimal sal;

	public Emp() {
	}

	public long getEmpno() {
		return this.empno;
	}

	public void setEmpno(long empno) {
		this.empno = empno;
	}

	public BigDecimal getComm() {
		return this.comm;
	}

	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}

	public BigDecimal getDeptno() {
		return this.deptno;
	}

	public void setDeptno(BigDecimal deptno) {
		this.deptno = deptno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public BigDecimal getMgr() {
		return this.mgr;
	}

	public void setMgr(BigDecimal mgr) {
		this.mgr = mgr;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

}