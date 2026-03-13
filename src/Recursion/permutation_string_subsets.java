package strings.coms;
import java.util.ArrayList;

public class permutation_string_subsets {
    public static void main(String[] args) {
        // permutation("", "abc");
        // ArrayList<String> ans= array_permutation("", "abc");
        // System.out.println(ans);
        System.out.println(permutation_count("", "abcd"));
    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }

    }

    static ArrayList<String> array_permutation(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

         ArrayList<String> ans=new ArrayList<>(); 

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(array_permutation(f+ch+s, up.substring(1)));
        }
        return ans;
    }


     static int permutation_count(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int c=0;
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            c=c+permutation_count(f+ch+s,up.substring(1));
        }
        return c;
    }
}
