import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Courses courses= new Courses();
        System.out.println("\n\n");
        courses.showSubjects();
        System.out.println("\n\n");

        System.out.println("Enter student name: ");
        String name = obj.nextLine();

        System.out.println("Enter course name: ");
        String course_name = obj.nextLine();

        System.out.println("Enter batch year: ");
        int batch = obj.nextInt();
        Student st = new Student(name, batch, course_name);
        System.out.println("STUDENT NAME IS :" + st.getName());
        System.out.println("STUDENT BATCH IS :" + st.getBatch());
        System.out.println("STUDENT IS ENROLLED IN COURSE :" + st.getCourse_name());

        Timetable timetable = new Timetable();
        timetable.setTimetable(st.getCourse_name(), st.getBatch());

    }
}
