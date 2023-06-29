package Alpha.Queues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Sequence {
    /*
     * Job swquencing problem
     * we have an array of jobs where every job has a deadline and associated
     * profile if the job is finished before the deadline. it is also given that
     * every job takes a single unite of time, so the minimmum possible deadline
     * for any job can be secheduled at a time.
     * input :
     * Job Id Deadline profile
     * a 4 20
     * b 1 10
     * c 1 40
     * d 1 30
     * 
     * output : c ,a
     */
    static class Job {
        char job_id;
        int deadline;
        int profile;

        Job(char job_id, int deadline, int profile) {
            this.job_id = job_id;
            this.deadline = deadline;
            this.profile = profile;
        }
    }

    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<Job>();
        arr.add(new Job('a', 4, 20));
        arr.add(new Job('b', 1, 10));
        arr.add(new Job('c', 1, 40));
        arr.add(new Job('d', 1, 30));
        System.out.println("Following is maximum profit sequence of jobs ");
        printJob(arr);
    }

    private static void printJob(ArrayList<Job> arr) {
        int n = arr.size();
        Collections.sort(arr, (a, b) -> {
            return a.deadline - b.deadline;
        });
        ArrayList<Job> result = new ArrayList<Job>();
        PriorityQueue<Job> maxHeap = new PriorityQueue<Job>((a, b) -> {
            return b.profile - a.profile;
        });
        for (int i = n - 1; i > -1; i--) {
            int slot_available;
            if (i == 0) {
                slot_available = arr.get(i).deadline;
            } else {
                slot_available = arr.get(i).deadline - arr.get(i - 1).deadline;
            }
            maxHeap.add(arr.get(i));
            while (slot_available > 0 && maxHeap.size() > 0) {
                Job job = maxHeap.remove();
                slot_available--;
                result.add(job);
            }
        }
        Collections.sort(result, (a, b) -> {
            return a.deadline - b.deadline;
        });
        for (Job i : result) {
            System.out.println(i.job_id + " ");
        }
        System.out.println();
    }

}
