import java.util.Scanner;
public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  solid square
        //  * * * * * 
        //  * * * * * 
        //  * * * * * 
        //  * * * * * 
        //  * * * * * 
        for(int i = 0;i < 5;i++){                   
            for(int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //  right angle triangle
        //  * 
        //  * * 
        //  * * * 
        //  * * * *
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // for looking good

        //  solid rectangle
        //  * * * * * * 
        //  * * * * * * 
        //  * * * * * * 
        for(int i=0;i<3;i++){
            for(int j=0;j<6;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // for looking good

            //   Rohmbus
            //                * * * * * * 
            //              * * * * * * 
            //            * * * * * * 
            //          * * * * * * 
            //        * * * * * * 
            //      * * * * * * 

        for(int i=0;i<6;i++){
            //spaces logic
            for(int j=0;j<6-i;j++){
                System.out.print("  ");
            }

            //start logic
            for(int k=0;k<6;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // for looking good

        //  reverse right angle triangle
        //  * * * * * * 
        //  * * * * * 
        //  * * * * 
        //  * * * 
        //  * * 
        //  * 
        for(int i=0;i<6;i++){
            for(int j=1;j<6-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // for looking good

        //  pyramid
        //          * 
        //        * * * 
        //      * * * * * 
        //    * * * * * * * 
        //  * * * * * * * * * 

        for(int i=0;i<6;i++){
            // space
            for(int j=0;j<6-i;j++){
                System.out.print("  ");
            }

            // stars
            for(int k=0;k<2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // for looking good

            //  reverse pyramid
            //  * * * * * * * 
            //    * * * * * 
            //      * * * 
            //        * 

        for (int i = 0; i < 4; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int k = 0; k < (2 * (4 - i) - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // for looking good

        //      hollow rectangle
        //      * * * * * * * * * * 
        //      *                 * 
        //      *                 * 
        //      *                 * 
        //      * * * * * * * * * *
        for(int i=1;i<=5;i++){
            for(int j=1;j<=10;j++){
                if(i==1 || i==5 || j==1 || j==10){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println(); // for looking good

        
        sc.close();
    }
}