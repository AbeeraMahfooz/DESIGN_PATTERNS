import java.util.Scanner;

public class Courses {
    private String course_name;
    public String[] subjects;
    private int batch;

   public Courses(){
    }
    public String getCourse_name(){
        return course_name;
    }

    public void showSubjects(){
        System.out.println("COURSE: APPLIED PHYSICS FOR 1ST YEAR");
        System.out.println("SUBJECTS ARE: \n1)APPLIED PHYSICS\t\t2)FLUIDS\n ");

        System.out.println("COURSE: APPLIED PHYSICS FOR 2ND YEAR");
        System.out.println("SUBJECTS ARE: \n1)ADVANCED PHYSICS\t\t2)ADVANCED FLUIDS\n ");

        System.out.println("COURSE: STATS FOR 1ST YEAR");
        System.out.println("SUBJECTS ARE: \n1)STATS\t\t2)ACCOUNTING\n ");

        System.out.println("COURSE: STATS FOR 2ND YEAR");
        System.out.println("SUBJECTS ARE: \n1)ADVANCED STATS\t\t2)NUMERICALS\n ");
    }
}
