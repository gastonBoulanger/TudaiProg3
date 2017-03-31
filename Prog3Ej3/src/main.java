import java.awt.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		Pila pila = new Pila();
		int size = 20;

		//Se pregunta si la pila al iniciarla esta vacia
		System.out.println("Se creo la pila. La pila esta vacia? " + pila.isEmpty());

		//Se llena la pila
		for(int i = 0; i < size; i++){
			pila.apilar(i);
		}
		//Se pregunta si la pila despues de llenarse esta vacia
		System.out.println("Se lleno la pila. La pila esta vacia? " + pila.isEmpty());

		//Se desapila y se imprime el tope
		while(!pila.isEmpty()){
			//Se imprime el nodo
			Node nodo =	pila.tope();
			if(nodo != null){
				nodo.printNodeByNro();
			}
			//Se desapila
			pila.desapilar();
		}

		//Se pregunta si la pila despues de desapilar esta vacia
		System.out.println("Se desapilo la pila. La pila esta vacia? " + pila.isEmpty());
	}

}
