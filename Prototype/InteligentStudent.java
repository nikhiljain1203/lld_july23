package Prototype;

public class InteligentStudent extends Student{
    int IQ;

    InteligentStudent(InteligentStudent student) {
        super(student);
        this.IQ = student.IQ;
    }

    InteligentStudent(double averageBatchPsp, String batchName) {
       super(averageBatchPsp, batchName);
    }



    public InteligentStudent clone() {

//        InteligentStudent inteligentStudent =
//                new InteligentStudent();
//        inteligentStudent.batchName = this.batchName;
//        inteligentStudent.averageBatchPsp = this.averageBatchPsp;
//        return inteligentStudent;
        return new InteligentStudent(this);
    }
}
