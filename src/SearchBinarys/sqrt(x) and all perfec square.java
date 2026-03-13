class Solution {
    public int mySqrt(int x) {
        int L=1;
        int R=x;

        while (L<= R){
            int M =L+(R-L)/2;
            long M_sqr=(long)M*M;
            if (M_sqr==x){
                 return M;
            }
               
            else if(M_sqr<x){
                L=M+1;
            }else{
                R=M-1;
            }

        }
        return R;
    }
}