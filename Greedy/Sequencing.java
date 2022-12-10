package Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class Sequencing {
    /*
     * job sequenceing problem
     * Given an array of jobs where every job has a deadline and profit
     * if the job is finished before the deadline. it is also given that
     * every job takes a single unit of time, so the minimum possible
     * deadline for any job is 1. Maximize the total profit if only one
     * job can be scheduled at a time.
     * job A = 4, 20
     * job B = 1, 10
     * job C = 1, 40
     * job D = 1, 30
     * 
     * ans = C , A
     */
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<Job> jobs = new ArrayList<Job>();
        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
        // descending order of profit
        ArrayList<Integer> seq = new ArrayList<Integer>();
        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("max jobs = " + seq.size());
        System.out.println(seq);
    }

}
