import java.awt.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		//MySimpleLinkedList listaSimple = new MySimpleLinkedList();
		Pila pila = new Pila();
		String s = "hola";
		String a = "hola2";
		String b = "hola3";
		String c = "hola4";
		
		pila.apilar(s);
		pila.apilar(a);
		pila.apilar(b);
		pila.apilar(c);
		ArrayList<String> array = new ArrayList();
		System.out.println(pila.tope());
		pila.desapilar();
		System.out.println(pila.tope());
		pila.desapilar();
		System.out.println(pila.tope());
		pila.desapilar();
		System.out.println(pila.tope());
		pila.desapilar();
		/*for (int i = 0; i < 20; i++) {
			
			Node nodo = new Node("ejercicio3algo" + i, (int)(Math.random()*20)+1);
			pila.apilar(nodo);
			array.add("puntito" + i);
		}
		listaSimple.printListRecursivo(listaSimple.at(0));
		System.out.println(listaSimple.at(5).getInfo());
		listaSimple.printListRecursivo(listaSimple.at(5));
		
		
		 * listaSimple.insert("elem1"); listaSimple.insert("elem8");
		 * listaSimple.insert("delem3"); listaSimple.insert("elem4");
		 * listaSimple.insert("elem2"); listaSimple.insert("felem3");
		 * listaSimple.insert("elem3"); listaSimple.deleteElement(111);
		 * listaSimple.insertElementAlPrincipio("yo voy primero");
		 * listaSimple.insertElementAlPrincipio("no, yo, yo voy primero");
		 
		for (int i = 0; i < 20; i++) {
			listaSimple.insert("puntito" + i, (int)(Math.random()*20)+1);
			array.add("puntito" + i);
		}

		listaSimple.printListByNro();
		listaSimple.sortByNro();
		System.out.println("ahora ordenado:");
		listaSimple.printListByNro();
		listaSimple.printListRecursivo(listaSimple.at(0));
		for (int i = 0; i < listaSimple.getSize(); i++) {
			System.out.println(array.get(i));
		}
	
		DateFormat hora = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date inicioNodo = new Date();
		System.out.println(listaSimple.at(10000));
		System.out.println(listaSimple.getSize());
		Date finalNodo = new Date();
		Date inicioArray = new Date();
		for (int i = 0; i < 20000; i++) {
			array.add("puntito" + i);
		}
		System.out.println(array.get(10000));
		System.out.println(array.size());
		Date finalArray = new Date();
		long resultadoNodo = finalNodo.getTime() - inicioNodo.getTime();
		long resultadoArray = finalArray.getTime() - inicioArray.getTime();
		System.out.println(inicioNodo);
		System.out.println(finalNodo);
		System.out.println(resultadoNodo);
		System.out.println(resultadoArray);*/
	}

}
