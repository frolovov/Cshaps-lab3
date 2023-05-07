package Csharp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
		Map<Integer, List<Student>> groupsForIOEC = new HashMap<Integer, List<Student>>();
		List<Student> group109 = new ArrayList<Student>();
		group109.add(frolov);
		group109.add(petrov);
		group109.add(ivanov);
		group109.add(lebedev);
		List<Student> group110 = new ArrayList<Student>();
		group110.add(antonov);
		group110.add(borisov);
		group110.add(panteleev);
		group110.add(savelyev);
		List<Student> group209 = new ArrayList<Student>();
		group209.add(zaicev);
		group209.add(markov);
		group209.add(krylov);
		group209.add(zaharov);
		List<Student> group210 = new ArrayList<Student>();
		group210.add(fedorov);
		group210.add(birukov);
		group210.add(kozov);
		group210.add(yudin);
		groupsForIOEC.put(109, group109);
		groupsForIOEC.put(110, group110);
		groupsForIOEC.put(209, group209);
		groupsForIOEC.put(210, group210);
		
		
		// students of institute Of Humanitarian Sciences
		Student orlov = createStudent("Орлов", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student ulianov = createStudent("Ульянов", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student kulakov = createStudent("Кулаков", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student paramonov = createStudent("Парамонов", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student stolarov = createStudent("Столяров", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student titov = createStudent("Титов", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student korolev = createStudent("Королёв", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student belov = createStudent("Белов", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student bulgakov = createStudent("Булгаков", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student yakovlev = createStudent("Яковлев", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student gusev = createStudent("Гусев", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student melnikov = createStudent("Мельников", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student gromov = createStudent("Громов", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student grachev = createStudent("Грачев", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student mironov = createStudent("Миронов", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		Student smirnov = createStudent("Смирнов", new Lesson[] {philosophy, sociology, russianLanguage, russianLiterature}, new int[] {5, 5, 5, 5});
		
		// Map of courses and groups for institute Of Humanitarian Sciences
		Map<Integer, Integer[]> coursesForIOHC = new HashMap<Integer, Integer[]>();
		coursesForIOHC.put((Integer)1, new Integer[] {101, 102});
		coursesForIOHC.put((Integer)2, new Integer[] {201, 202});
		
		// Map of groups and students for institute Of Humanitarian Sciences
		Map<Integer, List<Student>> groupsForIOHC = new HashMap<Integer, List<Student>>();
		List<Student> group101 = new ArrayList<Student>();
		group101.add(orlov);
		group101.add(ulianov);
		group101.add(kulakov);
		group101.add(paramonov);
		List<Student> group102 = new ArrayList<Student>();
		group102.add(stolarov);
		group102.add(titov);
		group102.add(korolev);
		group102.add(belov);
		List<Student> group201 = new ArrayList<Student>();
		group201.add(bulgakov);
		group201.add(yakovlev);
		group201.add(gusev);
		group201.add(melnikov);
		List<Student> group202 = new ArrayList<Student>();
		group202.add(gromov);
		group202.add(grachev);
		group202.add(mironov);
		group202.add(smirnov);
		groupsForIOHC.put(101, group101);
		groupsForIOHC.put(102, group102);
		groupsForIOHC.put(201, group201);
		groupsForIOHC.put(202, group202);
		
		
		Institute instituteOfExactSciences = new Institute("ExactSciences", coursesForIOEC, groupsForIOEC);
		Institute instituteOfHumanitarianSciences = new Institute("HumanitarianSciences", coursesForIOHC, groupsForIOHC);
		
		listOfInstitutes.add(instituteOfExactSciences);
		listOfInstitutes.add(instituteOfHumanitarianSciences);
		
		// overview
		for (Institute institute: listOfInstitutes) {
			for (Map.Entry<Integer, Integer[]> entry: institute.getGroupsOnCourse().entrySet()) {
				for (Map.Entry<Integer, List<Student>> entry2: institute.getStudentsInGroup().entrySet()) {
					List<Student> students = entry2.getValue();
					for (Student student: students) {
						if (entry.getKey() == entry2.getKey() / 100)
						System.out.println(institute + ", course: " + entry.getKey() + ", group: " + entry2.getKey() + ", student: " + student);
					}
				}
				System.out.println();
			}
		}
		
		// console for user
		Scanner in = new Scanner(System.in);
		System.out.println("Выберите запрос который нужно выполнить:\n"
				+ "1) фамилии студентов, у которых две и более двоек за сессию, и удалить их (выведя сообщение)"
				+ "2) институт, на котором на первом курсе наибольшее количество отличников"
				+ "3) курс, на котором исключено большее количество студентов"
				+ "4) институт с наибольшим количеством отличников"
				+ "5) полный список отличников с указанием института, группы и курса, где они учатся"
				+ "6) группу, где нет двоечников"
				+ "7) институт и курс, на котором средний бал не меньше 3,5"
				+ "8) фамилии студентов, у которых нет троек и двоек"
				+ "9) институт и группу, где наибольшее количество отличников"
				+ "10) фамилии студентов-отличников на третьем курсе"
				+ "11) предметы и перечень кафедр, на которых они присутствуют"
				+ "12) фамилии студентов, группу и институт, где средний балл составляет 4,5"
				+ "13) студентов первого курса, у которых три двойки и удалите их"
				+ "14) группы, в которых нет двоечников"
				+ "15) фамилии студентов-отличников на первом и втором курсах по всем институтам, средний балл по каждой группе и упорядочьте группы по нему"
				+ "16) институты, на которых нет двоечников"
				+ "17) фамилии студентов, которые не явились хотя бы на один экзамен (оценка 0) и удалите тех, у которых средний балл ниже 3"
				+ "18) институт, на котором на первом курсе наибольшее количество групп, где нет двоек"
				+ "19) курс с наибольшим количеством отличников"
				+ "20) институт, на котором на первом курсе наибольшее количество двоечников"
				+ "21) группы, в которых нет отличников"
				+ "22) полный список двоечников с указанием института, группы и курса, где они учатся"
				+ "23) фамилии студентов-отличников на втором курсе с указанием группы и института, где они учатся");
		
		switch(in.nextInt()) {
			case 1:
				// task 1
				
				System.out.println("Task 1: фамилии студентов, у которых две и более двоек за сессию, и удалить их (выведя сообщение)\n");
				break;
			
			case 2:
				// task 2
				
				System.out.println("Task 2: институт, на котором на первом курсе наибольшее количество отличников\n");
				break;		
			
			case 3:
				// task 3
						
				System.out.println("Task 3: курс, на котором исключено большее количество студентов\n");
				break;
			
			case 4:
				// task 4
						
				System.out.println("Task 4: институт с наибольшим количеством отличников\n");
				break;
				
			case 5:	
				// task 5
				
				System.out.println("Task 5: полный список отличников с указанием института, группы и курса, где они учатся\n");
				break;
				
			case 6:
				// task 6
				
				System.out.println("Task 6: группу, где нет двоечников\n");
				break;
				
			case 7:
				// task 7
				
				System.out.println("Task 7: институт и курс, на котором средний бал не меньше 3,5\n");
				break;
				
			case 8:	
				// task 8
				
				System.out.println("Task 8: фамилии студентов, у которых нет троек и двоек\n");
				break;
				
			case 9:	
				// task 9
				
				System.out.println("Task 9: институт и группу, где наибольшее количество отличников\n");
				break;
				
			case 10:	
				// task 10
				
				System.out.println("Task 10: фамилии студентов-отличников на третьем курсе\n");
				break;
				
			case 11:	
				// task 11
				
				System.out.println("Task 11: предметы и перечень кафедр, на которых они присутствуют\n");
				break;
			
			case 12:	
				// task 12
				
				System.out.println("Task 12: фамилии студентов, группу и институт, где средний балл составляет 4,5\n");
				break;
				
			case 13:
				// task 13
				
				System.out.println("Task 13: студентов первого курса, у которых три двойки и удалите их\n");
				break;
				
			case 14:	
				// task 14
				
				System.out.println("Task 14: группы, в которых нет двоечников\n");
				break;
				
			case 15:
				// task 15
				
				System.out.println("Task 15: фамилии студентов-отличников на первом и втором курсах по всем институтам, средний балл по каждой группе и упорядочьте группы по нему\n");
				break;
				
			case 16:
				// task 16
				
				System.out.println("Task 16: институты, на которых нет двоечников\n");
				break;
				
			case 17:
				// task 17
				
				System.out.println("Task 17: фамилии студентов, которые не явились хотя бы на один экзамен (оценка 0) и удалите тех, у которых средний балл ниже 3\n");
				break;
				
			case 18:
				// task 18
				Map<Institute, Integer> AmountOfGroupsWhichHasNotMarkTwo = new HashMap<Institute, Integer>();
				for (Institute institute: listOfInstitutes) {
					int count = 0;
					for (Map.Entry<Integer, Integer[]> entry: institute.getGroupsOnCourse().entrySet()) {
						if (entry.getKey() == 1) {
							Integer[] groups = entry.getValue();
							for (Integer group: groups) {
								for (Map.Entry<Integer, List<Student>> entry2: institute.getStudentsInGroup().entrySet()) {
									if (group == entry2.getKey()) {
										List<Student> students = entry2.getValue();
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
				System.out.println("Task 18: институт, на котором на первом курсе наибольшее количество групп, где нет двоек\n" + AmountOfGroupsWhichHasNotMarkTwo.toString());
				break;
				
			case 19:
				// task 19
				
				System.out.println("Task 19: курс с наибольшим количеством отличников\n");
				break;
				
			case 20:
				// task 20
				
				System.out.println("Task 20: институт, на котором на первом курсе наибольшее количество двоечников\n");
				break;
				
			case 21:		
				// task 21
						
				System.out.println("Task 21: группы, в которых нет отличников\n");
				break;
				
			case 22:
				// task 22
				
				System.out.println("Task 22: полный список двоечников с указанием института, группы и курса, где они учатся\n");
				break;
				
			case 23:	
				// task 23
				
				System.out.println("Task 23: фамилии студентов-отличников на втором курсе с указанием группы и института, где они учатся\n");
				break;
		}
	}
	
	public static Student createStudent(String name, Lesson[] lessons, int[] marks) {
		Map<Lesson, Integer> studentMarks = new HashMap<Lesson, Integer>();
		for (int i = 0; i < lessons.length; i++) {
			studentMarks.put(lessons[i], marks[i]);
		}
		return new Student(name, studentMarks);
	}
}
