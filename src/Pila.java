import jdk.nashorn.internal.runtime.ListAdapter;

public class Pila {
	MySimpleLinkedList lista = new MySimpleLinkedList();
	public Pila() {
		
	}
	
public void apilar(String s){
	this.lista.addElementByPos(s, 0);
}
public void desapilar(){
	this.lista.deleteElement(0);
}
public String tope(){
	return this.lista.at(0).getInfo();
}
public boolean isEmpty(){
	return this.lista.isEmpty();
}
}
