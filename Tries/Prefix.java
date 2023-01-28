package Tries;

public class Prefix {
    /* 
     * Prefix Problem
     * Find shortest unique prefix for every word in a given list.
     * Assume no words is prefix of another.
     * arr[]={"zebra","dog","duck","dove"}
     * ans={"z","dog","du","dov"}
     */
    static class Node {
        Node children[]=new Node[26];
        boolean eow=false;
        int feq;
        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            feq=1;
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx= word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }else{
                curr.children[idx].feq++;
            }
            curr = curr.children[idx];
        }
        curr.eow=true;
    }

    public static void findPrefix(Node root,String ans){
        if(root==null){
            return;
        }
        if(root.feq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.children.length;i++){
            if(root.children[i]!=null){
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[]={"zebra","dog","duck","dove"};
        for(String i:arr){
            insert(i);
        }
        root.feq=-1;
        findPrefix(root,"");
    }
    
}
