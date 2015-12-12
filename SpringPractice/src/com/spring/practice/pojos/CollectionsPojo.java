package com.spring.practice.pojos;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsPojo {
	private Set<String> names;
	private List<String> course;
	private Map<String,String> relations;
	public Set<String> getNames() {
		return names;
	}
	public void setNames(Set<String> names) {
		this.names = names;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public Map<String, String> getRelations() {
		return relations;
	}
	public void setRelations(Map<String, String> relations) {
		this.relations = relations;
	}
	
	

}
