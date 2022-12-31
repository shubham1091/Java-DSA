package Alpha.Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Effort {
    /*
     * Path with minimum effort
     * We have a tow-dimensional grid, each cell of which contains an integer cost
     * which represents a cost to traverse through that cell, we need to find a path
     * from the top left cell to the bottom right cell by which the total cost
     * incurred is minimum
     * 
     * input
     * {{31,100,65,12,18},
     * {10,13,47,157,6},
     * {100,113,174,11,33},
     * {88,124,41,20,140},
     * {99,32,111,41,20}}
     * 
     * output
     * 327 (=31+10+13+47+65+12+18+6+33+11+20+41+20)
     */
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static int ROW = 5;
    static int COL = 5;

    static class Cell {
        int x;
        int y;
        int dis;

        Cell(int x, int y, int dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }

    static class disComp implements Comparator<Cell> {
        public int compare(Cell a, Cell b) {

            if (a.dis < b.dis) {
                return -1;
            } else if (a.dis > b.dis) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    static boolean isInsideGrid(int i, int j) {
        return (i >= 0 && i < ROW &&
                j >= 0 && j < COL);
    }

    static int shortestPath(int[][] grid, int row,
            int col) {
        int[][] dist = new int[row][col];

        // Initializing distance array by INT_MAX
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        // Initialized source distance as
        // initial grid position value
        dist[0][0] = grid[0][0];

        PriorityQueue<Cell> pq = new PriorityQueue<Cell>(
                row * col, new disComp());

        // Insert source cell to priority queue
        pq.add(new Cell(0, 0, dist[0][0]));
        while (!pq.isEmpty()) {
            Cell curr = pq.poll();
            for (int i = 0; i < 4; i++) {
                int rows = curr.x + dx[i];
                int cols = curr.y + dy[i];

                if (isInsideGrid(rows, cols)) {
                    if (dist[rows][cols] > dist[curr.x][curr.y] +
                            grid[rows][cols]) {

                        // If Cell is already been reached once,
                        // remove it from priority queue
                        if (dist[rows][cols] != Integer.MAX_VALUE) {
                            Cell adj = new Cell(rows, cols,
                                    dist[rows][cols]);

                            pq.remove(adj);
                        }

                        // Insert cell with updated distance
                        dist[rows][cols] = dist[curr.x][curr.y] +
                                grid[rows][cols];

                        pq.add(new Cell(rows, cols,
                                dist[rows][cols]));
                    }
                }
            }
        }
        return dist[row - 1][col - 1];
    }

    // not for this question
    static String decode(String str) {
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();
        String temp = "", result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--;
                integerstack.push(count);
            } else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;
                if (!integerstack.isEmpty()) {
                    count = integerstack.peek();
                    integerstack.pop();
                }
                while (!stringstack.isEmpty() && stringstack.peek() != '[') {
                    temp = stringstack.peek() + temp;
                    stringstack.pop();
                }
                if (!stringstack.empty() && stringstack.peek() == '[') {
                    stringstack.pop();
                }
                for (int j = 0; j < count; j++) {
                    result = result + temp;
                }
                for (int j = 0; j < result.length(); j++) {
                    stringstack.push(result.charAt(j));
                }
                result = "";
            } else if (str.charAt(i) == '[') {
                if (Character.isDigit(str.charAt(i - 1))) {
                    stringstack.push(str.charAt(i));
                } else {
                    stringstack.push(str.charAt(i));
                    integerstack.push(1);
                }
            } else {
                stringstack.push(str.charAt(i));
            }
        }
        while (!stringstack.isEmpty()) {
            result = stringstack.peek() + result;
            stringstack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "3[b2[ca]]";
        System.out.println(decode(str));

        int[][] grid = { { 31, 100, 65, 12, 18 },
                { 10, 13, 47, 157, 6 },
                { 100, 113, 174, 11, 33 },
                { 88, 124, 41, 20, 140 },
                { 99, 32, 111, 41, 20 } };

        System.out.println(shortestPath(grid, ROW, COL));

    }
}
