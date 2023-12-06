
public class Nr1n3 {
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        String n_String = "";
        for (int i = charArray.length - 1; i >= 0; i--)
            n_String += charArray[i];

        return n_String;
    }
    
    public static boolean isArmstrong(int num) {
        if (num < 0)
            return false;

        int newNum = 0;
        int dummy = num;
        int lengthNum = String.valueOf(num).length();
        System.out.println(lengthNum);
        for (int i = 0; i < lengthNum; i++) {
            newNum += Math.pow(dummy % 10, lengthNum);
            System.out.println(newNum);
            dummy = dummy / 10;
        }

        if (newNum == num)
            return true;
        return false;
    }
    
    public static int arrayer(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++) 
                if ((arr.length / 2 < i) && ( arr.length < i+j))
                    sum += arr[i][j];
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Buna"));
        if ("Ana".equals(reverseString("Ana")))
            System.out.println("Is palindrome");
        
        System.out.println(isArmstrong(548834));
    }
}
