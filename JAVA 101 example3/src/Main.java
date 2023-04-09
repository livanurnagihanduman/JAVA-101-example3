import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //WHİLE DÖNGÜ YAPILARI

        int a = 1;
        int b;
        System.out.println("Program Başladı.");
        while(a <= 5){
            System.out.println(a);
            a++;
            b = 1;
            while(b <= 10){
                System.out.println(b +  ",");
                b++;
            }
            System.out.println("\n");
        }
        System.out.println("Program Bitti.");

        // example

        Scanner input = new Scanner(System.in);
        int passWord;
        boolean isPassWord = false;

        while(!isPassWord){
            System.out.println("Şifre Giriniz: ");
            passWord = input.nextInt();
            if(passWord == 2727){
                System.out.println("True");
                isPassWord = true;
            }else{
                System.out.println("False");
            }

        }

        // example

        for(a=1;a<=5;a++){//durum1:verilen değerin nerden başlandığını belirtir.durum2:verilen değerin nereye kadar olduğunu belirtir.
            //durum3:verilen değerin nasıl ilerleyeceğini belirtir.
            System.out.println(a);
        }

        System.out.println("**************");
        int c = 1;
        while(c<=5){
            System.out.println(c);
            c++;
        }

        //Burda demek istenen 2 döngüde aynı görevi görür.Farkı: While döngüsünü sonunun nerde biteceğini kestiremediğimiz
        //zamanlarda kullanırız.

        //GİRİLEN SAYIYA KADAR ÇİFT SAYI BULAN PROGRAM

        int x;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        x = inp.nextInt();

        for(int i = 1 ; i<x ; i++ ){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

        //TEK SAYILARIN TOPLAMINI BULAN PROGRAM

        int w ;
        int total = 0;

        Scanner ınp = new Scanner(System.in);

        System.out.print("Sayı Gir:");
        w = ınp.nextInt();

        for (int z = 1 ; z<=w ; z+=2){
            if(z%2 == 1);
            System.out.println(z);
            total += z;
        }

        System.out.print("Toplam = " + total);



        //FAKTORİYEL HESAPLAMA

        System.out.println("\n");
        Scanner ın = new Scanner(System.in);
        int n ;
        int total1 = 1;

        System.out.print("Faktoriyel Sayısı Girin:");
        n = ın.nextInt();

        for(int i = 1 ; i<=n ; i++){
            total1 = total1 * i;
        }
        System.out.println("Faktoriyel = " + total1);

        //ÜSLÜ SAYI HESAPLAYAN PROGRAM

        System.out.println("\n");

        Scanner in = new Scanner(System.in);

        int a1;
        int b1;

        System.out.print("Üssü alınacak sayıyı girin:");
        a1 = in.nextInt();
        System.out.print("Üs olacak sayıyı girin:");
        b1 = in.nextInt();

        int total2 = 1;

        int i = 1;

        while(i<=b1){
            total2 *=  a1;
            i++;
        }
        System.out.println("Sonuç =  " + total2);





        //ARMSTONG SAYI BULAN PROGRAM

        System.out.println("\n");

        Scanner z = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = z.nextInt();

        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while(tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;

        while(tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;
            for(int i1 = 1 ; i1<= basNumber ; i1++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        if(number == result){
            System.out.println(number + " sayısı bir Armstrong'dur");
        }else{
            System.out.println(number + " sayısı bir Armstrong değildir.");
        }





        // HARMONİK SAYILARI BULAN PROGRAM

        Scanner q = new Scanner(System.in);
        System.out.print("Bir K sayısı giriniz: ");
        int k = q.nextInt();
        double result1 = 0.0;

        for(double s = 1; s<=k ; s++ ){
            result1 += 1/s;
        }
        System.out.print(result1);





        //EBOB EKOK BULAN PROGRAM

        Scanner keyboard = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("Lütfen n1 sayısı giriniz: ");
        n1 = keyboard.nextInt();

        System.out.print("Lütfen n2 sayısı giriniz: ");
        n2 = keyboard.nextInt();
        int ebob = 1;

        //EBOB

        for(int y = 1 ; y <= n1 ; y++){
            if((n1 % y == 0) && (n2 % y == 0)){
                System.out.println(y);
                ebob = y;
            }
        System.out.print("********************");
        System.out.print("\n");

        for(int m = n1; m>=1;m--){
            if((n1 % m == 0) && (n2 % m == 0)){
                System.out.println("Ebob = " + m);
                ebob = m;
                break;
                }
            }

        //EKOK

        System.out.print("**********");
            System.out.print("\n");



            for(int z1 = 1; z1<=(n1*n2); z1++){
            if((z1 % n1 == 0) && (z1 % n2 == 0)){
                System.out.println(z1);
                break;
            }
        }
        System.out.println("Ekok = " + (n1 * n2)/ebob);
        }


        //MAN VE MİN SAYILARI BULAN PROGRAM

        Scanner key = new Scanner(System.in);
        System.out.print("\n");
        int ı;
        int sayi1;
        int sayi2;
        int sayi3;
        int sayi4;
        sayi1 = key.nextInt();
        sayi2 = key.nextInt();
        sayi3 = key.nextInt();
        sayi4 = key.nextInt();

        System.out.print("Kaç tane sayı gireceksiniz: ");
        ı = key.nextInt();


        for(int s = 1; s<=ı ; s++){
            if(ı == 4){
                System.out.println("1.sayıyı giriniz: " +
                                   "2.sayıyı giriniz: " +
                                   "3.sayıyı giriniz: " +
                                   "4.sayıyı giriniz: ");


                if((sayi1<sayi2)&&(sayi1<sayi3)&&(sayi1<sayi4)){
                    System.out.println(sayi1);
                }else{
                    System.out.println(sayi2);
                    System.out.println(sayi3);
                    System.out.println(sayi4);
                }


            }if((sayi2<sayi1)&&(sayi2<sayi3)&&(sayi2<sayi4)){
                System.out.println(sayi2);
                }else{
                    System.out.println(sayi1);
                    System.out.println(sayi3);
                    System.out.println(sayi4);
                }

                }if((sayi3<sayi1)&&(sayi3<sayi2)&&(sayi3<sayi4)){
                    System.out.println(sayi3);
                }else{
                     System.out.println(sayi1);
                     System.out.println(sayi2);
                     System.out.println(sayi4);
                }



        //MÜKEMMEL SAYI PROGRAMI

        Scanner key1 = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        int sayi = key1.nextInt();

        for(int ix = 1; ix < sayi ; i++){
            if(sayi % i == 0){
                toplam += i;
            }

        }if(sayi == toplam){
            System.out.println("Tebrikler Mükemmel Sayı!!!");
        }else{
            System.out.println("Üzgünüz Mükemmel Sayı Değil!!!");

        }



    }
}




