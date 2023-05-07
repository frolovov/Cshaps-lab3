package Csharp;

import java.util.HashMap;
import java.util.Map;

public class Student {
	private String surname;
	private Map<Lesson, Integer> marks = new HashMap<Lesson, Integer>();
	
	public Student(String surname, Map<Lesson, Integer> marks) {
		this.surname = surname;
		this.marks = marks;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Map<Lesson, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<Lesson, Integer> marks) {
		this.marks = marks;
	}
	
	public int numberOfMarksTwo() {
		int count = 0;
		for (Map.Entry<Lesson, Integer> mark: marks.entrySet()) {
			if (mark.getValue() == 2) {
				count++;
			}
		}
		return count;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return surname + " " + marks.toString();
	}
}
