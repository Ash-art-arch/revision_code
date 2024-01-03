package revision_code;
import java.util.*;
public class leetcode213 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();

        
        backtrack(1,k,n,new ArrayList<>(),ans);


        return ans;
    }
    private static void backtrack(int start,int k, int n,List<Integer> current,List<List<Integer>> ans){
        if(n<0) return;
        if(current.size()==k){
            if(n==0){
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        for(int i=start;i<=9;i++){
            current.add(i);
            backtrack(i+1, k, n-i, current, ans);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> ans=combinationSum3(3,9);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
