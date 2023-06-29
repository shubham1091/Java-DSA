package Alpha.Recursion;

public class Tower {
    /*
     * TOWER OF HANOI (Important!)
     * You have 3 towers and N disks of different sizes which can slide onto any
     * tower. The
     * Puzzle starts with disks sorted in ascending order of size from top to bottom
     * (i.e., each disk on top of an even larger one).
     * You have the following constraints:
     * (1) Only one disk can be moved at a time.
     * (2) A disk is slid off the top of one tower onto another tower.
     * (3) A disk cannot be placed on top of a smaller disk. Write a program to move
     * the disk
     * from the first tower to the last using Stacks.
     */
    public static void main(String[] args) {
        int n = 4;
        Hanoi(n, "A", "B", "C");
    }

    static void Hanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as "helper"
        Hanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        // transfer n-1 from helper to dest sing src as 'helper'
        Hanoi(n - 1, helper, src, dest);

    }

}
