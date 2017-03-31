public class Pila {
	private final int POSINI = 0;
	MySimpleLinkedList lista = new MySimpleLinkedList();

	public Pila() {

	}

	public void apilar(int i) {
		this.lista.addElementByPos(i, POSINI);
	}

	public void desapilar() {
		this.lista.deleteElement(0);
	}

	public Node tope() {
		return this.lista.at(0);
	}

	public boolean isEmpty() {
		return this.lista.isEmpty();
	}
}