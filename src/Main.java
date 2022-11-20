import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("Yıl Girin: ");
        int yil= klavye.nextInt();

        if (yil%4==0 && yil%100!=0){
            System.out.println(yil+" artık yıldır.");
        }
        else if (yil %400==0){
            System.out.println(yil+" artık yıldır.");

        }
        else
            System.out.println(yil+" artık yıl değildir.");



    }

}