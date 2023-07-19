package Prototype;

public class Client {

    private static void fillRegistry(Registry registry) {
        Student aprBatchPrototype = new Student(80, "AprilBatch");
//        aprBatchPrototype.averageBatchPsp = 80;
//        aprBatchPrototype.batchName = "AprilBatch";

        Student septBatchPrototype = new InteligentStudent(80, "SeptBatch");
        //septBatchPrototype.averageBatchPsp = 80;
        //septBatchPrototype.batchName = "SeptBatch";

        registry.register("AprilBatch", aprBatchPrototype);
        registry.register("SeptBatch", septBatchPrototype);

    }
    public static void main(String[] args) {

        Registry registry = new Registry();
        fillRegistry(registry);

        Student Manoj = registry.get("SeptBatch").clone();
        Manoj.setName("Manoj");
        Manoj.setPsp(99);

        Student Deepak = registry.get("AprilBatch").clone();
        Deepak.setName("Deepak");
        Deepak.setPsp(99);

        System.out.println("Debug");
    }
}
