package Csharp;

import java.util.HashMap;
import java.util.Map;

public class Institute {
	private String name;
	private Map<Integer, Integer[]> groupsOnCourse = new HashMap<Integer, Integer[]>();
	private Map<Integer, Student[]> studentsInGroup = new HashMap<Integer, Student[]>();
	
	public Institute(String name, Map<Integer, Integer[]> groupsOnCourse, Map<Integer, Student[]> studentsInGroup) {
		this.name = name;
		this.groupsOnCourse = groupsOnCourse;
		this.studentsInGroup = studentsInGroup;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Integer, Integer[]> getGroupsOnCourse() {
		return groupsOnCourse;
	}
	public void setGroupsOnCourse(Map<Integer, Integer[]> groupsOnCourse) {
		this.groupsOnCourse = groupsOnCourse;
	}
	public Map<Integer, Student[]> getStudentsInGroup() {
		return studentsInGroup;
	}
	public void setStudentsInGroup(Map<Integer, Student[]> studentsInGroup) {
		this.studentsInGroup = studentsInGroup;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
