import java.sql.SQLOutput;
import java.util.Scanner;
public class PalindronSayi {

    static  boolean isPalindron(int number){
        int temp = number, reverseNumber = 0 , lastNumber;
        while(temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10)+lastNumber;
            temp /=10;
        }
        if(number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int sayi;
        Scanner ipt = new Scanner(System.in);
        System.out.print(" Bir Sayi Giriniz : ");
        sayi = ipt.nextInt();

        if(isPalindron(sayi)==true){
            System.out.println(sayi+" Palindrondur.");
        }else{
            System.out.println(sayi+" Palindron değildir.");
        }



    }
}
