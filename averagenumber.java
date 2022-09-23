public class averagenumber {
    public static void main(String[] args) {
        int n = 5,result = 0;

        int x[] = new int[5];
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;
        x[4] = 50;
         
        for(int i =0;i<n;i++)
          result=result+x[i];

    System.out.println(" the average of given value is =  " +  result/n ) ;
    }
}