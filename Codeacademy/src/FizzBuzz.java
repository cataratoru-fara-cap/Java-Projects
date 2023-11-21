    class FizzBuzz{
        public static void fizzBuzz(int Fizz, int Buzz, int start, int end) {
         for (;start <= end; start++) {
          if ((start % Fizz == 0) && (start % Buzz == 0)) {
              System.out.println("FizzBuzz");
           } else if (start % Fizz == 0) {
              System.out.println("Fizz");
           } else if (start % Buzz == 0) {
              System.out.println("Buzz");
           } else {
              System.out.println(start);
           }
          }
         }
        public static void main (String[] args) {
          fizzBuzz(3, 5, 1, 100);
        }
    }   
