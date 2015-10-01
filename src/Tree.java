import java.util.LinkedList;
import java.util.Random;

public class Tree {
	
	Node root;

	public Tree(Node root){
		
		this.root=root;
		
	}
	
	void insert(Node node, Node current) {
		
		if (node.compare(current, node) < 0) {
			if (current.left == null) {
				current.left = node;
			} else {
				insert(node, current.left);
			}
		} else if (node.compare(current, node) > 0) {
			if (current.right == null) {
				current.right = node;
			} else {
				insert(node, current.right);
			}
		} else if (node.compare(current, node) == 0) {
			System.out
					.println("Warn: skipping insertion, node with same value exists");
		}
		
	}
	
	public Node getRoot(){
		return this.root;
	}
	
	public void bfs(Node node){
		LinkedList<Node> q = new LinkedList<Node>();
		System.out.println("At: "+node.toString());
		node.marked=true;
		q.add(node);
		while(!q.isEmpty()){
			Node temp = q.poll();
			if(!temp.marked){
				System.out.println("At: "+temp.toString());
				temp.marked=true;
				q.add(temp);
			}else{
				Node r = temp.right;
				if(r !=null){
					System.out.println("At: "+r.toString());
					r.marked=true;
					q.add(r);
				}
				Node l = temp.left;
				if(l !=null){
					System.out.println("At: "+l.toString());
					l.marked=true;
					q.add(l);
				}
			}
		}		
	}
	
	public static void main(String[] args) {

		Tree tree = new Tree(new Node(1));
		
		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
			Node n = new Node(rand.nextInt() % 1000);
			tree.insert(n, tree.getRoot());
		}
		
		tree.bfs(tree.getRoot());
	}
}
