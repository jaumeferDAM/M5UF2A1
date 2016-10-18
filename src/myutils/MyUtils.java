/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Lluis Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) //Metodo que recorre el String 
    //de forma inversa i introduce letra por letra en la variable resultat
    {
        String resultat = "";
        if (!"".equals(cadena)) {
            for (int i = cadena.length() - 1; i >= 0; i--) {
                cadena = resultat + cadena.charAt(i);
            }
        } else {
            return null;
        }

        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        Calendar cal = new GregorianCalendar();

        Calendar fechaActual = Calendar.getInstance();

        // Cálculo de las diferencias.
        int resultat = fechaActual.get(Calendar.YEAR) - year;
        int meses = fechaActual.get(Calendar.MONTH) - (month - 1);
        int dias = fechaActual.get(Calendar.DAY_OF_MONTH) - day;

        // Hay que comprobar si el día de su cumpleaños es posterior
        // a la fecha actual, para restar 1 a la diferencia de años,
        // pues aún no ha sido su cumpleaños.
        if (meses < 0 || (meses == 0 && dias < 0)) { // o es el mes pero no ha llegado el día.

            resultat--;
        }
        if (resultat > 150) {//Cas de edat>150 o dates imposibles
            return -1;
        } else if (year >= fechaActual.get(Calendar.YEAR) && day > fechaActual.get(Calendar.DAY_OF_MONTH) && (month - 1) >= fechaActual.get(Calendar.MONTH)
                || year >= fechaActual.get(Calendar.YEAR) && (month - 1) > fechaActual.get(Calendar.MONTH)) {
            return -2;
        }
        return resultat;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        } else {
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }
}
