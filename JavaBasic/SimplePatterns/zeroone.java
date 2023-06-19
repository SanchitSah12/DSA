class zeroone {
    public static void main(String args[]) {
        int n = 5;
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                k=1;
            }
            else{
                k=0;
            }
            for(int j = 1;j<=i;j++){
                
                System.out.print(j%2==0?k==1?0:1:1 );
            }
            System.out.println();
        }
    }    
}
