package com.learn.HiberMToM.Hibernate4;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int t_id;
	String t_name;
	@ManyToMany
	List<Software_Eng>se;
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(int t_id, String t_name, List<Software_Eng> se) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.se = se;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public List<Software_Eng> getSe() {
		return se;
	}
	public void setSe(List<Software_Eng> se) {
		this.se = se;
	}

}
