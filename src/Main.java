public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Harry", "Potter", 21, true);
        student1.addGrade(78);
        student1.addGrade(89);
        student1.addGrade(99);
        student1.addGrade(51);

        Student student2 = new Student("Ron", "Qeasley", 20, true);
        student2.addGrade(78);
        student2.addGrade(89);
        student2.addGrade(75);
        student2.addGrade(63);
        student2.addGrade(82);

        Student student3 = new Student("Hermione", "Granger", 19, false);
        student2.addGrade(100);
        student2.addGrade(99);
        student2.addGrade(95);
        student2.addGrade(98);
        student2.addGrade(100);
        student2.addGrade(96);
        student2.addGrade(97);

        Student student4 = new Student("Luna", "Lovegood", 20, false);
        student2.addGrade(46);
        student2.addGrade(87);
        student2.addGrade(67);
        student2.addGrade(79);
        student2.addGrade(96);
        student2.addGrade(58);
        student2.addGrade(83);

        Student student5 = new Student("Draco", "Malfoy", 19, true);
        student2.addGrade(21);
        student2.addGrade(45);
        student2.addGrade(0);
        student2.addGrade(9);
        student2.addGrade(51);
        student2.addGrade(43);

        Teacher teacher1 = new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000);
        Teacher teacher2 = new Teacher("Albus", "Dumbledore", 71, true, "Philosophy", 25, 1500000);
        Teacher teacher3 = new Teacher("Minerva", "McGonagall", 62, false, "Sociology", 17, 1100000);
        Teacher teacher4 = new Teacher("Bellatrix", "Lestrange", 35, false, "Programming", 3, 570000);
        Teacher teacher5 = new Teacher("Sirius", "Black", 49, true, "Physics", 9, 750000);


        School school = new School();
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(student3);
        school.addMember(student4);
        school.addMember(student5);
        school.addMember(teacher1);
        school.addMember(teacher2);
        school.addMember(teacher3);
        school.addMember(teacher4);
        school.addMember(teacher5);



        System.out.println("Before sorting:");
        System.out.println(school);

        school.sortMembersBySurname();

        System.out.println("After sorting by surname:");
        System.out.println(school);

        System.out.println("Testing specific methods:");
        System.out.println(student1.toString());
        System.out.println("GPA: " + student1.calculateGPA());

        teacher1.giveRaise(10);
        System.out.println(teacher1.toString());
        System.out.println("New salary: " + teacher1.salary);
    }
}
