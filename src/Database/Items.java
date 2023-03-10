package Database;

public class Items {

    /*

        Item class ını bir veritabanı olarak düşünebiliriz fakat burada bir static method kullanmak yerine satın alınmak
    istenen ürüne göre işlem yapacağız. Örneğin satın alınmak istenen ürün bir telefon ise bize o telefon için bir ücret
    döndürecek ve bu ücreti user in bakiyesine ekliyeceğiz.

     */

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "ItemName" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir itemName almalı

        Eğer ki itemName:
            "Rose teddy bear" ise 30,
            "Iphone max" ise 850.23,
            "laptop mouse" ise 23.50,
            "Monitor" ise 90.23,
            "charger" ise 43.20,
            "hdmi cable" ise 5.90,
            "mug" ise 30
        değerlerini döndürmeli

     */

    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------
public static double ItemName(String itemName ){
    double deger=0;
    switch (itemName.toLowerCase()){
        case "rose teddy bear" : deger=30;
        break;
        case  "ıphone max" : deger=850.23;
        break;
        case "laptop mouse": deger =23.50;
        break;
        case "monitor" : deger= 90.23;
        break;
        case "charger" : deger=43.20;
        break;
        case "hdmi cable" : deger = 5.90;
        break;
        case "mug" : deger = 30;
        break;

    }

    return deger;



}
    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "colorPrice" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir color almalı

        Eğer ki color:
            "Red" ise 10,
            "Blue" ise 6,
            "Black" ise 4,
            "White" ise 2
        değerlerini döndürmeli

     */

    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------
    public static double colorPrice(String color ){
        double deger=0;
        switch (color.toLowerCase()) {
            case "red":
                deger = 10;
                break;
            case "blue":
                deger = 6;
                break;
            case "black":
                deger = 4;
                break;
            case "white":
                deger = 2;
                break;
        }
        return deger;
    }
    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "customText" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir text almalı

        Eğer ki text:
            10 karakterden uzun ise 5,
            10 karakterden kısa veya eşit ise 3
        değerlerini döndürmeli

     */

    // Method buraya yazılacak
    public static double customText(String text ){
        double deger=0;
        if (text.length()>10)
            deger =5;
        else {
            deger= 3;

        }
        return deger;
    }

    //---------------------------------------------------------------------------------------



}



