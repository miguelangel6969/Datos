
package archivo_txt;


import java.io.*;

public class Archivo_txt {

   
    public static void main(String[] args) {
 
        String letras = "";
        for (int i = 0; i < 1000; i++) {
        int random = (int ) (Math.random()*3+1);
        switch(random){
            case 1:
                letras +="a";
                break;
            case 2:
                letras +="b";
                break;
            case 3:
                letras +="c";
                break;
        }
        }
        try{
            PrintWriter pw = new PrintWriter ("D:\\Users\\familia\\Desktop\\archivo_txt\\src\\txt\\Doc");
            pw.println(letras);
            pw.close();
         }catch(FileNotFoundException e){}
     
        Archivo read = new Archivo();
        String Abc = read.leer_tx("D:\\Users\\familia\\Desktop\\archivo_txt\\src\\txt\\Doc");
       
        String secuencia1 = "abc";
        String secuencia2 = "aabbaa";
        String secuencia3 = "aaabac";
        int contador1 = 0, contador2 = 0, contador3 = 0;
        
        for (int i = 0; i < Abc.length()-2; i++) {
            String cadena="";
            for (int j = i; j < i+3; j++) 
                cadena += Abc.charAt(j);    
                if (cadena.equals("abc")) contador1++;
            }
        
        for (int i = 0; i < Abc.length()-5; i++) {
            String cadena="";
            for (int j = i; j < i+6; j++) 
                cadena += Abc.charAt(j);
                if (cadena.equals(secuencia2)) contador2++;
                if (cadena.equals(secuencia3)) contador3++; 
            }
        
        String r1 ="La secuencia "+secuencia1+" se repite: "+contador1+" veces";
        String r2 ="La secuencia "+secuencia2+" se repite: "+contador2+" veces";
        String r3 ="La secuencia "+secuencia3+" se repite: "+contador3+" veces";
     
        try{
            PrintWriter pw = new PrintWriter ("Respuesta.txt");
            pw.println(r1);
            pw.println(r2);
            pw.println(r3);
            pw.close();
         }catch(FileNotFoundException e){}
     
        System.out.println("La secuencia "+secuencia1+" se repite: "+contador1+" veces");
        System.out.println("La secuencia "+secuencia2+" se repite: "+contador2+" veces");
        System.out.println("La secuencia "+secuencia3+" se repite: "+contador3+" veces");
    }   
    
}


