/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionslearning;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class CollectLearningMethods {
    
    // DO-WHILE LOOP : syntax: do {statements} while (expression);
    public Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void askForAnotherDogRace() {
        boolean stop = false;
         ArrayList<String> aListOfDogRaces = new ArrayList();       // BE CAREFUL!!!
                                                                    // It won't work if you create the ArrayList INSIDE the loop
        do {
           
            System.out.println("Please write a new dog race");
            String auxRace = sc.next();
            aListOfDogRaces.add(auxRace);
            System.out.println("Would you like to add a new race to the list?");
            System.out.println("Please tipe 'y' (yes) or 'n' (no)");
            String aux = sc.next();
            if (aux.equals("n")){
                stop = true;           
            } 
        }  while (stop==false);
        
        showEveryStringInArrayList(aListOfDogRaces);
    }
    
    
    public void showEveryStringInArrayList(ArrayList<String> arr){
        for (String st : arr) {
            System.out.println(st);
        }
    }
    
}
