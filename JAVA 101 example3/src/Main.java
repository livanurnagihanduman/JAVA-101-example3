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



        }


    }