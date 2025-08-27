package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person people1 = new Person("Johnnathan", 74601621,24,"masculino","26-06-2001");
        final Person prueba1 = new Person();
        prueba1.name="Fulano";

        final Person prueba2 = new Person("Melissa",75602341);
        prueba2.printPerson();

        people1.playing(prueba2);
    }
}
/**
 * Scanner sca=new Scanner(System.in);
 *         Integer opcion;
 *         Integer num1;
 *         Integer num2;
 *         Integer resultado=0;
 *         do{
 *             resultado=0;
 *             System.out.println("------------Calculadora------------C");
 *             System.out.println("1. SUmar");
 *             System.out.println("2. Restar");
 *             System.out.println("3. Multiplicar");
 *             System.out.println("4. Dividir");
 *             System.out.println("5. Cerrar");
 *             System.out.print("Selecciona una opción: ");
 *             opcion=sca.nextInt();
 *             if(opcion!=5){
 *                 System.out.print("Ingrese el primer nýmero: ");
 *                 num1=sca.nextInt();
 *                 System.out.print("Ingrese el segundo nýmero: ");
 *                 num2=sca.nextInt();
 *                 switch(opcion){
 *                     case 1:
 *                         resultado = num1+num2;
 *                         break;
 *                     case 2:
 *                         resultado = num1-num2;
 *                         break;
 *                     case 3:
 *                         resultado = num1*num2;
 *                         break;
 *                     case 4:
 *                         if(num2!=0)
 *                             resultado = num1/num2;
 *                         else{
 *                             System.out.println("No se puede dividir entre 0");
 *                         }
 *                         break;
 *                 }
 *                 System.out.println("Resuiltado: "+resultado);
 *
 *             }
 *         }while(opcion!=5);
 *         System.out.println("Apagando....");
 *
 *
 * */