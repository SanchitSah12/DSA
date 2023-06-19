import java.util.*;
class TotalPath{

    public static int countPaths(int nini,int mini,int nf,int mf){
        if(nini == nf || mini == mf){
            return 0;
        }
        
        if(nini == nf-1 && mini==mf-1){
            return 1;
        }
        int downPaths = countPaths(nini+1, mini, nf, mf);
        int rightPaths = countPaths(nini, mini+1, nf, mf);
        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countPaths(0, 0, 3, 3));
    }
}