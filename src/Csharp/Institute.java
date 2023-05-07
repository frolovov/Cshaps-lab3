package Csharp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Institute {
	private String name;
	private int numberOfDeductions;
	private Map<Integer, Integer[]> groupsOnCourse = new HashMap<Integer, Integer[]>();
	private Map<Integer, List<Student>> studentsInGroup = new HashMap<Integer, List<Student>>();
	
	public Institute(String name, Map<Integer, Integer[]> groupsOnCourse, Map<Integer, List<Student>> studentsInGroup) {
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
	public int getNumberOfDeductions() {
		return numberOfDeductions;
	}

	public void setNumberOfDeductions(int numberOfDeductions) {
		this.numberOfDeductions = numberOfDeductions;
	}

	public Map<Integer, Integer[]> getGroupsOnCourse() {
		return groupsOnCourse;
	}
	public void setGroupsOnCourse(Map<Integer, Integer[]> groupsOnCourse) {
		this.groupsOnCourse = groupsOnCourse;
	}
	public Map<Integer, List<Student>> getStudentsInGroup() {
		return studentsInGroup;
	}
	public void setStudentsInGroup(Map<Integer, List<Student>> studentsInGroup) {
		this.studentsInGroup = studentsInGroup;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
