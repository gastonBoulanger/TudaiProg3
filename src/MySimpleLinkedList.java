import java.util.ArrayList;

public class MySimpleLinkedList {
	protected Node first;
	private Node last;
	private int size = 0;

	public MySimpleLinkedList() {
		first = null;

	}

	public boolean isEmpty() {
		return first == null;
	}
	
	public void insert(String s, Integer i) {

		Node nodo = new Node(null, s, i);
		if (first == null) {
			first = nodo;
			last = first;
		} else {
			last.setNext(nodo);
			last = nodo; //decía last.getNext();
		}
		size++;
	}

	public void insertOrdenado(String s, Integer i) {

		Node nodo = new Node(null, s, i);
		if (first == null) {
			first = nodo;
		} else {
			if (s.compareTo(first.getInfo()) < 0) {
				nodo.setNext(first);
				first = nodo;
			} else {
				Node nodoActual = first;
				while ((nodoActual.getNext() != null) && (s.compareTo(nodoActual.getNext().getInfo()) > 0)) {
					nodoActual = nodoActual.getNext();
				}
				nodo.setNext(nodoActual.getNext());
				nodoActual.setNext(nodo);
			}
		}
		size++;
	}
	
	// ELIMINA UN NODO POR POSICION, Y VINCULA EL ANTERIOR CON EL SIGUIENTE
	public void deleteElement(int pos) {
		// Node tmp;
		if (size - 1 > pos && first == null) {
			System.out.println("No borré nada"); // Si la lista esta vacía
		} else if (pos == 0) { // Si borro el primero de la lista, el segundo se
								// vuelve el primero
			first = first.getNext();
			size--;
		} else {
			if (size > pos || first == null) {
				Node nodo = at(pos - 1);
				if (nodo != null) {
					nodo.setNext(nodo.getNext().getNext());
					size--;
				}
			}
			else System.out.println("No hay nada en esa posición");
		}

	}

	public Node at(int pos) {
		Node nodo = null;
		if (size < pos - 1 || first == null) {
			System.out.println("No hay nada en esa posiciòn");
		} else {
			nodo = first;
			for (int i = 0; i < pos; i++) {
				nodo = nodo.getNext();
			}
		}
		return nodo;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public void insertElementAlPrincipio(String s){
		Node nodo = new Node(null, s);
		nodo.setNext(first);
		first = nodo;
		size++;
	}
	
	public int getMax(){
		int maximo = 0;
		int pos = 0;
		
		for(int i=0; i<size; i++){
			Node nodo = at(i);
			if(maximo<nodo.getNro()){
				maximo = nodo.getNro();
				pos = i;
			}
			
		}
		return pos;
	}
	public void sortByString(){
		Node nodoActual = first;
		Node nodoTemp;
		Node nodoSig;
		for(int i = 0; i < size; i++){
			while ((nodoActual.getNext() != null)){
				nodoSig = nodoActual.getNext();
				if(nodoActual.compareToSt(nodoSig) > 0){
					nodoTemp = nodoActual;
					nodoActual = nodoSig;
					nodoTemp.setNext(nodoSig.getNext());
					nodoActual.setNext(nodoTemp);
				}
			}
		}
	}
	public void sortByNro(){
		Node nodoActual = first;
		Node nodoTemp;
		Node nodoSig;
		
		for(int i = 0; i < size-1; i++){
			for(int j = 0; j < size-i-1; j++){
				nodoSig = nodoActual.getNext();
				if(nodoActual.compareToInt(nodoSig) > 0){
					nodoTemp = nodoSig;
					nodoActual.setNext(nodoSig.getNext());
					nodoSig.setNext(nodoTemp);
					nodoActual.setNext(nodoSig);
				}
			}
			nodoActual = nodoActual.getNext();
		}
		/*if(first.getNext()!=null){
		//	for(int i = 0; i < size; i++){
				nodoSig = nodoActual.getNext();
				while ((nodoSig.getNro() != null)){
					if(nodoActual.compareToInt(nodoSig) > 0){
						nodoTemp = nodoSig;
						nodoActual.setNext(nodoSig); = nodoSig;
						nodoTemp.setNext(nodoSig.getNext());
						nodoActual.setNext(nodoTemp);
					}
					nodoActual = nodoSig;
				}
				
			}
		}
	}
*/	
	

	}
		public void sortList(MySimpleLinkedList list){
		
	}
	
	public void mergeSort(MySimpleLinkedList list1, MySimpleLinkedList list2){
		
	}
	
	public void printListByInfo(){
		if(first != null){
			Node nodo = first;
			while(nodo.getNext() != null){
				nodo.printNodeByInfo();
				nodo = nodo.getNext();
			}
		}
	}
	public void printListByNro(){
		if(first != null){
			Node nodo = first;
			while(nodo.getNext() != null){
				nodo.printNodeByNro();
				nodo = nodo.getNext();
			}
		}
	}
	public void printListRecursivo(Node nodo){
		if(nodo != null){
			System.out.println(nodo.getInfo() +" " +nodo.getNro());
			if(nodo.getNext() != null){
				this.printListRecursivo(nodo.getNext());
			}
		}
	}

	public void addElementByPos(String s, int pos) {
		Node n = new Node(null,s);
		if (pos == 0){
			if (first == null) {
				first = n;
				last = first;
			} else {
				n.setNext(first);
				first = n; 
			}
			
		}else {
			Node nodo = this.at(pos-1);
			if (nodo != null) {
				n.setNext(nodo.getNext());
				nodo.setNext(n);
			}
		}
		
		
		size++;	
	}
}
