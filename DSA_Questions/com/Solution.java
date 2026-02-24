package DSA_Questions.com;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        int rowmin=matrix[0][0];
        int colmax=matrix[0][0];

        List<Integer> ans = new ArrayList<>();
        Set <Integer> min = new HashSet<>();
        Set <Integer> max = new HashSet<>();

        for(int i=0; i<matrix.length;i++){
            rowmin = matrix[i][0];
            for(int j=0; j<matrix[i].length ;j++){
                rowmin = Math.min(rowmin, matrix[i][j]);
                
            }
          min.add(rowmin);
        }

        for(int j=0;j<matrix[0].length;j++){
            colmax=matrix[0][j];
            for(int i=0 ; i<matrix.length; i++){
                colmax = Math.max(colmax, matrix[i][j]);
            }
            max.add(colmax);
        }
        min.retainAll(max);
        ans.addAll(min);

        return ans;
    }
}