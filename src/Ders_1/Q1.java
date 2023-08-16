package Ders_1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    /*
       Girilen desimal degeri binary degere ceviren methodu olusturunuz.
       Örnek: 12 = 1 1 0 0
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desimal degeri giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println(sayi + " desimal sayisinin binary karsiligi : " + binaryConvert(sayi));
    }

    public static List<Integer> binaryConvert(int sayi) {
        List<Integer> binary=new ArrayList<>();
        while (sayi>0){
            binary.add(sayi%2);
            sayi/=2;

        }

        List<Integer> tersBinary=new ArrayList<>();
        for (int i = binary.size()-1; i >= 0; i--) {
            tersBinary.add(binary.get(i));

        }
       //  Collection.reverse(binary); **** bu soru bu sekildede cozulebilir.
        return binary;


    }

}




