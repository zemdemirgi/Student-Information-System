
package ögrenciisleriotomasyonu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static ögrenciisleriotomasyonu.Admin.p;

public class Dersler {
    String Bmg;
    String VeriYapilari;
    String Nesne;
    String Lojik;
    String Devreler;
    String Dif;
    String CircuitTheory;
    String Calculus3;
    String Ekonomi;
    	
String Termodinamik;
String Malzeme1;
String Dinamik;
String TeknikResimUygulamaları;
     public void bilgisayarmühders() throws IOException{
         
         
         
    String path = "bilgisayardersleri.txt";
    FileWriter file = new FileWriter(path);
    BufferedWriter writer = new BufferedWriter(file);
    writer.write("Bmg \n Veri Yapilari \n Lojik \n Nesne \n Dif \n Devreler");
    writer.close();     
    
    
     File dosya = new File("bilgisayardersleri.txt");
            FileReader fileReader = new FileReader(dosya);
            String line;

            try (BufferedReader br = new BufferedReader(fileReader)) {
                while ((line = br.readLine()) != null) {
                    
                    p(line);
                    p("\n");
                }          
    
       
            }}
     
     public void elektrikmühders() throws IOException{
       
             
    String path = "elektrikdersleri.txt";
    FileWriter file = new FileWriter(path);
    BufferedWriter writer = new BufferedWriter(file);
    writer.write("Ekonomi \n Circuit Theory \n Calculus 3 \n Dif");
    writer.close();     
    
    
     File dosya = new File("elektrikdersleri.txt");
            FileReader fileReader = new FileReader(dosya);
            String line;

            try (BufferedReader br = new BufferedReader(fileReader)) {
                while ((line = br.readLine()) != null) {
                    
                    p(line);
                    p("\n");
                }          
    
       
            }
    }
     public void makinamühders() throws IOException{
        
              
    String path = "makinadersleri.txt";
    FileWriter file = new FileWriter(path);
    BufferedWriter writer = new BufferedWriter(file);
    writer.write("Termodinamik \n Malzeme 1 \n Dinamik \n Teknik resim uygulamaları \n Calculus 3");
    writer.close();     
    
    
     File dosya = new File("makinadersleri.txt");
            FileReader fileReader = new FileReader(dosya);
            String line;

            try (BufferedReader br = new BufferedReader(fileReader)) {
                while ((line = br.readLine()) != null) {
                    
                    p(line);
                    p("\n");
                }          
    
       
            }}
     
}
     
    

