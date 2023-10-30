import java.util.Arrays;
import java.util.Scanner;

public class DevoirLab4 {
    //ex1 example method
    public static void caser(int args){ 
        int val1 = 1;
        int val2 = 2;
        int val3 = 8;

        switch (args){

            case 1:
                System.out.println(val1 + "case was hit");
                break;
            case 2:
                System.out.println(val2 + "case was hit");
                break;

            case 8:
                System.out.println(val3 + "case was hit");
                break;
    
            default:
                System.out.println("no case was hit");
                break;
        }
    }
    //ex2 Inputer
    public static double[][] inputer(int N){
        double[][] table = new double[N][N];
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < N; i++){
                for (int j = 0; j < N; j++){
                    
                    System.out.print("Enter a rational number for line " + i + " column " + j + ": ");
                    table[i][j] = input.nextDouble(); 
                }
            }
        return table;
   }
}

    public static double multiplyEvenHalf(double[][] args){
        double product = 1;
        int modifiableLength = args.length;
        for(int i = 0; i < args.length; i++){
            for (int j = 0; j <= modifiableLength; j++){
                if (args[i][j] % 2 == 0) {
                    product *=  args[i][j];
                }
            modifiableLength--;
            }
        }
    return product;
    }

    public static double multiplyEvenFourth(double[][] args){
        double product = 1;
        int start = 0;
        for(int i = 0; i < args.length; i++){
            start++;
            for (int j = start; j <= args.length - start; j++){
                if (args[i][j] % 2 == 0) {
                    product *=  args[i][j];
                }
            if (start == args.length / 2) {break;}
            }
        }
    return product;
    }

    
    public static void main(String[] args) {
        //caser(8);
        double [][] table = inputer(3);
        //System.out.println(Arrays.deepToString(table));
        //double a = multiplyEvenHalf(table);
        //double b = multiplyEvenFourth(table);
        //System.out.println(a);
        //System.out.println(b);

        

    }
}