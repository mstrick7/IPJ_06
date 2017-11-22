// mostly copied and pasted from IPJ online resources.

public class Binary {
        public static void main(String[] args) {
            int n = 25;
            binaryRep(n);

        }

        public static void binaryRep(int n) {
            if (n>0) {
                binaryRep(n/2);
                System.out.print(n%2);
            }
        }

    }





