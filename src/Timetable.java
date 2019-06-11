import java.util.Scanner;

public class Timetable {

    private String course_name;;
    private int batch;

    /*public Timetable(String course_name, int batch){
        this.course_name = course_name;
        this.batch = batch;
    }*/
    public Timetable(){}

    public void setTimetable(String course_name, int batch){

        if(course_name.equals("APPLIED PHYSICS") && batch ==2015){
            System.out.println("Time\t\t\tSubject\t\t\tRoom NO:");
            System.out.println("\n");
            System.out.println("9 AM\t\t\tApplied Physics\t\t\t1");
            System.out.println("\n");
            System.out.println("9:45 AM\t\t\tFluids\t\t\t\t2");
            System.out.println("\n");
        }
        else  if(course_name.equals("APPLIED PHYSICS")  && batch ==2016){
            System.out.println("Time\t\t\tSubject\t\t\tRoom NO:");
            System.out.println("\n");
            System.out.println("9 AM\t\t\tAdvanced Physics\t\t\t1");
            System.out.println("\n");
            System.out.println("9:45 AM\t\t\tAdvanced Fluids\t\t\t\t2");
            System.out.println("\n");
        }
        else  if(course_name.equals("STATS")  && batch ==2015){
            System.out.println("Time\t\t\tSubject\t\t\tRoom NO:");
            System.out.println("\n");
            System.out.println("9 AM\t\t\tStats\t\t\t1");
            System.out.println("\n");
            System.out.println("9:45 AM\t\t\tAccounting\t\t\t\t2");
            System.out.println("\n");
        }
        else  if(course_name.equals("STATS") && batch ==2016){
            System.out.println("Time\t\t\tSubject\t\t\tRoom NO:");
            System.out.println("\n");
            System.out.println("9 AM\t\t\tAdvanced Stats\t\t\t1");
            System.out.println("\n");
            System.out.println("9:45 AM\t\t\tNumericals\t\t\t\t2");
            System.out.println("\n");
        }
        else System.out.println("\nNo such subject and batch found\n");
    }

}
