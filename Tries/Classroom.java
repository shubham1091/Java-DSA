package Tries;

public class Classroom {
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};
        Pre tree = new Pre();
        for(int i=0;i<words.length;i++){
            tree.insert(words[i]);
        }
        System.out.println(tree.search("thee"));
        System.out.println(tree.search("thor"));
    }
}
