package ögrenciisleriotomasyonu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import static ögrenciisleriotomasyonu.Admin.p;
import static ögrenciisleriotomasyonu.Ögretmen.p;

public class Ögrenci extends Kullanici  {
    String Bölüm;
 Scanner girilen=new Scanner(System.in);
    static void p(String s) {
        System.out.println(s);}
   
    Ögrenci() {
        
    }
    public void Ögrenci(String adi,String soyadi,String AnneAdi,String BabaAdi,String email){
      this.adi=adi;
      this.soyadi=soyadi;
      this.AnneAdi=AnneAdi;
      this.BabaAdi=BabaAdi;
      this.email=email;
     
        
    }
    public void DönemDersleri(){
        
        
    }
    public void vizenotlistele() throws IOException{
 
  System.out.println("Tc'nizi giriniz");
  String Tc=girilen.nextLine();

 String a = String.valueOf(Tc);
 String[] not;
 try{
 File f = new File("vizenotlar.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 BufferedReader br = new BufferedReader(fileReader);
  
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 not=line.split(" ");
 System.out.println("Notunuz :"+not[3]);
 
 break;
 }
 else{continue;}
 } 
  
 }
 catch(Exception e) {}
 }
 
 
 
 
 
    
    public void finalnotlistele() throws IOException{
       System.out.println("Tc'nizi giriniz");
  String Tc=girilen.nextLine();

 String a = String.valueOf(Tc);
 String[] not;
 try{
 File f = new File("finalnotlar.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 BufferedReader br = new BufferedReader(fileReader);
  
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 not=line.split(" ");
 System.out.println("Notunuz :"+not[3]);
 break;
 }
 else{continue;}
 } 
  
 }
 catch(Exception e) {}
 }
 
 
 

public void devamsizlikgör(){
System.out.println("Adinizi giriniz");

 String adi=girilen.nextLine();

 String a = adi;
 try{
 File f = new File("devamsizlik.txt");
 FileReader fileReader = new FileReader(f);
 
 BufferedReader br = new BufferedReader(fileReader);
 String line;
 line = br.readLine();
 while (adi != null) {
 if((line=br.readLine()).startsWith(a)){
 
p("devamsizlik bilginiz : "+line);
 break;
 }
 else{continue;}
 } 
  
 }
 catch(Exception e) {}
 }

public void bilgigüncelle(){
    
     p("TC'nizi giriniz :");
                    TC=girilen.nextLine();
 
 String a = String.valueOf(TC);
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File("ögrenciler.txt");
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
 File f = new File("ögrenciler.txt");
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
 File f = new File("ögrencilistesi.txt");
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
 File f = new File("ögrencilistesi.txt");
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
 File f = new File("vizenotlar.txt");
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
 File f = new File("vizenotlar.txt");
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
 File f = new File("finalnotlar.txt");
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
 File f = new File("finalnotlar.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list4){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 
               p("Bölümü : ");
    
    
                p("1.Bilgisayar Mühendisligi");
                p("2.Elektrik-Elektronik Mühendisligi");
                p("3.Makina Mühendisligi");
              
                int secim=girilen.nextInt();
                switch(secim){
                    
           
                case 1 :
  p("Tc'nizi tekrar giriniz.");
                    TC=girilen.next();
     
 String b= String.valueOf(TC);   
 ArrayList<String> list5 = new ArrayList<>();
 try{
 File f = new File("bilgisayarögrenci.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(b)){
 continue;
 }
 else{list5.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("bilgisayarögrenci.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list5){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());

 }
  
           
                
                p("Bilgilerini tekrar giriniz.");
            p("İsim giriniz:");
                adi=girilen.next();
                p("Soyisim giriniz:");
                soyadi=girilen.next();
                p("Telefon giriniz:");
                cepTel=girilen.next();
                p("Mail adresi giriniz:");
                email=girilen.next();
                p("Ev telefonu giriniz:");
                Tel=girilen.next();
                p("Adresi giriniz:");
                adres=girilen.next();
                p("Anne adı giriniz:");
                AnneAdi=girilen.next();
                p("Baba adı giriniz:");
                BabaAdi=girilen.next();
                p("Dogum yili giriniz :");
                DogumYılı=girilen.next();
                p("Dogum yeri giriniz:");
                DogumYeri=girilen.next();
                
                  Bilg_Ögr ogr= new Bilg_Ögr(TC,adi, soyadi,Bölüm, AnneAdi, BabaAdi,email,adres,Tel,DogumYılı,DogumYeri,cepTel);
              
                try {
                  
                    
                    File dosya = new File("ögrenciler.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr.TC+" "+ogr.adi+ " "+ogr.soyadi +" "+"Bilgisayar Mühendisliği"  +" "+ogr.BabaAdi+ " "+ogr.AnneAdi +" "+ogr.DogumYeri+" "+ ogr.DogumYılı+ " "+ogr.Tel+ " "
                            +ogr.email+ " " +ogr.adres+" "+ogr.cepTel);
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
                  
                    
                    File dosya = new File("ögrencilistesi.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr.TC+" "+ogr.adi+" \n ");
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
                  
                    
                    File dosya = new File("bilgisayarögrenci.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr.TC+" "+ogr.adi+ " "+ogr.soyadi +" "  +" "+ogr.BabaAdi+ " "+ogr.AnneAdi +" "+ogr.DogumYeri+" "+ ogr.DogumYılı+ " "+ogr.Tel+ " "
                            +ogr.email+ " " +ogr.adres+" "+ogr.cepTel);
                    yaz.write("\n");
                    yaz.close();
                
                }   
                catch (FileNotFoundException ex) {
                    System.out.println("Dosya Yok!");
                } 
                catch (IOException ex) {
                    System.out.println("Hata!");
                }
                
                
break;
    
                case 2 :
                    
    p("Tc'nizi tekrar giriniz.");
                    TC=girilen.next();
     
 String h= String.valueOf(TC);   

 ArrayList<String> list15 = new ArrayList<>();
 try{
 File f = new File("elektrikögrenci.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(h)){
 continue;
 }
 else{list15.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("elektrikögrenci.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list15){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
        
     
                p("Bilgilerini tekrar giriniz.");
            p("İsim giriniz:");
                adi=girilen.next();
                p("Soyisim giriniz:");
                soyadi=girilen.next();
                p("Telefon giriniz:");
                cepTel=girilen.next();
                p("Mail adresi giriniz:");
                email=girilen.next();
                p("Ev telefonu giriniz:");
                Tel=girilen.next();
                p("Adresi giriniz:");
                adres=girilen.next();
                p("Anne adı giriniz:");
                AnneAdi=girilen.next();
                p("Baba adı giriniz:");
                BabaAdi=girilen.next();
                p("Dogum yili giriniz :");
                DogumYılı=girilen.next();
                p("Dogum yeri giriniz:");
                DogumYeri=girilen.next();
                       
          Eem_Ögr ogr2= new Eem_Ögr(TC,adi, soyadi,Bölüm, AnneAdi, BabaAdi,email,adres,Tel,DogumYılı,DogumYeri,cepTel);
              
                try {
                  
                    
                    File dosya = new File("ögrenciler.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr2.TC+" "+ogr2.adi+ " "+ogr2.soyadi +" "+" Elektrik Elektronik Mühendisligi " +" "+ogr2.BabaAdi+ " "+ogr2.AnneAdi +" "+ogr2.DogumYeri+" "+ ogr2.DogumYılı+ " "+ogr2.Tel+ " "
                            +ogr2.email+ " " +ogr2.adres+" "+ogr2.cepTel);
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
                  
                    
                    File dosya = new File("ögrencilistesi.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr2.TC+ " "+ogr2.adi+" \n ");
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
                  
                    
                    File dosya = new File("elektrikögrenci.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr2.TC+" "+ogr2.adi+ " "+ogr2.soyadi +" " +" "+ogr2.BabaAdi+ " "+ogr2.AnneAdi +" "+ogr2.DogumYeri+" "+ ogr2.DogumYılı+ " "+ogr2.Tel+ " "
                            +ogr2.email+ " " +ogr2.adres+" "+ogr2.cepTel);
                    yaz.write("\n");
                    yaz.close();
                
                }   
                catch (FileNotFoundException ex) {
                    System.out.println("Dosya Yok!");
                } 
                catch (IOException ex) {
                    System.out.println("Hata!");
                }
    

    
 break;
 
 
                case 3 :   
                    p("Tc'nizi tekrar giriniz.");
                    TC=girilen.next();
     
 String c= String.valueOf(TC);   
     
 ArrayList<String> list14 = new ArrayList<>();
 try{
 File f = new File("makinaögrenci.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(c)){
 continue;
 }
 else{list14.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("makinaögrenci.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list14){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
  
             
        
                
                p("Bilgilerini tekrar giriniz.");
            p("İsim giriniz:");
                adi=girilen.next();
                p("Soyisim giriniz:");
                soyadi=girilen.next();
                p("Telefon giriniz:");
                cepTel=girilen.next();
                p("Mail adresi giriniz:");
                email=girilen.next();
                p("Ev telefonu giriniz:");
                Tel=girilen.next();
                p("Adresi giriniz:");
                adres=girilen.next();
                p("Anne adı giriniz:");
                AnneAdi=girilen.next();
                p("Baba adı giriniz:");
                BabaAdi=girilen.next();
                p("Dogum yili giriniz :");
                DogumYılı=girilen.next();
                p("Dogum yeri giriniz:");
                DogumYeri=girilen.next();
   Makina_Ögr ogr3= new Makina_Ögr(TC,adi, soyadi,Bölüm, AnneAdi, BabaAdi,email,adres,Tel,DogumYılı,DogumYeri,cepTel);
              
                try {
                  
                    
                    File dosya = new File("ögrenciler.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr3.TC+" "+ogr3.adi+ " "+ogr3.soyadi +" "+" Makina Mühendisligi"  +" "+ogr3.BabaAdi+ " "+ogr3.AnneAdi +" "+ogr3.DogumYeri+" "+ ogr3.DogumYılı+ " "+ogr3.Tel+ " "
                            +ogr3.email+ " " +ogr3.adres+" "+ogr3.cepTel);
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
                  
                    
                    File dosya = new File("ögrencilistesi.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr3.TC+" "+ogr3.adi+" \n ");
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
                  
                    
                    File dosya = new File("makinaögrenci.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr3.TC+" "+ogr3.adi+ " "+ogr3.soyadi +" " +" "+ogr3.BabaAdi+ " "+ogr3.AnneAdi +" "+ogr3.DogumYeri+" "+ ogr3.DogumYılı+ " "+ogr3.Tel+ " "
                            +ogr3.email+ " " +ogr3.adres+" "+ogr3.cepTel);
                    yaz.write("\n");
                    yaz.close();
                
                }   
                catch (FileNotFoundException ex) {
                    System.out.println("Dosya Yok!");
                } 
                catch (IOException ex) {
                    System.out.println("Hata!");
                }
    
        
 
  break;
 
 
    
    }}
    
      public void sifreolustur ()  throws IOException {
     int sifre;

 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File("ögrencilistesi.txt");
 FileReader fileReader = new FileReader(f);
 
 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((adi = br.readLine()) != null) {
p(adi+" isimli ogrencinin sifresini giriniz");
 sifre=girilen.nextInt();
 list.add(adi+" "+sifre);
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("Ögrencisifresi.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
}


}


