package mergeSort;

import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        int mid = arrayToSort.size()/2;
        List<Integer> leftArray = new LinkedList<>();
        List<Integer> rightArray = new LinkedList<>();

        for(int i = 0; i < mid; i++) {
            leftArray.add(arrayToSort.get(i));
        }

        for(int i = mid; i < arrayToSort.size(); i++) {
            rightArray.add(arrayToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);

        //ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> leftSortedArrayF = executorService.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayF =executorService.submit(rightMergeSorter);

        List<Integer> leftSortedArray = leftSortedArrayF.get();
        List<Integer> rightSortedArray = rightSortedArrayF.get();

        int i = 0, j = 0;
        List<Integer> sortedList = new LinkedList<>();
        while(i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if(leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedList.add(leftSortedArray.get(i));
                i++;
            } else {
                sortedList.add(rightSortedArray.get(j));
                j++;
            }
        }

        while(i<leftSortedArray.size()) {
            sortedList.add(leftSortedArray.get(i));
            i++;
        }

        while(j<leftSortedArray.size()) {
            sortedList.add(rightSortedArray.get(j));
            j++;
        }
        return sortedList;
    }
}