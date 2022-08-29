import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner(System.in);
        int total = 0, piece = 0;
        double average;
        System.out.println("Bir sayı giriniz: ");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i%4==0 && i%3 ==0){
                piece++;
                total += i;
            }
        }
        average = total/(piece-1);
        System.out.println(k + "'e kadar 3'e ve 4'e tam bölünen sayıların ortalaması:" + average);
    }
}
