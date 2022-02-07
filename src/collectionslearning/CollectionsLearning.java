/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionslearning;

import java.util.ArrayList;

/**
 *
 * @author Ivan
 */
public class CollectionsLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        String[] arrayNames = new String[5];
        for (int i = 0; i < arrayNames.length; i++) {
            arrayNames[i]="This Name #" + (i+1);
        }
        for (String arrayName : arrayNames) {                       // you can call the "for" with CTRL + space bar
            System.out.println(arrayName);
        } 
        */
        
        
        
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
        
        
        //ArrayList<String> dogRaces = new ArrayList();
        CollectLearningMethods me01 = new CollectLearningMethods();
        me01.askForAnotherDogRace();
        
        /*
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
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
