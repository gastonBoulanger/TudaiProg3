
public class DoubleNode {
	private String info;
	private DoubleNode next, prev;
	private Integer nro;

	public DoubleNode(DoubleNode n,DoubleNode p, String st, int num) { //ahora sabe el anterior y el siguiente
		prev = p;
		next = n;
		info = st;
		nro = num;
	}

	public DoubleNode(DoubleNode n,DoubleNode p, String st) {
		prev = p;
		next = n;
		info = st;
	}

	public DoubleNode(DoubleNode n,DoubleNode p, int i) {
		prev = p;
		next = n;
		nro = i;
	}
	public void setNext(DoubleNode n) {
		next = n;
	}
	public void setPrev(DoubleNode p) {
		prev = p;
	}
	public DoubleNode getPrev() {
		return prev;
	}
	public DoubleNode getNext() {
		return next;
	}
	public void setInfo(String st) {
		info = st;
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
