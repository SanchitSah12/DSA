import java.util.*;
class TilePlace{

    public static int placeTiles(int n,int m)
    {
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertPlacement = placeTiles(n-m, m);
        int horiPlacement = placeTiles(n-1,  m);

        return horiPlacement + vertPlacement;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(placeTiles(4, 2));
    }
}