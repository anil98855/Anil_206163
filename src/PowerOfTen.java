public class PowerOfTen {


        public static boolean isPowerOfTen(int num) {
            if (num <=0)
            {
                return false;
            }else
                while (num % 10 == 0) {
                    num =num/ 10;
                }

            return num==1;
        }

        public static void main(String[] args) {
            System.out.println(isPowerOfTen(1));     // true (10^0)
            System.out.println(isPowerOfTen(10));    // true (10^1)
            System.out.println(isPowerOfTen(1000));  // true (10^3)
            System.out.println(isPowerOfTen(250));   // false
            System.out.println(isPowerOfTen(0));     // false
        }
    }

