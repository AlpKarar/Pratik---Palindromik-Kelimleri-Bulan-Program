/* 
  Pratik - Palindromik Kelimleri Bulan Program
  
  Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
  Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
  Örnek : abba , asa , kavak, kayak
*/


import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String str;
        
        System.out.println("Please enter a string");
        str = input.nextLine();
        
        int len = str.length(), numOfLoop = (len + 1) / 2;
        int idxEnd;
        boolean isPldrm = true;
        
        for (int i=0; i<numOfLoop; i++) {
            idxEnd = len-1-i; 
            if (str.charAt(i) != str.charAt(idxEnd)) {
                System.out.println(str + " is NOT a palindrome string!");
                isPldrm = false;
            }
        }
        
        if (isPldrm) {
            System.out.println(str + " is a palindrome string!");
        }
 
    }
}
