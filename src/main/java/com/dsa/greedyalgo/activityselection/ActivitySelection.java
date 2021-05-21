package greedyalgo.activityselection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    public static void activitySelection(List<Activity> activityList) {


        Comparator<Activity> activityComparator = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.getEnd() - o2.getEnd();
            }
        };

        Collections.sort(activityList, activityComparator);
        int activityCount=1;

        System.out.println("Starting Activity Selection");

        Activity previousActivity = activityList.get(0);
        System.out.println(previousActivity);
        for(int idx = 1; idx < activityList.size(); idx++) {
            if(previousActivity.getEnd() < activityList.get(idx).getStart()) {
                activityCount++;
                previousActivity = activityList.get(idx);
                System.out.println(previousActivity);
            }
        }

    }
}
