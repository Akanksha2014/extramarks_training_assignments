import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            ArrayList<Integer> ar1 = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                ar1.add(in.nextInt());
            }
            
            ar.add(ar1);
        }
        
        int q = in.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            
            try {
                System.out.println(ar.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}