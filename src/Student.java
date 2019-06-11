public class Student {

    private String name ;
    private int batch;
    private String course_name;

    public Student(String name,int batch,String course_name){
        this.batch = batch;
        this.course_name = course_name;
        this.name= name;
    }

    public String getName(){
        return name;
    }
    public String getCourse_name(){
        return course_name;
    }
    public int getBatch(){
        return batch;
    }
}
