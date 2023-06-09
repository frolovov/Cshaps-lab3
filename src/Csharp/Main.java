package Csharp;

import java.io.FileWriter;
import java.io.IOException;
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
		List<Lesson> listOfLessons = new ArrayList<Lesson>();

		// students of institute Of Exact Sciences
		Student frolov = createStudent("Фролов", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 5, 5 });
		Student petrov = createStudent("Петров", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 5, 5 });
		Student ivanov = createStudent("Иванов", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 5, 5 });
		Student lebedev = createStudent("Лебедев", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 5, 5 });
		Student antonov = createStudent("Антонов", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 4, 4 });
		Student borisov = createStudent("Борисов", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 4, 4 });
		Student panteleev = createStudent("Пантелеев", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 2, 5 });
		Student zaicev = createStudent("Зайцев", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 5, 2 });
		Student markov = createStudent("Марков", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 4, 4 });
		Student birukov = createStudent("Бирюков", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 3, 4 });
		Student zaharov = createStudent("Захаров", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 3, 4 });
		Student fedorov = createStudent("Федоров", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 3, 4 });
		Student kozov = createStudent("Козов", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 3, 5 });
		Student krylov = createStudent("Крылов", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 4, 5, 5 });
		Student savelyev = createStudent("Савельев", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 5, 5 });
		Student yudin = createStudent("Юдин", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 5, 5 });
		Student kozova = createStudent("Козова", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 3, 5 });
		Student krylova = createStudent("Крылова", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 0, 5, 5 });
		Student savelyeva = createStudent("Савельева", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 4, 4 });
		Student yudina = createStudent("Юдина", new Lesson[] { math, programming, physics, chemistry },
				new int[] { 5, 5, 4, 4 });

		// Map of courses and groups for institute Of Exact Sciences
		Map<Integer, Integer[]> coursesForIOEC = new HashMap<Integer, Integer[]>();
		coursesForIOEC.put((Integer) 1, new Integer[] { 109, 110 });
		coursesForIOEC.put((Integer) 2, new Integer[] { 209, 210 });
		coursesForIOEC.put((Integer) 3, new Integer[] { 309 });

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
		List<Student> group309 = new ArrayList<Student>();
		group309.add(yudina);
		group309.add(kozova);
		group309.add(krylova);
		group309.add(savelyeva);

		groupsForIOEC.put(109, group109);
		groupsForIOEC.put(110, group110);
		groupsForIOEC.put(209, group209);
		groupsForIOEC.put(210, group210);
		groupsForIOEC.put(309, group309);

		// students of institute Of Humanitarian Sciences
		Student orlov = createStudent("Орлов",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 5, 3, 5 });
		Student ulianov = createStudent("Ульянов",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 4, 5, 5 });
		Student kulakov = createStudent("Кулаков",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 5, 2, 5 });
		Student paramonov = createStudent("Парамонов",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 5, 5, 2 });
		Student stolarov = createStudent("Столяров",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 5, 5, 5 });
		Student titov = createStudent("Титов",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 5, 5, 5 });
		Student korolev = createStudent("Королёв",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 4, 4, 5 });
		Student belov = createStudent("Белов",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 5, 5, 5 });
		Student bulgakov = createStudent("Булгаков",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 5, 5, 5 });
		Student yakovlev = createStudent("Яковлев",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 5, 5, 5 });
		Student gusev = createStudent("Гусев",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 5, 5, 5 });
		Student melnikov = createStudent("Мельников",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 0, 2, 2, 2 });
		Student gromov = createStudent("Громов",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 2, 2, 2, 2 });
		Student grachev = createStudent("Грачев",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 2, 2, 2, 2 });
		Student mironov = createStudent("Миронов",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 5, 4, 4, 5 });
		Student smirnov = createStudent("Смирнов",
				new Lesson[] { philosophy, sociology, russianLanguage, russianLiterature }, new int[] { 2, 2, 2, 2 });

		// Map of courses and groups for institute Of Humanitarian Sciences
		Map<Integer, Integer[]> coursesForIOHC = new HashMap<Integer, Integer[]>();
		coursesForIOHC.put((Integer) 1, new Integer[] { 101, 102 });
		coursesForIOHC.put((Integer) 2, new Integer[] { 201, 202 });

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
		Institute instituteOfHumanitarianSciences = new Institute("HumanitarianSciences", coursesForIOHC,
				groupsForIOHC);

		listOfInstitutes.add(instituteOfExactSciences);
		listOfInstitutes.add(instituteOfHumanitarianSciences);
		listOfLessons.add(math);
		listOfLessons.add(programming);
		listOfLessons.add(physics);
		listOfLessons.add(chemistry);
		listOfLessons.add(philosophy);
		listOfLessons.add(sociology);
		listOfLessons.add(russianLanguage);
		listOfLessons.add(russianLiterature);

		// overview
		System.out.println("Данные на вход:");
		printDatabase(listOfInstitutes);

		console(listOfInstitutes, listOfLessons);
	}

	public static Student createStudent(String name, Lesson[] lessons, int[] marks) {
		Map<Lesson, Integer> studentMarks = new HashMap<Lesson, Integer>();
		for (int i = 0; i < lessons.length; i++) {
			studentMarks.put(lessons[i], marks[i]);
		}
		return new Student(name, studentMarks);
	}

	public static void writeIntoFile(String result) {
		try (FileWriter writer = new FileWriter("C:/temp/forQueries.txt", false)) {
			writer.write(result);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void printDatabase(List<Institute> listOfInstitutes) {
		System.out.println();
		for (Institute institute : listOfInstitutes) {
			for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
				for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
					List<Student> students = entry2.getValue();
					for (Student student : students) {
						if (entry.getKey() == entry2.getKey() / 100) {
							System.out.println(institute + ", course: " + entry.getKey() + ", group: " + entry2.getKey()
									+ ", student: " + student);
						}
					}
				}
				System.out.println();
			}
		}
	}

	/**
	 * @param listOfInstitutes
	 */
	public static void console(List<Institute> listOfInstitutes, List<Lesson> listOfLessons) {
		// console for user
		Scanner in = new Scanner(System.in);
		System.out.println("Выберите запрос который нужно выполнить:\n"
				+ "1) фамилии студентов, у которых две и более двоек за сессию, и удалить их (выведя сообщение)\n"
				+ "2) институт, на котором на первом курсе наибольшее количество отличников\n"
				+ "3) курс, на котором исключено большее количество студентов\n"
				+ "4) институт с наибольшим количеством отличников\n"
				+ "5) полный список отличников с указанием института, группы и курса, где они учатся\n"
				+ "6) группу, где нет двоечников\n" + "7) институт и курс, на котором средний бал не меньше 3,5\n"
				+ "8) фамилии студентов, у которых нет троек и двоек\n"
				+ "9) институт и группу, где наибольшее количество отличников\n"
				+ "10) фамилии студентов-отличников на третьем курсе\n"
				+ "11) предметы и перечень кафедр, на которых они присутствуют\n"
				+ "12) фамилии студентов, группу и институт, где средний балл составляет 4,5\n"
				+ "13) студентов первого курса, у которых три двойки и удалите их\n"
				+ "14) группы, в которых нет двоечников\n"
				+ "15) фамилии студентов-отличников на первом и втором курсах по всем институтам, средний балл по каждой группе и упорядочьте группы по нему\n"
				+ "16) институты, на которых нет двоечников\n"
				+ "17) фамилии студентов, которые не явились хотя бы на один экзамен (оценка 0) и удалите тех, у которых средний балл ниже 3\n"
				+ "18) институт, на котором на первом курсе наибольшее количество групп, где нет двоек\n"
				+ "19) курс с наибольшим количеством отличников\n"
				+ "20) институт, на котором на первом курсе наибольшее количество двоечников\n"
				+ "21) группы, в которых нет отличников\n"
				+ "22) полный список двоечников с указанием института, группы и курса, где они учатся\n"
				+ "23) фамилии студентов-отличников на втором курсе с указанием группы и института, где они учатся");

		String result = "";
		int max = 0;
		switch (in.nextInt()) {
		case 1:
			// task 1

			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					// create 2 lists for late removing elements because we can't remove elements
					// from Map when iterate it
					List<Integer> groupsToRefactor = new ArrayList<Integer>();
					List<Student> studentsToRemove = new ArrayList<Student>();
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						List<Student> students = entry2.getValue();
						if (entry2.getKey() / 100 == entry.getKey()) {
							for (Student student : students) {
								if (student.numberOfMarksTwo() >= 2) {
									result += student.getSurname() + "\n";
									// add what we need to remove
									groupsToRefactor.add(entry2.getKey());
									studentsToRemove.add(student);
									System.out.println("Удалён студент " + student.toString());
									institute.getNumberOfDeductionsOnCourse().put(institute.getName() + entry.getKey(),
											institute.getNumberOfDeductionsOnCourse()
													.get(institute.getName() + entry.getKey()) + 1);
								}
							}
						}
					}
					// removing students from Map
					for (int i = 0; i < groupsToRefactor.size(); i++) {
						institute.getStudentsInGroup().get(groupsToRefactor.get(i)).remove(studentsToRemove.get(i));
					}
				}
			}

			printDatabase(listOfInstitutes);
			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 2:
			// task 2
			Map<Institute, Integer> resultMap = new HashMap<Institute, Integer>();
			for (Institute institute : listOfInstitutes) {
				int count = 0;
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					if (entry.getKey() == 1) {
						for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
							List<Student> students = entry2.getValue();
							for (Student student : students) {
								if (entry.getKey() == entry2.getKey() / 100) {
									if (student.numberOfMarksZero() == 0 && student.numberOfMarksTwo() == 0
											&& student.numberOfMarkThree() == 0 && student.numberOfMarkFour() == 0) {
										count++;
									}
								}
							}
						}
					}
				}
				resultMap.put(institute, count);
			}
			max = 0;
			for (Map.Entry<Institute, Integer> entry : resultMap.entrySet()) {
				result = entry.getKey().toString();
				max = entry.getValue();
			}
			for (Map.Entry<Institute, Integer> entry : resultMap.entrySet()) {
				if (max < entry.getValue()) {
					result = entry.getKey().toString();
					max = entry.getValue();
				}
			}

			System.out.println(resultMap.toString());

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 3:
			// when i was doing this task i understood that would be better if i did in
			// class Institute
			// only one hashmap with key number of course which including other hashmap with
			// key number of group
			// which including student
			// task 3
			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<String, Integer> entry : institute.getNumberOfDeductionsOnCourse().entrySet()) {
					System.out.println(entry.toString());
					if (max < entry.getValue()) {
						max = entry.getValue();
						result = entry.getKey();
					}
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 4:
			// task 4
			Map<Institute, Integer> resultMap2 = new HashMap<Institute, Integer>();
			for (Institute institute : listOfInstitutes) {
				int count = 0;
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						List<Student> students = entry2.getValue();
						for (Student student : students) {
							if (entry.getKey() == entry2.getKey() / 100) {
								if (student.numberOfMarksZero() == 0 && student.numberOfMarksTwo() == 0
										&& student.numberOfMarkThree() == 0 && student.numberOfMarkFour() == 0) {
									count++;
								}
							}
						}
					}
				}
				resultMap2.put(institute, count);
			}
			max = 0;
			for (Map.Entry<Institute, Integer> entry : resultMap2.entrySet()) {
				result = entry.getKey().toString();
				max = entry.getValue();
			}
			for (Map.Entry<Institute, Integer> entry : resultMap2.entrySet()) {
				if (max < entry.getValue()) {
					result = entry.getKey().toString();
					max = entry.getValue();
				}
			}

			System.out.println("Task 4: институт с наибольшим количеством отличников\n");

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 5:
			// task 5
			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						List<Student> students = entry2.getValue();
						if (entry2.getKey() / 100 == entry.getKey()) {
							for (Student student : students) {
								if (entry.getKey() == entry2.getKey() / 100) {
									if (student.numberOfMarksZero() == 0 && student.numberOfMarksTwo() == 0
											&& student.numberOfMarkThree() == 0 && student.numberOfMarkFour() == 0) {
										result += student.getSurname() + " " + institute.getName() + " "
												+ entry2.getKey() + " " + entry.getKey() + "\n";
									}
								}
							}
						}
					}
				}
			}
			System.out.println(
					"Task 5: полный список отличников с указанием института, группы и курса, где они учатся\n");

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 6:
			// task 6

			System.out.println("Task 6: группу, где нет двоечников\n");

			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						if (entry2.getKey() / 100 == entry.getKey()) {
							boolean flag = true;
							for (Student student : entry2.getValue()) {
								if (student.numberOfMarksTwo() != 0) {
									flag = false;
								}
							}
							if (flag) {
								result += entry2.getKey() + "\n";
							}
						}
					}
				}
			}
			System.out.println(result);

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 7:
			// task 7: type average mark

			System.out.println("Task 7: институт и курс, на котором средний бал не меньше 3,5\n");

			Map<String, Float> averageInCourses = new HashMap<String, Float>();
			float summ = 0;
			int countStudents = 0;
			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					countStudents = 0;
					summ = 0;
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						if (entry2.getKey() / 100 == entry.getKey()) {
							for (Student student : entry2.getValue()) {
								summ += student.getAverageMark();
								countStudents++;
							}
						}
					}
					averageInCourses.put(institute.getName() + entry.getKey(),
							summ /  countStudents);
					System.out.println(summ / countStudents);
				}
			}
			for (Map.Entry<String, Float> entry : averageInCourses.entrySet()) {
				if (entry.getValue() >= 3.5) {
					result += entry.getKey() + "\n";
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 8:
			// task 8

			System.out.println("Task 8: фамилии студентов, у которых нет троек и двоек\n");

			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						List<Student> students = entry2.getValue();
						if (entry2.getKey() / 100 == entry.getKey()) {
							for (Student student : students) {
								if (entry.getKey() == entry2.getKey() / 100) {
									if (student.numberOfMarksTwo() == 0 && student.numberOfMarkThree() == 0) {
										result += student.getSurname() + "\n";
									}
								}
							}
						}
					}
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 9:
			// task 9: type the most number of

			System.out.println("Task 9: институт и группу, где наибольшее количество отличников\n");

			Map<String, Integer> countExcellentStudentsInGroups = new HashMap<String, Integer>();
			int count = 0;
			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						for (Student student : entry2.getValue()) {
							if (student.numberOfMarksZero() == 0 && student.numberOfMarksTwo() == 0
									&& student.numberOfMarkThree() == 0 && student.numberOfMarkFour() == 0) {
								count++;
							}
						}
						countExcellentStudentsInGroups.put(institute.getName() + entry2.getKey(), count);
						count = 0;
					}
				}
			}
			max = 0;
			for (Map.Entry<String, Integer> entry : countExcellentStudentsInGroups.entrySet()) {
				if (max < entry.getValue()) {
					result = entry.getKey().toString();
					max = entry.getValue();
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 10:
			// task 10

			// TODO: third course

			System.out.println("Task 10: фамилии студентов-отличников на третьем курсе\n");

			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						List<Student> students = entry2.getValue();
						if (entry2.getKey() / 100 == entry.getKey()) {
							if (entry2.getKey() / 100 == 3) {
								for (Student student : students) {
									if (entry.getKey() == entry2.getKey() / 100) {
										if (student.numberOfMarksZero() == 0 && student.numberOfMarksTwo() == 0
												&& student.numberOfMarkThree() == 0
												&& student.numberOfMarkFour() == 0) {
											result += student.getSurname() + "\n";
										}
									}
								}
							}
						}
					}
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 11:
			// task 11: type lessons

			System.out.println("Task 11: предметы и перечень кафедр, на которых они присутствуют\n");

			for (Lesson lesson : listOfLessons) {
				result += lesson.getName() + " на кафедре " + lesson.getDepartment() + "\n";
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 12:
			// task 12: type average mark

			System.out.println("Task 12: фамилии студентов, группу и институт, где средний балл составляет 4,5\n");

			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						for (Student student : entry2.getValue()) {
							if (entry2.getKey() / 100 == entry.getKey()) {
								if (student.getAverageMark() == 4.5) {
									result += student.getSurname() + " " + institute.getName() + " " + entry2.getKey()
											+ " " + entry.getKey() + "\n";
								}
							}
						}
					}
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 13:
			// task 13

			System.out.println("Task 13: студентов первого курса, у которых три двойки и удалите их\n");

			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					// create 2 lists for late removing elements because we can't remove elements
					// from Map when iterate it
					List<Integer> groupsToRefactor = new ArrayList<Integer>();
					List<Student> studentsToRemove = new ArrayList<Student>();
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						List<Student> students = entry2.getValue();
						if (entry2.getKey() / 100 == 1) {
							for (Student student : students) {
								if (student.numberOfMarksTwo() >= 3) {
									result += student.getSurname() + "\n";
									// add what we need to remove
									groupsToRefactor.add(entry2.getKey());
									studentsToRemove.add(student);
									System.out.println("Удалён студент " + student.toString());
									institute.getNumberOfDeductionsOnCourse().put(institute.getName() + entry.getKey(),
											institute.getNumberOfDeductionsOnCourse()
													.get(institute.getName() + entry.getKey()) + 1);
								}
							}
						}
					}
					// removing students from Map
					for (int i = 0; i < groupsToRefactor.size(); i++) {
						institute.getStudentsInGroup().get(groupsToRefactor.get(i)).remove(studentsToRemove.get(i));
					}
				}
			}

			printDatabase(listOfInstitutes);
			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 14:
			// task 14

			System.out.println("Task 14: группы, в которых нет двоечников\n");

			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						if (entry2.getKey() / 100 == entry.getKey()) {
							boolean flag = true;
							for (Student student : entry2.getValue()) {
								if (student.numberOfMarksTwo() != 0) {
									flag = false;
								}
							}
							if (flag) {
								result += entry2.getKey() + "\n";
							}
						}
					}
				}
			}
			System.out.println(result);

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 15:
			// task 15: type average mark

			System.out.println(
					"Task 15: фамилии студентов-отличников на первом и втором курсах по всем институтам, средний балл по каждой группе и упорядочьте группы по нему\n");

			// get average mark from all groups
			Map<Integer, Float> resultMap4 = new HashMap<Integer, Float>();
			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						float summMarkOfGroup = 0;
						List<Student> students = entry2.getValue();
						if (entry2.getKey() / 100 == entry.getKey()) {
							for (Student student : students) {
								summMarkOfGroup += student.getAverageMark();
							}
						}
						resultMap4.put(entry2.getKey(), summMarkOfGroup / entry2.getValue().size());
					}
				}
			}
			
			// sorting groups by average mark
			List<Integer> sortedGroups = new ArrayList<Integer>();
			List<Float> averageMark = new ArrayList<Float>();
			
			for (Map.Entry<Integer, Float> entry: resultMap4.entrySet()) {
				sortedGroups.add(entry.getKey());
				averageMark.add(entry.getValue());
			}
			
			boolean isSorted = false;
			int tempGroup = 0;
			float tempMark = 0;
			while (!isSorted) {
				isSorted = true;
				for (int i = 0; i < sortedGroups.size() - 1; i++) {
					if (averageMark.get(i) > averageMark.get(i + 1)) {
						isSorted = false;
						
						tempGroup = sortedGroups.get(i);
						sortedGroups.set(i, sortedGroups.get(i + 1));
						sortedGroups.set(i + 1, tempGroup);
						
						tempMark = averageMark.get(i);
						averageMark.set(i, averageMark.get(i + 1));
						averageMark.set(i + 1, tempMark);
					}
				}
			}
			
			// get excellent students
			Map<Integer, ArrayList<Student>> resultMap5 = new HashMap<Integer, ArrayList<Student>>();
			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						List<Student> students = entry2.getValue();
						if (entry2.getKey() / 100 == entry.getKey()) {
							for (Student student : students) {
								if (entry2.getKey() / 100 == 1 || entry2.getKey() / 100 == 2) {
									if (student.numberOfMarksZero() == 0 && student.numberOfMarksTwo() == 0
											&& student.numberOfMarkThree() == 0 && student.numberOfMarkFour() == 0) {
										if (resultMap5.containsKey(entry2.getKey())) {
											resultMap5.get(entry2.getKey()).add(student);
										} else {
											resultMap5.put(entry2.getKey(), new ArrayList<Student>());
											resultMap5.get(entry2.getKey()).add(student);
										}
									}
								}
							}
						}
					}
				}
			}
			
			// outPrint excellent students ordered by average marks of their groups
			for (int groupNumber: sortedGroups) {
				for (Map.Entry<Integer, ArrayList<Student>> entry: resultMap5.entrySet()) {
					if (groupNumber == entry.getKey()) {
						for (Student student: entry.getValue()) {
							result += student.getSurname() + "\n";
						}
					}
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 16:
			// task 16: type if exist student with mark two

			System.out.println("Task 16: институты, на которых нет двоечников\n");

			for (Institute institute : listOfInstitutes) {
				boolean flag = true;
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						for (Student student : entry2.getValue()) {
							if (student.numberOfMarksTwo() > 0) {
								flag = false;
							}
						}
					}
				}
				if (flag) {
					result += institute.getName() + "\n";
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 17:
			// task 17

			System.out.println(
					"Task 17: фамилии студентов, которые не явились хотя бы на один экзамен (оценка 0) и удалите тех, у которых средний балл ниже 3\n");

			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						if (entry2.getKey() / 100 == entry.getKey()) {
							for (Student student : entry2.getValue()) {
								if (student.numberOfMarksZero() != 0) {
									result += "не пришел " + student.getSurname() + "\n";
								}
							}
						}
					}
				}
			}
			ArrayList<Student> studentsNeedToRemove = new ArrayList<Student>();
			ArrayList<Integer> groupsNeedToRefactor = new ArrayList<Integer>();
			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						for (Student student : entry2.getValue()) {
							if (entry2.getKey() / 100 == entry.getKey()) {
								if (student.getAverageMark() < 3) {
									groupsNeedToRefactor.add(entry2.getKey());
									studentsNeedToRemove.add(student);
								}
							}
						}
					}
					// removing students from Map
					for (int i = 0; i < groupsNeedToRefactor.size(); i++) {
						institute.getStudentsInGroup().get(groupsNeedToRefactor.get(i)).remove(studentsNeedToRemove.get(i));
						result += "удалён " + studentsNeedToRemove.get(i) + "\n";
					}
				}
			}
			System.out.println(result);

			printDatabase(listOfInstitutes);
			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 18:
			// task 18
			Map<Institute, Integer> numberOfGroupsWhichHasNotMarkTwo = new HashMap<Institute, Integer>();
			for (Institute institute : listOfInstitutes) {
				count = 0;
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					if (entry.getKey() == 1) {
						Integer[] groups = entry.getValue();
						for (Integer group : groups) {
							for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
								if (group == entry2.getKey()) {
									List<Student> students = entry2.getValue();
									boolean flag = true;
									for (Student student : students) {
										if (student.numberOfMarksTwo() > 0) {
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
				numberOfGroupsWhichHasNotMarkTwo.put(institute, count);
			}
			System.out.println(numberOfGroupsWhichHasNotMarkTwo.toString());
			max = 0;

			// set in result random institute for set in max random value for comparison
			for (Map.Entry<Institute, Integer> entry : numberOfGroupsWhichHasNotMarkTwo.entrySet()) {
				max = entry.getValue();
				result = entry.getKey().toString();
			}
			for (Map.Entry<Institute, Integer> entry : numberOfGroupsWhichHasNotMarkTwo.entrySet()) {
				if (max < entry.getValue()) {
					max = entry.getValue();
					result = entry.getKey().toString();
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 19:
			// task 19: type the most number of

			System.out.println("Task 19: курс с наибольшим количеством отличников\n");

			Map<String, Integer> countExcellentStudentsInCourse = new HashMap<String, Integer>();
			count = 0;
			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						for (Student student : entry2.getValue()) {
							if (entry2.getKey() / 100 == entry.getKey()) {
								if (student.numberOfMarksZero() == 0 && student.numberOfMarksTwo() == 0
										&& student.numberOfMarkThree() == 0 && student.numberOfMarkFour() == 0) {
									count++;
								}
							}
						}
					}
					countExcellentStudentsInCourse.put(institute.getName() + entry.getKey(), count);
					count = 0;
				}
			}
			max = 0;
			for (Map.Entry<String, Integer> entry : countExcellentStudentsInCourse.entrySet()) {
				if (max < entry.getValue()) {
					result = entry.getKey().toString();
					max = entry.getValue();
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 20:
			// task 20: type the most number of

			System.out.println("Task 20: институт, на котором на первом курсе наибольшее количество двоечников\n");

			Map<Institute, Integer> resultMap3 = new HashMap<Institute, Integer>();
			for (Institute institute : listOfInstitutes) {
				count = 0;
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					if (entry.getKey() == 1) {
						for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
							List<Student> students = entry2.getValue();
							for (Student student : students) {
								if (entry.getKey() == entry2.getKey() / 100) {
									if (student.numberOfMarksTwo() > 0) {
										count++;
									}
								}
							}
						}
					}
				}
				resultMap3.put(institute, count);
			}
			max = 0;
			for (Map.Entry<Institute, Integer> entry : resultMap3.entrySet()) {
				if (max < entry.getValue()) {
					result = entry.getKey().toString();
					max = entry.getValue();
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 21:
			// task 21

			System.out.println("Task 21: группы, в которых нет отличников\n");

			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						if (entry2.getKey() / 100 == entry.getKey()) {
							boolean flag = true;
							for (Student student : entry2.getValue()) {
								if (student.getAverageMark() == 5) {
									flag = false;
								}
							}
							if (flag) {
								result += entry2.getKey() + "\n";
							}
						}
					}
				}
			}
			System.out.println(result);

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 22:
			// task 22

			System.out.println(
					"Task 22: полный список двоечников с указанием института, группы и курса, где они учатся\n");

			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						List<Student> students = entry2.getValue();
						if (entry2.getKey() / 100 == entry.getKey()) {
							for (Student student : students) {
								if (entry.getKey() == entry2.getKey() / 100) {
									if (student.numberOfMarksTwo() != 0) {
										result += student.getSurname() + " " + institute.getName() + " "
												+ entry2.getKey() + " " + entry.getKey() + "\n";
									}
								}
							}
						}
					}
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;

		case 23:
			// task 23

			System.out.println(
					"Task 23: фамилии студентов-отличников на втором курсе с указанием группы и института, где они учатся\n");

			for (Institute institute : listOfInstitutes) {
				for (Map.Entry<Integer, Integer[]> entry : institute.getGroupsOnCourse().entrySet()) {
					for (Map.Entry<Integer, List<Student>> entry2 : institute.getStudentsInGroup().entrySet()) {
						List<Student> students = entry2.getValue();
						if (entry2.getKey() / 100 == entry.getKey()) {
							if (entry2.getKey() / 100 == 2) {
								for (Student student : students) {
									if (entry.getKey() == entry2.getKey() / 100) {
										if (student.numberOfMarksZero() == 0 && student.numberOfMarksTwo() == 0
												&& student.numberOfMarkThree() == 0
												&& student.numberOfMarkFour() == 0) {
											result += student.getSurname() + " " + institute.getName() + " "
													+ entry2.getKey() + " " + entry.getKey() + "\n";
										}
									}
								}
							}
						}
					}
				}
			}

			writeIntoFile(result);
			repeatQueries(listOfInstitutes, listOfLessons);
			break;
		}
	}

	public static void repeatQueries(List<Institute> listOfInstitutes, List<Lesson> listOfLessons) {
		Scanner in = new Scanner(System.in);
		System.out.println("Продолжить работу?\n1.Да\n2.Нет");
		if (in.nextInt() == 1) {
			console(listOfInstitutes, listOfLessons);
		}
	}
}
