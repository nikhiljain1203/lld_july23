package mergeSort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> arr = List.of(4,2,3,7,6,1,5,8);
        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(arr, executorService);

        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);
        List<Integer> sortedList = sortedListFuture.get();

        System.out.println(sortedList);

    }
}


//       Main pool1
// T1             T2
// Pool2         Pool3
// T1 T2         T1 T2