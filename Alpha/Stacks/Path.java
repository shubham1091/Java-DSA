package Alpha.Stacks;

import java.util.Stack;

public class Path {
    /*
     * Simplify path
     * we have an absolute path for a flie (Unix-style), simplify it
     * Note that ablolute path always begin with '/' (root directory)
     * a dot in path represent current directory and double dot represents
     * parent directory
     * input: /apnacollege/
     * output: /apnacollege
     * 
     * input: /a/..
     * output: /
     */
    public static void main(String[] args) {
        String str = new String("/a/./b/../../c/");
        String res = simplify(str);
        System.out.println(res);
    }

    private static String simplify(String str) {
        Stack<String> st = new Stack<String>();
        StringBuilder res = new StringBuilder();
        res.append("/");
        int len_A = str.length();
        for (int i = 0; i < len_A; i++) {
            String dir = "";
            while (i < len_A && str.charAt(i) == '/') {
                i++;
            }
            while (i < len_A && str.charAt(i) != '/') {
                dir += str.charAt(i);
                i++;
            }
            if (dir.equals("..")) {
                if (!st.empty()) {
                    st.pop();
                }
            } else if (dir.equals('.')) {
                continue;
            } else if (dir.length() != 0) {
                st.push(dir);
            }
        }
        Stack<String> s = new Stack<String>();
        while (!st.empty()) {
            s.push(st.pop());
        }
        while (!s.isEmpty()) {
            if (s.size() != 1) {
                res.append(s.pop() + "/");
            } else {
                res.append(s.pop());
            }
        }
        return res.toString();
    }

}