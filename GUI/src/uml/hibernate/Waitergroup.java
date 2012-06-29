package uml.hibernate;

// Generated 2012-6-26 17:05:01 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Waitergroup generated by hbm2java
 */
public class Waitergroup implements java.io.Serializable {

	private int waitergroupid;
	private String category;
	private Set waiters = new HashSet(0);

	public Waitergroup() {
	}

	public Waitergroup(int waitergroupid, String category) {
		this.waitergroupid = waitergroupid;
		this.category = category;
	}

	public Waitergroup(int waitergroupid, String category, Set waiters) {
		this.waitergroupid = waitergroupid;
		this.category = category;
		this.waiters = waiters;
	}

	public int getWaitergroupid() {
		return this.waitergroupid;
	}

	public void setWaitergroupid(int waitergroupid) {
		this.waitergroupid = waitergroupid;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Set getWaiters() {
		return this.waiters;
	}

	public void setWaiters(Set waiters) {
		this.waiters = waiters;
	}

}
