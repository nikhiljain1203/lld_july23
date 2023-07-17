package prodBuilderPattern;

public class Client {
    public static void main(String[] args) {
        Student.StudentBuilder b = Student.getBuilder();
        b.name = "nikhil";
        b.age = 31;
        //Student st = b.build();

        Student.StudentBuilder b1 = Student.getBuilder();
        b1.name = "shubham";
        b1.age = 27;
        //Student st1 = b1.build();

        System.out.println("Debug");
    }
}
