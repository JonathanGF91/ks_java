
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Greedy {
    
    public static List<Integer> result(Bag bag){
        List<Integer> result = new ArrayList<>();
        bag.setWeightList(quickSort(bag.getWeightList(), 0, bag.getnElements())); // order by value
        int i = 0;
            while (bag.getCurrentWeight() < bag.getMaxWeight() || i < 1){
                if(bag.getCurrentWeight() + bag.getWeightOfIndex(i) <= bag.getMaxWeight()){
                    
                }
                i++;
            }
            
        return result;
    }
    
    public static int[] quickSort (int arr[], int begin, int end){
        if (begin < end){
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
        
        return arr;
    }

    private static int partition(int arr[], int begin, int end) {
        Random rnd = new Random();
        int pivot = rnd.nextInt() * arr.length + 0;
        int i = begin - 1;
        
        for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;

            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }

        int swap = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swap;

        return i+1;
    }
}
