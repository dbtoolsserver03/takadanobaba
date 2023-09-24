package jp.co.saisk.entity;

import java.util.Date;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private Date birthday;
    private String photo;//头像路径
    private String vSalary;

    public String getvSalary() {
		return vSalary;
	}

	public void setvSalary(String vSalary) {
		this.vSalary = vSalary;
	}

	public Employee() {
    }

    public Employee(Integer id, String name, Double salary, Date birthday, String photo) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
        this.photo = photo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
