import java.util.*;
class Subsets{

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if(n == 0){
            System.out.print(subset);
            return;
        }

        //add hoga
        subset.add(n);
        findSubsets(n-1, subset);
        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}