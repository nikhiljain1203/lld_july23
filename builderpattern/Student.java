package builderpattern;

public class Student {
    String name;
    int age;
    String gender;
    String universityName;
    String gradYear;
    double cgpa;
    String address;

    Student(Builder b) {
        if(b.age > 100) {
            throw new IllegalArgumentException("Age above 100 not allowed");
        }
        this.name = b.getName();
        this.age = b.getAge();
    }
}
