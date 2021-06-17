package graph;

import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleProblem {

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0},{0,1}};

        CourseScheduleProblem schedule = new CourseScheduleProblem();
        boolean canFinish = schedule.canFinish(numCourses, prerequisites);
        System.out.println(canFinish);
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int[][] courseConnections = new int[numCourses][numCourses];
        int[] dependentCoursesCount = new int[numCourses];

        // Create a Course dependency graph
        for(int i = 0; i < prerequisites.length;i++) {

            int courseToDo = prerequisites[i][0]; // Course user is trying to do
            int dependentCourse = prerequisites[i][1]; // dependent course needed to complete first

            if(courseConnections[dependentCourse][courseToDo] == 0)
                dependentCoursesCount[courseToDo]++;
            courseConnections[dependentCourse][courseToDo] = 1;
        }

        // Add Courses to queue which have no dependencies
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < dependentCoursesCount.length;i++) {
            if(dependentCoursesCount[i] == 0)
                queue.offer(i);
        }

        int count = 0;
        while(!queue.isEmpty()) {
            int course = queue.poll();
            count++;

            for(int i = 0; i < numCourses; i++) {
                if(courseConnections[course][i] != 0)
                    if(--dependentCoursesCount[i] == 0)
                        queue.offer(i);
            }
        }
        return count == numCourses;
    }
}
