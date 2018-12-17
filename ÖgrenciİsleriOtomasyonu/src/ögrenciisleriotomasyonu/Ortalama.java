
package ögrenciisleriotomasyonu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ortalama {
    static void p(String s) {
      System.out.println(s);}
      Scanner girilen=new Scanner(System.in);
 int i;
 int j;
 float ortalama;
 public void ortalama() {

 p("TC gir :");
 String TC=girilen.nextLine();
 String a = String.valueOf(TC);
 try{
 File f = new File("vizenotlar.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 String[] not;
 not=line.split(" ");
 i=Integer.parseInt(not[3]);

 }
 else{}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File file = new File("finalnotlar.txt");
 FileReader fileReader2 = new FileReader(file);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader2)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 String[] not;
 not=line.split(" ");
 j=Integer.parseInt(not[3]);
 }
 else{}
 } 
 }
 }
 catch(Exception e){
 }
 System.out.println("vize notu: "+i+"final notu "+j);
 ortalama=(float)(i+j)/2;
 System.out.println("ORTALAMA: "+ortalama);
 
 
 
 }

}
