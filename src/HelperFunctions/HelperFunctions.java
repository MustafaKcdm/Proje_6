package HelperFunctions;

import Database.Address;

public class HelperFunctions {

    /*

        Proje kapsamında gerekli genel methodlari burada tanımlayacağız, buradaki methodlari birer doğrulayıcı yada
    oluşturucu olarak düşünebiliriz. Örneğin bir city nin varlığını doğrulama veya bir rastgele bir numara oluşturuma.

     */

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "checkCity" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir city almalı


        Eğer ki city:
            Address classinin icerisindeki static arrayliste bulunan bir city e eşit değilse
            bir RuntimeException firlatsin ve şu mesaji geçsin:
                "We can not continue your process because, there is no shipping that location."
        Eğer ki city:
            Arraylistin içerisinde var ise o zaman city i dondursun.

     */

    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------

    public static String checkCity(String city){

           boolean cityVarMi=false;
            try{
                if (Address.getCityList().contains(city))
                    cityVarMi=true;



            }catch (Exception hata){
                System.out.println("Hata:We can not continue your process because, there is no shipping that location. ");

            }
        return city;

           }
    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "generateShippingTrackingNumber" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir fullname, bir city, bir zipcode almalı

        Bu methodun amacı bir kargo takip numarasi üretmektir.

        kargo takip numarası şu şekilde oluşacak ve daha sonrada return olacaktır.

            city nin ilk 3 harfi + zipcode + fullname in baş harfleri

        son olarak ise dönen değer tamamen büyük harfde dönmelidir.

        örneğin bir takip kodu: IZM35430CK (Izmir + 35430 + Cem Karaca)

     */

    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------

    public static String generateShippingTrackingNumber(String fullanme, String city, String zipcode){
        String cityUcHarf = city.substring(0,3).toUpperCase();
        String isimKodu=null;
        int kelimeSayisi=1;
        int boslukIndex = fullanme.indexOf(" ") + 1;
        int ikinciBoslukIndex = fullanme.lastIndexOf(" ")+1;
        for (int i = 0; i < fullanme.length(); i++) {
            if (fullanme.charAt(i)==' '){
                kelimeSayisi++;
            }
        }
        if (kelimeSayisi==2){
            isimKodu=fullanme.toUpperCase().charAt(0)+fullanme.toUpperCase().substring(boslukIndex,boslukIndex+1);}
        else if(kelimeSayisi==3){
            isimKodu=fullanme.toUpperCase().charAt(0)+fullanme.toUpperCase().substring(boslukIndex,(boslukIndex+1))+
                    fullanme.toUpperCase().substring(ikinciBoslukIndex,(ikinciBoslukIndex+1));
        }
        return cityUcHarf+zipcode+isimKodu;


    }

    //---------------------------------------------------------------------------------------

    /*


        Bir method oluşturalım ve adına "checkZipCode" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir zipCode almalı

        Eğer ki zipCode:
            5 rakamdan oluşmuyorsa RuntimeException firlatmalı ve mesaj olarak ise "Please enter valid Zip Code"
            geçmeli
        diğer durumda ise zipCode unu döndürmeli
     */

    // Method buraya yazılacak

    public static String checkZipCode(String zipCode){
        boolean zipCodeLenght;
        try {
            if (zipCode.length()==5)
                zipCodeLenght=true;

        }catch (Exception hata){
            System.out.println("Hata: Please enter valid Zip Code");

        }
        return zipCode;

    }

    //---------------------------------------------------------------------------------------


}
