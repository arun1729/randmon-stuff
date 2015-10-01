

public class Node implements Comparable {
	Node left;
	Node right;
	boolean marked=false;
	int nodeValue;
	
	public Node(Node left, Node right, int nodeVal){
		this.left=left;
		this.right=right;
		this.nodeValue=nodeVal;
	}
	
	public Node(int nodeVal){
		this.left=null;
		this.right=null;
		this.nodeValue=nodeVal;
	}

	public int compare(Object o1, Object o2){
		if(o1==null)
			throw new NullPointerException("Cannot compare null");
		if(o2==null)
			throw new NullPointerException("Cannot compare null");
		Node n1 = (Node) o1;
		Node n2 = (Node) o2;
		return Integer.compare(n1.nodeValue, n2.nodeValue);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nodeValue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (nodeValue != other.nodeValue)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		if(o==null)
			throw new NullPointerException("Cannot compare null");
		Node other = (Node) o;
		return Integer.compare(this.nodeValue, other.nodeValue);
	}

	@Override
	public String toString() {
		return "Node [nodeValue=" + nodeValue + "]";
	}
	
	
	
}
