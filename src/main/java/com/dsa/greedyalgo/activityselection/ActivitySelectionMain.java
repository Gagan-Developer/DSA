package greedyalgo.activityselection;

import java.util.ArrayList;
import java.util.List;

public class ActivitySelectionMain {

    public static void main(String[] args) {

        List<Activity> activityList = new ArrayList<>();

        activityList.add(new Activity("A1", 0, 6));
        activityList.add(new Activity("A2", 3, 4));
        activityList.add(new Activity("A3", 1, 2));
        activityList.add(new Activity("A4", 5, 8));
        activityList.add(new Activity("A5", 5, 7));
        activityList.add(new Activity("A6", 8, 9));

        System.out.println("User provided Schedule:");
        for (int i = 0; i < activityList.size() ; i++) {
            Activity activity = activityList.get(i);
            System.out.println(activity.toString());
        }

        //Perform calculation on activities
        ActivitySelection.activitySelection(activityList);
    }
}
