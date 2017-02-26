package alexey_efimenko.Module3.Task3;

/**
 * Created by Linkin on 16.02.2017.
 */
public class Solution {

    Course course1 = new Course("Philosophy", 100, "Unknown1");
    Course course2 = new Course("Tennis", 300, "Inkognito1");
    Course course3 = new Course(12 /12/2020, "Snoop");
    Course course4 = new Course("Snipering", 400, "NameNotFound");
    Course course5 = new Course("Programming", 1000, "Alex");

    Course[] coursesTaken1 = {course1, course5};
    Course[] coursesTaken2 = {course3, course4, course2};

    Student student1 = new Student("Billy", "Idol", 1);
    Student student2 = new Student("Osborn", coursesTaken1);

    CollegeStudent collegeStudent1 = new CollegeStudent("Bon", "Jovi", 6);
    CollegeStudent collegeStudent2 = new CollegeStudent("Angel", coursesTaken2);
    CollegeStudent collegeStudent3 = new CollegeStudent("Vasya", coursesTaken1);

    SpecialStudent specialStudent1 = new SpecialStudent("Bimba", "Unknown", 23);
    SpecialStudent specialStudent2 = new SpecialStudent("Ololosh", coursesTaken2, 2);
    SpecialStudent specialStudent3 = new SpecialStudent("Ira", "Malina", 155, "Garvard", 1, 333, 666);
}