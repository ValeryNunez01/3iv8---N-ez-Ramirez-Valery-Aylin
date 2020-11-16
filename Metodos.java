import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos{

    /*Se declaran dos variables globales, ya que las vamos a estar 
    ocupando en varios metodos*/
    Double ca = 0.0;
    Double total1 = 0.0;

    Scanner entrada = new Scanner(System.in);

    /*El metodo menu realiza una lista, la cual al elegir u a opcion,
     mandara llamar a otro metodo. Este menu prmite repetir cada opcion 
     o incluso el menu completo*/
    public void menu(){
        int opcion;
        int numero;
        int numero1=0;

        do{

        System.out.println("Elija alguna opcion");
        System.out.println("1.Calculo del precio a pagar");
        System.out.println("2.Anadir credito");
        System.out.println("3.Consultar credito");

        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
            do{ 
            Calculo();
            System.out.println("¿Desea repetir esta opcion?, si la respuesta es afirmativa escriba un 1, de lo contrario escriba un 0");
            numero = entrada.nextInt();
            }while(numero != 0);
            System.out.println("¿Desea repetir el menu?, si la respuesta es afirmativa escriba un 3, de lo contrario escriba un 5");
            numero1 = entrada.nextInt();
            break;

            case 2:
            do{
            Anadir();
            System.out.println("¿Desea repetir esta opcion?, si la respuesta es afirmativa escriba un 1, de lo contrario escriba un 0");
            numero = entrada.nextInt();
            }while(numero != 0);
            System.out.println("¿Desea repetir el menu?, si la respuesta es afirmativa escriba un 3, de lo contrario escriba un 5");
            numero1 = entrada.nextInt();
            break;

            case 3:
            do{
            Consultar();
            System.out.println("¿Desea repetir esta opcion?, si la respuesta es afirmativa escriba un 1, de lo contrario escriba un 0");
            numero = entrada.nextInt();
            }while(numero != 0);
            System.out.println("¿Desea repetir el menu?, si la respuesta es afirmativa escriba un 3, de lo contrario escriba un 5");
            numero1 = entrada.nextInt();
            break;
        }    
        }while(numero1 != 5);
    }
    /*En este metodo llamado calculo, vamos a obtener valores del usuario
     que nos van a permitir hacer los distintos calculos que proporcina 
     el programa */
    public void Calculo(){

        int credito;
        int celular;
        int l;
        int l1;
        int l2;
        Double t1;
        Double t2;
        Double t3;
        Double total;
        Double t;
        
        System.out.println("Ingrese su numero de celular sin el (55)");
        celular = entrada.nextInt();
        System.out.println("Ingrese su credito actual");
        credito = entrada.nextInt();
        System.out.println("¿Cuantas llamadas nacionales ha realizado en este mes?");
        l = entrada.nextInt();
        System.out.println("¿Cuantas llamadas internacionales ha realizado en este mes?");
        l1 = entrada.nextInt();
        System.out.println("¿Cuantas llamadas a celular ha realizado en este mes?");
        l2 = entrada.nextInt();

        t1 = l * 0.5;
        t2 = l1 * 0.6;
        t3 = l2 * 0.2;
        total = t1 + t2 + t3;
        ca = credito - total;

        System.out.println("Precio total por llamadas nacionales "+t1+" pesos");
        System.out.println("Precio total por llamadas internacionales "+t2+" pesos");
        System.out.println("Precio total por llamadas a celular "+t3+" pesos");
        System.out.println("Costo total "+total+" pesos");
        System.out.println("Credito actual "+credito+" pesos");
        System.out.println("Credito actualizado "+ca+" pesos");
    }
    /*El metodo Anadir le permite al usuario agregar dinero a su credito actual*/
    public void Anadir(){

        Double dinero;
        Double credito;

        if(ca == 0){

            System.out.println("Ingrese su credito actual");
            credito = entrada.nextDouble();
            System.out.println("Escriba la cantidad de dinero que desea anadir a su credito actual");
            dinero = entrada.nextDouble();

            total1 =  dinero + credito;

        System.out.println("Su credito total ahora es de "+total1+" pesos");

        }
        else{
            System.out.println("Escriba la cantidad de dinero que desea anadir a su credito actual");
        dinero = entrada.nextDouble();
        total1 =  dinero + ca;
        System.out.println("Su credito total ahora es de "+total1+" pesos");
        }
    }

    /*El metodo cosultar permite saber tu crdito total. Sin embargo, 
    si el usuario no ha entrado a alguna de las primeras 2 opciones del
    menu, el programa e dira que no conoce su credito*/
    public void Consultar(){
        if(ca == 0 && total1 == 0.0){
            
            System.out.println("No conocemos su credito");

        }
        else{
            if(total1 > ca){
                System.out.println("Su credito total es de "+total1+" pesos");
            } 
            else{
                System.out.println("Su credito total es de "+ca+" pesos");
            }
        }
    }
}   
    