import java.util.*;
class Party{
    public static int inviteParty(int n) {
        
        if(n <= 1){
            return 1;
        }
        
        int ways1 = inviteParty(n-1);

        int ways2 = (n-1) * inviteParty(n-2);

        return ways1 + ways2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inviteParty(4));
    }
}