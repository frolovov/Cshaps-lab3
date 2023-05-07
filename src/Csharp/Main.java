package Csharp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	// Lessons for institute Of Exact Sciences
	static Lesson math = new Lesson("math", "math and programming");
	static Lesson programming = new Lesson("programming", "math and programming");
	static Lesson physics = new Lesson("physics", "physics and chemistry");
	static Lesson chemistry = new Lesson("chemistry", "physics and chemistry");
			
	// Lessons for institute Of Humanitarian Sciences
	static Lesson philosophy = new Lesson("philosophy", "philosophy and sociology");
	static Lesson sociology = new Lesson("sociology", "philosophy and sociology");
	static Lesson russianLanguage = new Lesson("russian language", "russian language and literature");
	static Lesson russianLiterature = new Lesson("russian literature", "russian language and literature");
	
	public static void main(String[] args) {
		// institutes in amount
		List<Institute> listOfInstitutes = new ArrayList<Institute>();
		
		// students of institute Of Exact Sciences
		Student frolov = createStudent("Фролов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student petrov = createStudent("Петров", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student ivanov = createStudent("Иванов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student lebedev = createStudent("Лебедев", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student antonov = createStudent("Антонов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student borisov = createStudent("Борисов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student panteleev = createStudent("Пантелеев", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student zaicev = createStudent("Зайцев", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student markov = createStudent("Марков", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student birukov = createStudent("Бирюков", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student zaharov = createStudent("Захаров", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student fedorov = createStudent("Федоров", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student kozov = createStudent("Козов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student krylov = createStudent("Крылов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student savelyev = createStudent("Савельев", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student yudin = createStudent("Юдин", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		
		// Map of courses and groups for institute Of Exact Sciences
		Map<Integer, Integer[]> coursesForIOEC = new HashMap<Integer, Integer[]>();
		coursesForIOEC.put((Integer)1, new Integer[] {109, 110});
		coursesForIOEC.put((Integer)2, new Integer[] {209, 210});
		
		// Map of groups and students for institute Of Exact Sciences
		Map<Integer, Student[]> groupsForIOEC = new HashMap<Integer, Student[]>();
		groupsForIOEC.put(109, new Student[] {frolov, petrov, ivanov, lebedev});
		groupsForIOEC.put(110, new Student[] {antonov, borisov, panteleev, savelyev});
		groupsForIOEC.put(209, new Student[] {zaicev, markov, krylov, zaharov});
		groupsForIOEC.put(210, new Student[] {fedorov, birukov, kozov, yudin});
		
		
		// students of institute Of Exact Sciences
		Student orlov = createStudent("Орлов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student ulianov = createStudent("Ульянов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student kulakov = createStudent("Кулаков", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student paramonov = createStudent("Парамонов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student stolarov = createStudent("Столяров", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student titov = createStudent("Титов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student korolev = createStudent("Королёв", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student belov = createStudent("Белов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student bulgakov = createStudent("Булгаков", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student yakovlev = createStudent("Яковлев", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student gusev = createStudent("Гусев", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student melnikov = createStudent("Мельников", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student gromov = createStudent("Громов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student grachev = createStudent("Грачев", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student mironov = createStudent("Миронов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		Student smirnov = createStudent("Смирнов", new Lesson[] {math, programming, physics, chemistry}, new int[] {5, 5, 5, 5});
		
		// Map of courses and groups for institute Of Humanitarian Sciences
		Map<Integer, Integer[]> coursesForIOHC = new HashMap<Integer, Integer[]>();
		coursesForIOHC.put((Integer)1, new Integer[] {101, 102});
		coursesForIOHC.put((Integer)2, new Integer[] {201, 202});
		
		// Map of groups and students for institute Of Humanitarian Sciences
		Map<Integer, Student[]> groupsForIOHC = new HashMap<Integer, Student[]>();
		groupsForIOHC.put(101, new Student[] {orlov, ulianov, kulakov, paramonov});
		groupsForIOHC.put(102, new Student[] {stolarov, titov, korolev, belov});
		groupsForIOHC.put(201, new Student[] {bulgakov, yakovlev, gusev, melnikov});
		groupsForIOHC.put(202, new Student[] {gromov, grachev, mironov, smirnov});
		
		
		Institute instituteOfExactSciences = new Institute("ExactSciences", coursesForIOEC, groupsForIOEC);
		Institute instituteOfHumanitarianSciences = new Institute("HumanitarianSciences", coursesForIOHC, groupsForIOHC);
		
		listOfInstitutes.add(instituteOfExactSciences);
		listOfInstitutes.add(instituteOfHumanitarianSciences);
		
		
		// task 18
		Map<Institute, Integer> AmountOfGroupsWhichHasNotMarkTwo = new HashMap<Institute, Integer>();
		for (Institute institute: listOfInstitutes) {
			int count = 0;
			for (Map.Entry<Integer, Integer[]> entry: institute.getGroupsOnCourse().entrySet()) {
				if (entry.getKey() == 1) {
					Integer[] groups = entry.getValue();
					for (Integer group: groups) {
						for (Map.Entry<Integer, Student[]> entry2: institute.getStudentsInGroup().entrySet()) {
							if (group == entry2.getKey()) {
								Student[] students = entry2.getValue();
								boolean flag = true;
								for (Student student: students) {
									if(student.isHaveMarkTwo()) {
										flag = false;
									}
								}
								if (flag) {
									count++;
								}
							}
						}
					}
				}
			}
			AmountOfGroupsWhichHasNotMarkTwo.put(institute, count);
		}
		System.out.println(AmountOfGroupsWhichHasNotMarkTwo.toString());
		
	}
	
	public static Student createStudent(String name, Lesson[] lessons, int[] marks) {
		Map<Lesson, Integer> studentMarks = new HashMap<Lesson, Integer>();
		for (int i = 0; i < lessons.length; i++) {
			studentMarks.put(lessons[i], marks[i]);
		}
		return new Student(name, studentMarks);
	}
}
