public class Main {
    public static void main(String[] args) {



        // (a)

        int num = 5;

        for (int i = 1; i <= num; i++){
            for (int a = 1; a <= i; a++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //enter

        System.out.println();

        //enter

        // (b)

        int num2 = 5, b = 0;

        for (int i = 1; i <= num2; ++i, b = 0){
            for (int a = 1; a <= num2 - i; ++a){
                System.out.print(" ");
            }
            while (b != 2 * i - 1) {

                System.out.print("*");
                ++b;
            }
            System.out.println();

        }


        //enter

        System.out.println();

        //enter

        // (c)

        int num3 = 5;

        for(int i = num3; i >= 1; --i) {
            for(int d = 1; d <= num3 - i; ++d) {
                System.out.print(" ");
            }

            for(int s=i; s <= 2 * i - 1; ++s) {
                System.out.print("*");
            }

            for(int s = 0; s < i - 1; ++s) {
                System.out.print("*");
            }

            System.out.println();
        }


        //enter

        System.out.println();

       // enter

        // (d)


//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {
//            int j = 5 - i;
//                System.out.print(" " + j);
//
//            for(int x = 1; x<=i; x++) {
//                System.out.print(x+" ");
//            }
//            System.out.println();
//        }








    }
}


