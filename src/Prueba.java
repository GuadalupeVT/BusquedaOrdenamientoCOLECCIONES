import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * Framework coleciones Java
 * 
 * INTERFACES
 *     Set    NO permite duplicados
 *     List   Si permite duplicados
 *     Map    No permite duplicados de CLAVES (Pares CLAVE-VALOR)
 *     
 *     Implementaciones
 *         Set  --> HashSet, LinkedHashSet y Treeset
 *         List --> ArrayList y LinkedList
 *         Map  --> HashMap, LinkedHashMap y TreeMap
 *         
 * CLASES
 *     Vector
 *     Que
 *     Deque
 *     Stack
 *   
 */
public class Prueba {
	public static void main(String[] args) {
		
		ArrayList <Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(4);
		numeros.add(-9);
		numeros.add(32);
		numeros.add(-1);
		
		System.out.println(numeros.toString());
		
		//MergeSort
		Collections.sort(numeros);
		System.out.println(numeros.toString());
		
		ArrayList <String> nombres = new ArrayList<>();
		nombres.add("Luke");
		nombres.add("Leia");
		nombres.add("Anakyn");
		nombres.add("Obi Wan Kenobi");
		
		ArrayList<String> copiaNombres = (ArrayList<String>) nombres.clone();
		
		System.out.println(nombres.toString());
		Collections.sort(nombres);
		System.out.println(nombres.toString());
		
		System.out.println("==========Ordenamiento en orden inverso");
		System.out.println(copiaNombres.toString());
		Collections.sort(copiaNombres,Collections.reverseOrder());
		System.out.println(copiaNombres.toString());
		          //QuickSort
		//Arrays.sort(a);
		
		System.out.println("===============================================");
		
		class Alumno implements Comparable<Alumno>{
			String numControl;
			Integer edad;
			public Alumno() {}
			public Alumno(String numControl, int edad) {
				this.numControl = numControl;
				this.edad = edad;
			}
			@Override
			public String toString() {
				return "Alumno [numControl=" + numControl + ", edad=" + edad + "]";
			}
			@Override
			public int compareTo(Alumno a) {
				return edad.compareTo(a.edad);
			}
			public boolean equals(Alumno a) {
				boolean result=false;
				if(a instanceof Alumno) {
					Alumno alumno=(Alumno)a;
					result = edad.equals(edad);
				}
				return result;
			}
			public int hashCode() {
				return edad.hashCode();
			}
			
		}//class Alumno
		
		
		Alumno a1 = new Alumno("17",20);
		Alumno a2 = new Alumno("1",1);
		Alumno a3 = new Alumno("7",56);
		Alumno a4 = new Alumno("878",30);
		Alumno a5 = new Alumno("3",7);
		
		ArrayList<Alumno>alumnos = new ArrayList<>();
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		alumnos.add(a5);
		
		//ORDENAR LOS ALUMNOS
		System.out.println(alumnos.toString());
		Collections.sort(alumnos);
		System.out.println(alumnos.toString());
		
		//Busqueda
		System.out.println("_______________________________");
		System.out.println(Collections.binarySearch(numeros, -1));
	    Alumno x=a1;
		System.out.println(Collections.binarySearch(alumnos,a1));//Lee el objeto a buscar
		//Tarea:Aplicar binarySearch en colleccion alumnos
		
	
	}//main

}
