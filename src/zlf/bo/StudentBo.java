package zlf.bo;

import java.util.Set;

public class StudentBo {
	private String name;
	private int age;
	private String sex;
	private String describe;
	private Set set;
	public StudentBo() {
	super();
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public String getSex() {
	return sex;
	}
	public void setSex(String sex) {
	this.sex = sex;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}
	public String getDescribe() {
	return describe;
	}
	public void setDescribe(String describe) {
	this.describe = describe;
	}
}
