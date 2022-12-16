package Tree;
import java.util.HashMap;
public class uniqueBSTs {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(uniquesearchTrees(n));
    }
    public static int uniquesearchTrees(int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        map.put(1,1);
        return helper(n,map);
    }
    public static int helper(int n, HashMap<Integer,Integer> map){
        if(map.containsKey(n)){
          return map.get(n);
        }
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += helper(i-1,map) * helper(n-i,map);
            map.put(n,sum);
        }
        return sum;
    }
}
