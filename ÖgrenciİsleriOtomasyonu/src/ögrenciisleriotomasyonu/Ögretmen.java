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
import java.util.ArrayList;
import java.util.Scanner;



public class Ögretmen extends Kullanici  {
    
    Scanner girilen=new Scanner(System.in); 
    static void p(String s) {
      System.out.println(s);}
     Ögretmen(){
     }
       String ders;
      public Ögretmen(String TC,String adi,String soyadi,String AnneAdi,String BabaAdi,String email,String adres,String Tel,String DogumYılı,String DogumYeri,String cepTel){
      
      this.adi=adi;
      this.soyadi=soyadi;
      this.AnneAdi=AnneAdi;
      this.BabaAdi=BabaAdi;
      this.email=email;
      this.DogumYeri=DogumYeri;
      this.cepTel=cepTel;
      this.Tel=Tel;
      this.DogumYılı=DogumYılı;
      this.adres=adres;
      this.TC=TC;
     
    }
      
    void vizenotekle() throws IOException{
         
      int not;
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File("ögrencilistesi.txt");
 FileReader fileReader = new FileReader(f);
 
 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((adi = br.readLine()) != null) {
p(adi+" isimli ogrencinin vize notunu giriniz");
 not=girilen.nextInt();
 list.add(adi+" "+not);
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("vizenotlar.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
  
  
    }
     public void sifreolustur ()  throws IOException {
     int sifre;

 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File("ögretmenlistesi.txt");
 FileReader fileReader = new FileReader(f);
 
 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((adi = br.readLine()) != null) {
p(adi+" isimli ogretmenin sifresini giriniz");
 sifre=girilen.nextInt();
 list.add(adi+" "+sifre);
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("Ögretmensifresi.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
     }
     
     
     
    public void vizenotlistele() throws IOException{
         File dosya = new File("vizenotlar.txt");
         FileReader fileReader = new FileReader(dosya);
         String line;

            try (BufferedReader br = new BufferedReader(fileReader)) {
                while ((line = br.readLine()) != null) {
                    
                    p(line);
                    p("\n");
                }           }
    }
    
    
    
    
    
    
    
    
    void finalnotekle() throws IOException{
         
      int not;
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File("ögrencilistesi.txt");
 FileReader fileReader = new FileReader(f);

 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((adi = br.readLine()) != null) {
p(adi+" isimli ogrencinin final notunu giriniz");
 not=girilen.nextInt();
 list.add(adi+" "+not);
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("finalnotlar.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
  
  
  
 }
        
               
    
    
    
    
    public void finalnotlistele() throws IOException{
         File dosya = new File("finalnotlar.txt");
         FileReader fileReader = new FileReader(dosya);
         String line;

            try (BufferedReader br = new BufferedReader(fileReader)) {
                while ((line = br.readLine()) != null) {
                    
                    p(line);
                    p("\n");
                }           }
    }
    
 public void devamsizlikekle(){
                 
 String devamsizlik;
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File("ögrencilistesi.txt");
 FileReader fileReader = new FileReader(f);
 
 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((adi = br.readLine()) != null) {
 System.out.println(adi+" isimli ogrencinin devamsizlik bilgisini giriniz");
 devamsizlik=girilen.nextLine();
 list.add(adi+" "+devamsizlik);
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("devamsizlik.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
       
 }   

    void bilgigüncelle(){
         p("Tc nizi tekrar giriniz: ");
                    TC=girilen.nextLine();
     
 String a = String.valueOf(TC);
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File("ögretmenler.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 continue;
 }
 else{list.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("ögretmenler.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 ArrayList<String> list2 = new ArrayList<>();
 try{
 File f = new File("ögretmenlistesi.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 continue;
 }
 else{list2.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("ögretmenlistesi.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list2){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 ArrayList<String> list3 = new ArrayList<>();
 try{
 File f = new File("dersler.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 continue;
 }
 else{list3.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("dersler.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list3){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 
 
 
 }
 ArrayList<String> list4 = new ArrayList<>();
 try{
 File f = new File("dersprogrami.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 continue;
 }
 else{list4.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("dersprogrami.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list4){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
  try{
                    FileInputStream fi=new FileInputStream("ögretmenler.txt");
                    BufferedReader buf=new BufferedReader(new InputStreamReader(fi));
                }
                catch(FileNotFoundException f)
                    {System.out.println("Dosya yok!");
                     }
                catch(IOException ioex)
                    {System.out.println("Başka bir hata oldu!"); }
                p("TC:");
                TC=girilen.nextLine();
                
                p("İsim giriniz:");
                adi=girilen.nextLine();
                p("Soyisim giriniz:");
                soyadi=girilen.nextLine();
                p("Telefon giriniz:");
                cepTel=girilen.nextLine();
                p("Mail adresi giriniz:");
                email=girilen.nextLine();
                p("Ev telefonu giriniz:");
                Tel=girilen.nextLine();
                p("Adresi giriniz:");
                adres=girilen.nextLine();
                p("Anne adı giriniz:");
                AnneAdi=girilen.nextLine();
                p("Baba adı giriniz:");
                BabaAdi=girilen.nextLine();
                p("Dogum yili giriniz :");
                DogumYılı=girilen.nextLine();
                p("Dogum yeri giriniz:");
                DogumYeri=girilen.nextLine();
                
           
                Ögretmen ogret= new Ögretmen(TC,adi, soyadi,AnneAdi, BabaAdi,email,adres,Tel,DogumYılı,DogumYeri,cepTel);
              
                try {
                  
                    
                    File dosya = new File("ögretmenler.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogret.TC+" "+ogret.adi+ " " +ogret.soyadi+" "+ogret.BabaAdi+ " "+ogret.AnneAdi +" "+ogret.DogumYeri+" "+ ogret.DogumYılı+ " "+ogret.Tel+ " "
                            +ogret.email+ " " +ogret.adres+" "+ogret.cepTel);
                    yaz.write("\n");
                    yaz.close();
                
                }   
                catch (FileNotFoundException ex) {
                    System.out.println("Dosya Yok!");
                } 
                catch (IOException ex) {
                    System.out.println("Hata!");
                }
             
         try {
                  
                    
                    File dosya = new File("ögretmenlistesi.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogret.TC +" "+ogret.adi);
                    yaz.write("\n");
                    yaz.close();
                
                }   
                catch (FileNotFoundException ex) {
                    System.out.println("Dosya Yok!");
                } 
                catch (IOException ex) {
                    System.out.println("Hata!");
                }
    
    
        
        
        
    }
    }
        
        
        
        
        
        
        
        
        


