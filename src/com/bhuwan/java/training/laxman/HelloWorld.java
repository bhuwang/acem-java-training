package com.bhuwan.java.training.laxman;
import java.util.Scanner;

/**
 * <pre>
 * which takes two argument
 *a. Salutaion
 *b. Full Name and
 *c. Display SalutationFull Name in console.
 *</pre>
 * @author laxman
 */


public class HelloWorld {
    public static void main(String[] arg){
        String salut,name;
        Scanner in = new  Scanner(System.in);
        System.out.println("Enter the salutation");
        salut = in.nextLine();
        System.out.println("Enter the full name");
        name = in.nextLine();
        System.out.println(salut+" "+ name);
        in.close();
    }
}
