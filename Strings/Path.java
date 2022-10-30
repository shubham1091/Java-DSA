package Strings;

import java.util.Scanner;

public class Path {
    /*
     * Given a route containing 4 directions (E, W, N,S),
     * find the shortest path to reach destination.
     * "WNEENESENNN"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path : ");
        String dir = sc.next();
        System.out.println(route(dir));
        sc.close();
    }

    static int route(String sh) {
        String s = sh.toUpperCase();
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'W' -> x--;
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
            }

        }
        int dis = (int) Math.sqrt((x * x) + (y * y));
        return dis;
    }

}
