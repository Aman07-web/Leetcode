public class L_1732 {
    public static void main(String[] args) {
       int gain[] = {-5,1,5,0,-7};
       int len=gain.length;
       int maxAlt=0;
       int sum=0;
       for(int i=0; i<len;i++){
        sum=sum+gain[i];
        maxAlt=Math.max(maxAlt, sum);
       }
       System.out.print(maxAlt);
    }
}
