import java.util.*;
class SB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(("Tony"));
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        // set char  at index
        sb.setCharAt(0, 'f');
        sb.insert(0,"p");
        System.out.println(sb);

        sb.insert(2, "n");
        System.out.println(sb);

        sb.delete(0, 3);
        sb.append("fuck");
        sb.reverse();

        String s = "hello";
        StringBuilder ss = new StringBuilder(s);
        for (int i = 0; i < ss.length()/2; i++) {
            int front = i;
            int back = ss.length() - 1 -i;
            char frontC = ss.charAt(front);
            char backC = ss.charAt(back);

            ss.setCharAt(front, backC);
            ss.setCharAt(back, frontC);
        }
        System.out.println(ss);
    }
}