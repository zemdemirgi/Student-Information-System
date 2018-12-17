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
import java.util.Random;
import java.util.Scanner;


public class Admin extends Kullanici {
        static void p(String s) {
        System.out.println(s);}
        Scanner girilen=new Scanner(System.in);
       Random random = new Random();
       
     public void ögrencidosyaAc(){
        try{
            PrintWriter ögrencidosya = new PrintWriter("ögrenciler.txt");
        }
        catch(FileNotFoundException istisna){
            System.err.println("Dosya olusturulamadi.");
             System.exit(1);
        }
       
    } 
     
    public void ögrenciEkle(){
           
             
            try{
                    FileInputStream fi=new FileInputStream("ögrenciler.txt");
                    BufferedReader buf=new BufferedReader(new InputStreamReader(fi));
                }
                catch(FileNotFoundException f)
                    {System.out.println("Dosya yok,Olusturuluyor!");
                     }
                catch(IOException ioex)
                    {System.out.println("Başka bir hata oldu!"); }
            
              
                 p("Tc gir :");
                TC = girilen.nextLine();
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
                
                p("Bölümü :");
              
                p("1.Bilgisayar Mühendisligi");
               
                p("2.Elektrik-Elektronik Mühendisligi");
                p("3.Makina Mühendisligi");
                
                int secim=girilen.nextInt();
                
                switch(secim)
                {
                    case 1 ://bilgisayar
                       
                        
                        Bilg_Ögr ogr= new Bilg_Ögr(TC,adi, soyadi,Bölüm, AnneAdi, BabaAdi,email,adres,Tel,DogumYılı,DogumYeri,cepTel);
               
              
  
                try {
                    File dosya = new File("ögrenciler.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr.TC+" "+ogr.adi+ " "+ogr.soyadi +" "+"Bilgisayar Mühendisliği"  +" "+ogr.BabaAdi+ " "+ogr.AnneAdi +" "+ogr.DogumYeri+" "+ ogr.DogumYılı+ " "+ogr.Tel+ " "
                            +ogr.email+ " " +ogr.adres+" "+ogr.cepTel+ogr.MedeniHal);
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
                  
                    
                    File dosya = new File("TCler.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr.TC+" "+ogr.adi+" \n ");
                    
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
                
    
    
                
                
     
    
    case 2:   
                
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
                  
                    
                    File dosya = new File("TCler.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr2.TC+" \n ");
                    
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
    
     
    case 3 : 
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
                  
                    
                    File dosya = new File("TCler.txt");
                    FileWriter yazici = new FileWriter(dosya,true);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    yaz.write(ogr3.TC+" \n ");
                    
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

        
    }
    
    }
    
    public void ögrenciListesi() throws IOException{
         File dosya = new File("ögrencilistesi.txt");
         FileReader fileReader = new FileReader(dosya);
         String line;

            try (BufferedReader br = new BufferedReader(fileReader)) {
                while ((line = br.readLine()) != null) {
                    
                    p(line);
                    p("\n");
                }           }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void ögrenciSil(){ 
         p("Silmek istediginiz ögrencinin tc'si :");
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
 p("Silmek istediginiz ögrencinin tc'sini tekrar giriniz :");
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
break;
    
                case 2 :
                  p("Silmek istediginiz ögrencinin tc'sini tekrar giriniz :");
                    TC=girilen.next();
     
 String c= String.valueOf(TC);   
 ArrayList<String> list6 = new ArrayList<>();
 try{
 File f = new File("elektrikögrenci.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(c)){
 continue;
 }
 else{list6.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("elektrikögrenci.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list6){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
    
    
 break;
 
 
                case 3 :
 p("Silmek istediginiz ögrencinin tc'sini tekrar giriniz :");
                    TC=girilen.next();
     
     
 String h= String.valueOf(TC);
 ArrayList<String> list7 = new ArrayList<>();
 try{
 File f = new File("makinaögrenci.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(h)){
 continue;
 }
 else{list7.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("makinaögrenci.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list7){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
  break;
 
 
    
    }
    
    
    
    
    }
    
    
    
    
    
    

    
     public void ögretmendosyaAc(){
        try{
            PrintWriter ögretmendosya = new PrintWriter("ögretmenler.txt");
        }
        catch(FileNotFoundException istisna){
            System.err.println("Dosya olusturulamadi.");
             System.exit(1);
        }
       
    }
    
    
    
    
    
    
    
    
    
    
    public void ögretmenEkle(){
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
                    
                    yaz.write(ogret.TC +" "+ogret.adi+" ");
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
    
      public void ögretmenListesi() throws IOException{
         File dosya = new File("ögretmenlistesi.txt");
         FileReader fileReader = new FileReader(dosya);
         String line;

            try (BufferedReader br = new BufferedReader(fileReader)) {
                while ((line = br.readLine()) != null) {
                    
                    p(line);
                    p("\n");
                }           }
    }
    
      
      
    
    public void ögretmenSil(){
  p("Silmek istediginiz ögretmenin tc'si :");
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
 }
        
    
    
    
    
    
  
    public void dersatama(){
       
 String ders;
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File("ögretmenlistesi.txt");
 FileReader fileReader = new FileReader(f);
 String TC;
 Scanner d=new Scanner(System.in);
 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((TC = br.readLine()) != null) {
 System.out.println(TC+"isimli ogretim uyesinin verdigi dersi giriniz:");
 ders=d.nextLine();
 list.add(TC+" "+ders);
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("dersler.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 } 

    
    

public void dersprogrami(){
 String dersgünleri,saat;
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File("dersler.txt");
 FileReader fileReader = new FileReader(f);

 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((adi = br.readLine()) != null) {
 p(adi+" dersi=ogetim üyesinin ders verdigi gün :");
 dersgünleri=girilen.nextLine();
 p("Ders saat aralıgi :");
 saat=girilen.nextLine();
  
 list.add(adi+" "+dersgünleri+" "+ saat);

 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File("dersprogrami.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 } 

public void ÖgretmenGüncelle(){
   p("Güncellemek istediginiz ögretmenin tc'si :");
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
 
        
    
 
 
 
 ögretmenEkle();
 
 
 
 }



 
 

    
    
    
 
 
 
 

public void ÖgrenciGüncelle(){

     
     p("Güncellemek istediginiz ögrencinin tc'si :");
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
  p("Güncellemek istediginiz ögrencinin Tcsini tekrar giriniz.");
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
                    
    p("Güncellemek istediginiz ögrencinin Tcsini tekrar giriniz.");
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
                    p("Güncellemek istediginiz ögrencinin Tcsini tekrar giriniz.");
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
 
 
    
    }
                
   

    
    }
    
    
   
        
     
     
     
       
        
      }  
            
            
            
            
            
        
        
        
    


