public class App {
    public static void swap(int i, int j) {

        int temp = i;
  
        i = j;
  
        j = temp;
  
     }
  
     public static void main(String[] args) {
  
        int i = 10;
  
        int j = 20;
  
        swap(i, j);
  
        System.out.println("i = " + i + ", j = " + j);
  
     }
}
