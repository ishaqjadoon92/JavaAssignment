public class NumToString {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num, one, two;
        
        String str1[] = {"","","Twenty", "Thirty", "Fourty", "Fifty", "Sixty",
            "Seventy", "Eighty", "Ninty"};
        String srt2[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen"};

        System.out.print("Enter Number between 1 - 99 : ");
        num = userInput.nextInt();
            
        if ((num <= 1) || (num >= 100)) {
            System.out.println("Wrong Input");
        } else if ((num >= 1) && (num <= 19)) {
             System.out.println(str2[num]);
        } else if ((num >= 20) && (num <= 99)) {
            one = num / 10;
            two = num % 10;
            System.out.println(str2[numberOne] + " " + str1[numberTwo]);
         }
        
        
    }
}
