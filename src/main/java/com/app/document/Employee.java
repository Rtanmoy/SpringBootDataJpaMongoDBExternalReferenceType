package com.app.document;

import org.springframework.data.annotation.Id;



public class Employee {
	@Id
	private String id;
	
	
	private Integer eid;
	
	private String empName;
	
	private Address addr;
	public Employee() {
		super();
	}
	public Employee(Integer eid, String empName, Address addr) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.addr = addr;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eid=" + eid + ", empName=" + empName + ", addr=" + addr + "]";
	}
	

}
