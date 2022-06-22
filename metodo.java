/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

import java.util.Scanner;

/*Le pasamos a la función un número del 1 al 12 y nos devuelve el nombre del
mes. Si no es un número del 1 al 12 nos dice Error.*/
public class metodo {


    String nomMes(int mes) {

        String mesText = "";

     

            switch (mes) {
                case 1:

                    mesText = "Enero";
                    break;
                case 2:
                    mesText = "Febrero";
                    break;
                case 3:
                    mesText = "Marzo";
                    break;
                case 4:
                    mesText = "Abril";
                    break;
                case 5:
                    mesText = "Mayo";
                    break;
                case 6:
                    mesText = "Junio";
                    break;
                case 7:
                    mesText = "Julio";
                    break;
                case 8:
                    mesText = "Agosto";
                    break;
                case 9:
                    mesText = "Setiembre";
                    break;
                case 10:
                    mesText = "Octubre";
                    break;
                case 11:
                    mesText = "Noviembre";
                    break;
                case 12:
                    mesText = "Diciembre";
                    break;
                default:
                    System.out.println("¡¡¡ERROR!!!");
                    break;
            }
       

        return mesText;
    }

}
