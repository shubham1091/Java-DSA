package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class Chocola {
    /*
     * Chocola problem
     * we are given a bar of chocolate composed of mXn square pieces.
     * One should break the chocolate into single squares. Each break
     * of the chocolate is charged a cost expressed by a positive integer
     * this xoat does not depend on the size of the part that is being
     * broken but only depends on the line the break goes along Let us
     * denote the costs of breaking along consecutive vertical lines
     * with xq, x2,... xm-1 and along horizontal lines with y1,y2,...yn-1
     * compute the minimal cost of breaking the whole chocolate into single
     */
    public static void main(String[] args) {
        // int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };//m-1
        Integer costHor[] = { 4, 1, 2 };//n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) {// horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {// vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts = " + cost);
    }

}
