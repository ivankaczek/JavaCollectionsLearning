/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionslearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class CollectionsLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
                              
        //  COLLECTIONS 
        
        ArrayList<String> anArrayListWithNames = new ArrayList();
                                                                    // in previous line the size is 0, as we can check
        //System.out.println("the size of the prev ArrayList is " + anArrayListWithNames.size());
        
        // we use method .add()
        anArrayListWithNames.add("My first element in the Array");
        anArrayListWithNames.add("My second element in the Array");
        anArrayListWithNames.add("My third element in the Array");
        anArrayListWithNames.add("ABC");
        anArrayListWithNames.add("ABC");
        
        //System.out.println("and now the size is " + anArrayListWithNames.size());
        
        anArrayListWithNames.remove("ABC");                         // this allows to remove an OBJECT. I put "" and it understands
                                                                    // that we are talking about a String
        
        // System.out.println("and now the size is " + anArrayListWithNames.size());
        
        // MOST IMPORTANT things to know about Lists is a) they accept duplicated elements, b) they do not have an order, except if we
        // apply any kind of method to order
        
        /* public class TicketServices {
    
    public ArrayList<String> ticketCodes;

    
    /* The constructor will originally look like this, but we will initialize it in a different way
    public TicketServices(ArrayList<String> ticketCodes) {
        this.ticketCodes = ticketCodes;
    }
    */
        
        
        
        /*
    public TicketServices() {
        this.ticketCodes = new ArrayList();
    // The previous lines means that every time that we "call" the TicketServices, we will have a new ArrayList
    // that will be born */
        
        
        // EGG-ZERCICES
        
        
        
        /*
        1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
        */
        
        
       
        CollectLearningMethods me01 = new CollectLearningMethods();
        
        ArrayList<String> dogRacesNamesInMain = me01.createArrayCommonDogNames();
        //me01.showEveryStringInArrayList(dogRacesNamesInMain);
          // the previous shows the following output
          /*
          run:
Beagle
Dalmatian
Cocker
English Setter
Chihuahua
German Sheffer
BUILD SUCCESSFUL (total time: 1 second)
                    */
        // let's ask for the index of "Cocker" in the list
        int position = dogRacesNamesInMain.indexOf("Cocker");
        //System.out.println("The position for 'Cocker' is " + position);
                
        // let's learn how to use an iterator and explore a few methods within
        Iterator<String> iter = dogRacesNamesInMain.iterator(); 
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
         
    Iterator listIter = dogRacesNamesInMain.iterator();
    // here we print a list using a while-loop and the iterator
         while(iter.hasNext()){
            System.out.println(iter.next());
         }
       
          
        /*
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
        */
        System.out.println("Please write down a dogRace to remove from the list");
         String auxDog2Find = "Dalmatian";
         System.out.println("you chose " + auxDog2Find);
         Iterator<String> iter02 = dogRacesNamesInMain.iterator();
         while(iter02.hasNext()){
            
            if(iter02.next().equals(auxDog2Find)){
                System.out.println("We've found the requested dog Race " + iter02.next());
                iter02.remove();                                                                    //   THIS ACTUALLY DOESNT WORKS!!!!
                                                                                                    // SINCE WE'RE REMOVING THE COCKER
            }
        }
         
         me01.showEveryStringInArrayList(dogRacesNamesInMain);
        
         System.out.println("Please write down a dogRace to remove from the list");
         String anotherDog2Find = "Dalmatian";
         System.out.println("you chose " + anotherDog2Find + "to be removed");
         Iterator<String> iter03 = dogRacesNamesInMain.iterator();
         while(iter03.hasNext()){
            String aux = iter03.next();
            if(aux.equals(anotherDog2Find)){
                System.out.println("We've found the requested dog Race " + anotherDog2Find + " and it will be removed");
                iter03.remove();                                                                    //   THIS ACTUALLY WORKS!!!!
                                                                                                    //  :)
            }
        }
         
         me01.showEveryStringInArrayList(dogRacesNamesInMain);
         
         
         
        /*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.
        */
        
        
        
        
        
    }
    
}




/*
ITERATION EXEMPLE
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
 
public class WhileIteration {
 
    public static void main(String[] args) {
 
        Collection<String> collection = new ArrayList<String>();
 
        collection.add("zero");
        collection.add("one");
        collection.add("two");
 
        Iterator<string> iterator = collection.iterator();
 
        // while loop
        while (iterator.hasNext()) {
        System.out.println("value= " + iterator.next());
        }
    }
}

*/


/*
TO REMOVE ITEMS USING ITERATOR
An element can be removed from a Collection using the Iterator method remove(). This method removes the current element in the Collection. If the remove() method is not preceded by the next() method, then the exception IllegalStateException is thrown.

A program that demonstrates this is given as follows.

Example
 Live Demo

import java.util.ArrayList;
import java.util.Iterator;
public class Demo {
   public static void main(String[] args) {
      ArrayList<String> aList = new ArrayList<String>();
      aList.add("Apple");
      aList.add("Mango");
      aList.add("Guava");
      aList.add("Orange");
      aList.add("Peach");
      System.out.println("The ArrayList elements are: ");
      for (String s: aList) {
         System.out.println(s);
      }
      Iterator i = aList.iterator();
      String str = "";
      while (i.hasNext()) {
         str = (String) i.next();
         if (str.equals("Orange")) {
            i.remove();
            System.out.println("\nThe element Orange is removed");
            break;
         }
      }
      System.out.println("\nThe ArrayList elements are: ");
      for (String s: aList) {
         System.out.println(s);
      }
   }
}
*/