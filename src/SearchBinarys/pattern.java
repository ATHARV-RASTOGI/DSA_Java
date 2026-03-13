package SearchBinarys;

class pattern {
    public static void main(String[] args) {

        // SOLID REC

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 

        // HOLLOW REC
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         if (i==1||j==1||i==4||j==5) {
        //             System.out.print("*");  
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }
        // int n=4;
        //  for (int i = 0; i <=n; i++) {

        //     for (int l =1; l<=n-i; l++) {

        //         System.out.print(" ");
        //     }
        //     for (int j= 0; j<=i ;j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
             
        //  }

        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j); 
        //     }
        //     System.out.println();

        // }

        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        int n=50;
            // for (int i =1;i<=n; i++){
                
            //     for (int j=1;j<=n-i;j++) {
            //         System.out.print(" ");
            //     }

            //     for(int j=1;j<=i;j++){
            //         System.out.print(i+" ");
            //     }
            //     System.out.println();
            // }

            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=n-i;j++){
            //         System.out.print(" ");
            //     }
            //     //First half
            //     for(int j=i;j>=1;j--){
            //         System.out.print(j);
            //     }
            //     //Second  Half
            //     for(int j=2 ;j<=i;j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

            //Upper Part
            for(int i=1;i<=n;i++){

                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }

                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                 System.out.println();
            }
            //Lower Part
                 for(int i=n;i>=1;i--){

                 for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }

                 for(int j=1; j<=2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
        } 
    }
}
           
            


