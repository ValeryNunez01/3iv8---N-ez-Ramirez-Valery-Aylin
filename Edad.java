import java.util.Scanner;
import javax.swing.JOptionPane;

public class Edad{

    int m;

    Scanner entrada = new Scanner(System.in);

    /*Creamos el metodo ingresar para obtener ciertos datos que nos 
    van a ayudar a calcular la edad del ususario*/

    public void ingresar(){

        
        int edad;

        String texto = JOptionPane.showInputDialog("Enter your year of birth");
        int year = Integer.parseInt(texto);

        String texto2 = JOptionPane.showInputDialog("Enter the current year");
        int year2 = Integer.parseInt(texto2);

        edad = calcular( year, year2);

        System.out.println("\nYour age is "+edad+" years old");

    }

    /*Se crea un segundo metodo para hacer el calculo de la edad, a 
    traves de los datos ya obtenidos. El metodo no es void porque 
    regresamos valores */

    public int calcular(int year , int year2 ){

        m = year2 - year;

        return m;
        
    }
}