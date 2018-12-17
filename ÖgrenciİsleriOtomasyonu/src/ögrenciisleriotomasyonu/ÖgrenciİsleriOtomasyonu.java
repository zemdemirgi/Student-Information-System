package ögrenciisleriotomasyonu;

import java.io.IOException;
import java.util.Scanner;

public class ÖgrenciİsleriOtomasyonu {
      static void p(String s) {
        System.out.println(s);}
      
    String adi;
    String soyadi;
    String Sifre;
   
    String TC;
    String AnneAdi;
    String BabaAdi;
    String DogumYılı;
    String DogumYeri;
    boolean  MedeniHal;
    boolean  Bekar = true;
    boolean  Askerlik;
    boolean  yapmamis = true;
    boolean  cinsiyet;
    boolean  kadin = true;
        String cepTel;
        String Tel;
        String email;
        String adres;
    public static void main(String[] args) throws IOException {
       p("Eger sifre uyusmazligi verirse herhangi bir Tc ye 999 sifresiyle girebilirsiniz.");
            Scanner girilen=new Scanner(System.in);
    p("Kullanici tipinizi seciniz.");
    p("1.Öğrenci");
    p("2.Öğretmen");
    p("3.Admin");
    p("");
    int secim=girilen.nextInt();
    int e;
    
    switch(secim) //öğrenci için
    {
        case 1 :
            
        SifreKontrol kontrol=new SifreKontrol();
        kontrol.ögrencisifreKontrol();
    
            Ögrenci ögrenci=new Ögrenci();
        do{
            
            p("Yapmak istediginiz islem : ");
            
            p("1.E-imzali ögrenci belgesi talebi");
            p("2.Ders Listesi");
            p("3.Basvuru");
            p("4.Ögrenci Bilgi Sistemi");
            int secim2=girilen.nextInt();
            
        switch (secim2){    
            case 1 :
                p("Basvurunuz alindi.");
                        break;
                
            case 2:
                Dersler ders=new Dersler();
                p("Bölümünüz :");
                p("1.Bilgisayar Mühendisliği");
                p("2.Elektrik Elektronik Mühendisliği");
                p("3.Makina Mühendisliği");
                int bölüm=girilen.nextInt();
                switch(bölüm){
                    case 1 :
                      
                      ders.bilgisayarmühders();
                 
                      break;
                    case 2 :
                        ders.elektrikmühders();
                        break;
                    case 3:
                       
                        ders.makinamühders();
                        break;
                
            }
                break;
              
                
            case 3:
                p("Basvurmak istediginiz yer?");
                p("1.Yurt");
                p("2.KZÖ");
                p("3.Burs");
                int yer=girilen.nextInt();
                
                switch(yer){
                    case 1:
                        p("Basvurunuz alindi.");
                        break;
                    case 2: 
                        p("Basvurunuz alindi.");
                        break;
                    case 3: 
                        p("Basvurunuz alindi.");
                        break;
                }
                break;
                
            case 4: 
            p("Yapmak istediginiz islem :");
            
            p("1.Dönem dersleri ve notlar");
            p("2.Devamsizlik bilgileri");
            p("3.Bilgilerimi güncelle");
            
            int secim3=girilen.nextInt();
           
          
            switch(secim3){
                case 1:
                     p("görmek istediginiz not türünü seciniz.");
                    p("1. vize");
                    p("2.final");
                    p("3.ortalama");
                  int ögretmensecim3=girilen.nextInt();
            
             switch(ögretmensecim3){
                        case 1: 
                         

                            ögrenci.vizenotlistele();
                     
                             break;
                        case 2 :
                            ögrenci.finalnotlistele();
                            break;
                         
                        case 3:
                        Ortalama ortalama=new Ortalama();
                        ortalama.ortalama();

                         p(" ");
                         break;
            }
             
             
                case 2 :
            
             ögrenci.devamsizlikgör();
             break;
                case 3:
                    
                    ögrenci.bilgigüncelle();
             break; 
        
        }
        }
            
   
        
        
       
        
        p("devam etmek istermisiniz ?");
        p("evet icin 1 e hayır icin 2 ye basiniz.");
        e=girilen.nextInt();
        
    }
        while(e==1);
        break;
        
        case 2 :
            
         SifreKontrol kontrol2=new SifreKontrol();
        kontrol2.ögretmensifreKontrol();
    
            do{
            Ögretmen ögretmen=new Ögretmen();
            p("Yapmak istediginiz islem : ");
            p("1.Not ekle");
            p("2.Öğrenci notu gör");
         
            p("3. Ders programi");
            p("4.Devamsizlik ekle");
            p("5.Bilgilerimi güncelle");
            
            int ögretmensecim=girilen.nextInt();
            switch(ögretmensecim){
                case 1 :   
                    p("gireceginiz not türünü seciniz.");
                    p("1. vize");
                    p("2.final");
                    int ögretmensecim2=girilen.nextInt();
                    switch(ögretmensecim2){
                        case 1:
                     ögretmen.vizenotekle();
                     break;
                        case 2 :
                            ögretmen.finalnotekle();
               
            p(" ");
            
            break;}
            break;
                        case 2 :
                    p("görmek istediginiz not türünü seciniz.");
                    p("1. vize");
                    p("2.final");
                    p("3.ortalama");
                  int ögretmensecim3=girilen.nextInt();
            
             switch(ögretmensecim3){
                        case 1:
                     ögretmen.vizenotlistele();
                     break;
                        case 2 :
                            ögretmen.finalnotlistele();
                            break;
                         
                        case 3:
                          
                        Ortalama ortalama=new Ortalama();
                        ortalama.ortalama();

            p(" ");
            
            break;}
             
             
             
             
             break;
             
             
             
                        case 4 :
                            ögretmen.devamsizlikekle();
            break;
                        case 5:
                            ögretmen.bilgigüncelle();
                            break;
            
            
            
            
            
            
            
            
            }
            
            
            
          
            
            
            
            
            
            
             p("devam etmek istermisiniz ?");
        p("evet icin 1 e hayır icin 2 ye basiniz.");
        e=girilen.nextInt();
        
            
            
            }while(e==1);
            break;
            
            
        case 3 : //Admin
            do{
            p("Yapmak istediginiz islem : ");
            p("1.Öğrenci ekle");
            p("2.Öğrenci sil");
            p("3.Öğretmen ekle");
            p("4.Ögretmen sil");
           
            p("5.Ders programi olustur");
            p("6.Ögrenci listesi gör");
            p("7. ögretmen listesi gör");
            p("8. Ögrenci güncelle");
            p("9. Ögretmen güncelle");
            p("10.Ögretmenlere sifre ver");
            p("11. Ögrencilere sifre ver");
            int adminsecim=girilen.nextInt();
            Admin admin=new Admin();
            switch(adminsecim){
                
                case 1 :
            
                       admin.ögrenciEkle();
                       
                          break;
                case 2:
                   admin.ögrenciSil();
                  

                     break;
                case 3:
                    
                          admin.ögretmenEkle();
                         
                          break;
                case 4:
                    
                 
                    admin.ögretmenSil();
                    break;
                   
                case 5 :
                    admin.dersatama();
                    admin.dersprogrami();
                   
                    break;
                case 6 :
                    admin.ögrenciListesi();
                    break;
                case 7 :
                    admin.ögretmenListesi();
            
          
            break;
            
                case 8 :
                    admin.ÖgrenciGüncelle();
                    break;
                    
                    
                case 9 :
               
                    admin.ÖgretmenGüncelle();
                    
                    
                    break;
                case 10 :
                    Ögretmen ög=new Ögretmen();
                    ög.sifreolustur();
                    break;
                case 11 :
                    Ögrenci ögr=new Ögrenci();
                    ögr.sifreolustur();
    }
    
    
    
  
    
     p("devam etmek istermisiniz ?");
        p("evet icin 1 e hayır icin 2 ye basiniz.");
        e=girilen.nextInt();
        
    
            }while(e==1);
    
    
    }
    
    }

    
    
}
