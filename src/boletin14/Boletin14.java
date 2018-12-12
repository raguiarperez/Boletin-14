/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author raguiarperez
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorTemperaturas temp = new ConversorTemperaturas();
        try{
            System.out.println(temp.centigradosAFahrenheit(120));
        }catch(Exception e){
            System.out.println("A temperatura non pode ser menor de 80 graos");
        }
        try{
            System.out.println(temp.centigradosAReamur(90));
        }catch(Exception e){
            System.out.println("A temperatura non pode ser menor de 80 graos");
        }
        
    }
    
}