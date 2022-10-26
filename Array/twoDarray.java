package Array;

public class twoDarray {
    public static void main(String args[]){
        //declaring or initializing
        int []p,k,l,s[];
        int A[][]=new int[3][4];
        int B[][]={{2,3,4,5},{5,6,7,8}};
        int c[][];
        c=new int[3][4];
        // System.out.println(B[0][0]);
        //printing/ accessing 2d array
        for (int i=0;i<B.length;i++) {

            for(int j=0;j<B[i].length;j++)
            {
                System.out.print(B[i][j]+",");
            }
            System.out.println("\n");
        }
 
        //Using foreach loop
        for(int x[]: B){
            for(int z: x){
                System.out.print(z+",");

            }
            System.out.println("\n");

        }
        //jagged array
        int jagged[][]=new int[3][];
        jagged[0]=new int[1];
        jagged[1]=new int[9];
        jagged[2]=new int[7];

        //Matrix Additon
        //If both matrix are of same order then only they can be adde dor subtracted
        //


    }
}
