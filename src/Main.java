import  java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number= 9876;
        int bas = number;
        int step ;
        int total =0;
        
       // System.out.println("Sayi giriniz : ");
        //number = input.nextInt();
        
        while (bas > 0){
            step =bas%10;
            total +=step;
            bas/=10;
        }
        System.out.print( "Toplam : "+ total);

    }
}