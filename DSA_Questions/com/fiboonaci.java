package DSA_Questions.com;
public class fiboonaci {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

    static int fibo(int n){

        if(n<2){
            return n;
        }
        return fibo(n-1) +fibo(n-2);
    }
}

// class Solution {
//     public int fib(int n) {
//         if(n==0) return 0;
//         if(n==1) return 1;
       
//         int a=0; int b=1;
        
//         for(int i=2; i<=n ; i++)
//         {
//             int next =a+b;
//             a=b;
//             b=next;
//         }
//          return b;
//     }
// }                                              