import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos{

    Scanner entrada = new Scanner(System.in);

    //Hacemos un metodo que muestre un menu el cual a u vez llame a otros metodos
    //Este menu permite repetir cada opcion o bien el menu completo

    public void menu(){

        int opcion;
        int numero;
        int numero1=0;

        do{

        System.out.println("Elija alguna opcion");
        System.out.println("1.Perimetro y area de un circulo");
        System.out.println("2.Perimetro y area de un rectangulo");
        System.out.println("3.Perimetro y area de un cuadrado");
        System.out.println("4.Perimetro y area de un triangulo");

        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
            do{ 
            circulo();
            System.out.println("¿Desea repetir esta opcion?, si la respuesta es afirmativa escriba un 1, de lo contrario escriba un 0");
            numero = entrada.nextInt();
            }while(numero != 0);
            System.out.println("¿Desea repetir el menu?, si la respuesta es afirmativa escriba un 3, de lo contrario escriba un 5");
            numero1 = entrada.nextInt();
            break;

            case 2:
            do{
            rectangulo();
            System.out.println("¿Desea repetir esta opcion?, si la respuesta es afirmativa escriba un 1, de lo contrario escriba un 0");
            numero = entrada.nextInt();
            }while(numero != 0);
            System.out.println("¿Desea repetir el menu?, si la respuesta es afirmativa escriba un 3, de lo contrario escriba un 5");
            numero1 = entrada.nextInt();
            break;

            case 3:
            do{
            cuadrado();
            System.out.println("¿Desea repetir esta opcion?, si la respuesta es afirmativa escriba un 1, de lo contrario escriba un 0");
            numero = entrada.nextInt();
            }while(numero != 0);
            System.out.println("¿Desea repetir el menu?, si la respuesta es afirmativa escriba un 3, de lo contrario escriba un 5");
            numero1 = entrada.nextInt();
            break;

            case 4:
            do{
            triangulo();
            System.out.println("¿Desea repetir esta opcion?, si la respuesta es afirmativa escriba un 1, de lo contrario escriba un 0");
            numero = entrada.nextInt();
            }while(numero != 0);
            System.out.println("¿Desea repetir el menu?, si la respuesta es afirmativa escriba un 3, de lo contrario escriba un 5");
            numero1 = entrada.nextInt();
            break;
        }    
        }while(numero1 != 5);
    }    

        //Este metodo permite calcular el area y el perimetro de un circulo
        public void circulo(){

            Double area;
            Double perimetro;
            Double radio;

            System.out.println("Ingresa el radio de tu circulo");
            radio = entrada.nextDouble(); 

            
            area = 3.1416 * (radio * radio);
            perimetro = 3.1416 * (radio * 2.00);

            System.out.println("Area = "+area+"\nPerimetro = "+perimetro);

        }

        //Este metodo permite calcular el area y el perimetro de un rectangulo
        public void rectangulo(){

            Double lado1;
            Double lado2;
            Double perimetro;
            Double area;

            System.out.println("Ingresa la distancia del lado 1");
            lado1 = entrada.nextDouble(); 

            System.out.println("Ingresa la distancia del lado 2");
            lado2 = entrada.nextDouble(); 

            
            area = lado1 * lado2;
            perimetro = (lado1 * 2) + (lado2*2);

            System.out.println("Area = "+area+"\nPerimetro = "+perimetro);

        }

        //Este metodo permite calcular el area y el perimetro de un cuadrado
        public void cuadrado(){

            Double lado;
            Double perimetro;
            Double area;

            System.out.println("Ingresa la distancia del lado ");
            lado = entrada.nextDouble(); 

            area = lado * lado;
            perimetro = lado * 4;

            System.out.println("Area = "+area+"\nPerimetro = "+perimetro);

        }

        //Este metodo permite calcular el area y el perimetro de un triangulo
        public void triangulo(){

            Double altura;
            Double base;
            Double perimetro;
            Double area;
            Double lado1;
            Double lado2;
            Double lado3;

            System.out.println("Ingresa la distancia del lado 1");
            lado1 = entrada.nextDouble();

            System.out.println("Ingresa la distancia del lado 2");
            lado2 = entrada.nextDouble(); 

            System.out.println("Ingresa la distancia del lado 3");
            lado3 = entrada.nextDouble(); 

            System.out.println("Ingresa la distancia de la altura");
            altura = entrada.nextDouble();
            
            System.out.println("Ingresa la distancia de la base");
            base = entrada.nextDouble();   
            
            
            area = (altura * base)/2;
            perimetro = lado1 + lado2 + lado3;

            System.out.println("Area = "+area+"\nPerimetro = "+perimetro);

        }    
}