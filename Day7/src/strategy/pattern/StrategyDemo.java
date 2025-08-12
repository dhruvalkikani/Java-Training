package strategy.pattern;

import java.util.Arrays;

interface SortStrategy {
    void sort(int[] arr);
}

class BubbleSort implements SortStrategy {
    public void sort(int[] arr) {
        // simple bubble (inefficient) for demo
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1] > arr[j]) {
                    int t = arr[j-1]; arr[j-1] = arr[j]; arr[j] = t;
                }
            }
        }
    }
}

class QuickSort implements SortStrategy {
    public void sort(int[] arr) {
        Arrays.sort(arr); // delegate to JDK sort for demo
    }
}

class SortContext {
    private SortStrategy strategy;
    public SortContext(SortStrategy strategy) { this.strategy = strategy; }
    public void setStrategy(SortStrategy s) { this.strategy = s; }
    public void sort(int[] arr) { strategy.sort(arr); }
}

// demo:
public class StrategyDemo {
    public static void main(String[] args) {
        int[] data = {5,2,9,1};
        SortContext ctx = new SortContext(new BubbleSort());
        ctx.sort(data);
        System.out.println(Arrays.toString(data));
        ctx.setStrategy(new QuickSort());
        int[] d2 = {7,3,8,4};
        ctx.sort(d2);
        System.out.println(Arrays.toString(d2));
    }
}
