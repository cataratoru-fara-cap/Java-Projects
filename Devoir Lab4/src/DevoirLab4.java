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

    public static double multiplyer(double[][] args){
        double product = 1;
        for(int i = 0; i < args.length; i++){
            for (int j = 0; j < args.length; j++){
                if ((args[i][j] % 2) == 0) {product *=  args[i][j];}
        }
    }
        System.out.println(product);
        return product;
    }

    
    public static void main(String[] args) {
        //caser(8);
        //double [][] table = inputer(2);
        //System.out.println(Arrays.deepToString(table));
        //multiplyer(map);
        }
    }