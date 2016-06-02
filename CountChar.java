import java.util.Scanner;

public class CountChar {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a String to found character : ");
        String take = userInput.next();

        System.out.print("Enter a character you want to found : ");
        char chara = userInput.next().charAt(0);

        int chrFound = 0, check;

        for (int i = 0, n = take.length(); i < n; i++) {
            check = data.charAt(i);
            if (check == chrFound) {
                chrFound++;
            }
        }
        
        
        System.out.println(chara + " is appears  "+ chrFound + " times ");
    }
}
