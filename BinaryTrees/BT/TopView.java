package BinaryTrees.BT;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
	public static void main(String[] args) {
		int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
		Btree tree = new Btree();
		Node root = tree.buildTree(node);
		topView(root);

	}

	public static void topView(Node root) {
		// level order
		Queue<Info> q = new LinkedList<>();
		HashMap<Integer, Node> map = new HashMap<>();
		int min = 0, max = 0;
		q.add(new Info(root, 0));
		q.add(null);
		while (!q.isEmpty()) {
			Info crr = q.remove();
			if (crr == null) {
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			}
			else{
				if (!map.containsKey(crr.hd)) {// girst time my hd is occuring
					map.put(crr.hd, crr.node);
				}
				if (crr.node.left != null) {
					q.add(new Info(crr.node.left, crr.hd - 1));
					min = Math.min(min, crr.hd - 1);
				}
				if (crr.node.right != null) {
					q.add(new Info(crr.node.right, crr.hd + 1));
					max = Math.max(max, crr.hd + 1);
				}
			}
		}
		for (int i = min; i <= max; i++) {
			System.out.print(map.get(i).data + " ");
		}
		System.out.println();
	}

	static class Info {
		Node node;
		int hd;

		public Info(Node node, int hd) {
			this.node = node;
			this.hd = hd;
		}
	}

}