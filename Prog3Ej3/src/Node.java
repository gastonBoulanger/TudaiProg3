public class Node {

	private String info;
	private Node next;
	private Integer nro;
	
	public Node(Node n, String st) {
		next = n;
		info = st;
	}
	public Node(Node n, String st, int num) {
		next = n;
		info = st;
		nro = num;
	}

	

	public Node(Node n, int i) {
		next = n;
		nro = i;
	}

	public void setInfo(String st) {
		info = st;
	}

	public void setNext(Node i) {
		next = i;
	}

	public void setNro(Integer i) {
		nro = i;
	}

	public String getInfo() {
		return info;
	}

	public Integer getNro() {
		return nro;
	}

	public Node getNext() {
		return next;
	}

	public int compareToSt(Node nodo) {
		return info.compareTo(nodo.getInfo());
	}

	public int compareToInt(Node nodo) {
		if (nro > nodo.getNro())
			return 1;
		else if (nro < nodo.getNro())
			return -1;
		else
			return 0;
	}
	public void printNodeByInfo(){
		System.out.println(info);
	}
	public void printNodeByNro(){
		System.out.println(nro);
	}
}