package greedyalgo.fractionalknapsack;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsack {

    public static void knapSack(List<FractionalKnapsackItem> item, int capacity) {

        Comparator<FractionalKnapsackItem> comparator = new Comparator<FractionalKnapsackItem>() {
            @Override
            public int compare(FractionalKnapsackItem o1, FractionalKnapsackItem o2) {
                if(o1.getRatio() < o2.getRatio())
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(item, comparator);

        int currValue = 0;
        for(int idx=0;idx < item.size(); idx++) {
            if(capacity != 0) {
                int weight = item.get(idx).getWeight();
                int value = item.get(idx).getValue();
                if(capacity > weight) {
                    currValue += value;
                    capacity -= weight;
                    System.out.println("Selected Weight = " + weight + " Value = " + value);
                } else {
                    currValue += capacity*weight/value;
                    capacity = 0;
                    System.out.println("Selected Weight = " + weight + " Value = " + capacity*weight/value);
                }
            } else {
                System.out.println("Capacity is full.");
                break;
            }
        }

        System.out.println("Total Value = " + currValue);

    }
}
