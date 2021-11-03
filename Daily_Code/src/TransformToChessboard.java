public class TransformToChessboard {
    public static int sum(int n){
        if(n==0)
            return 0;
        else {
            return n+sum(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println(sum(2));
//        int[][] met={{0,1,1,0},{0,1,1,0},{1,0,0,1},{1,0,0,1}};
//        int row=met.length;
//        int col=met[0].length;
//        for(int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                System.out.print(" "+met[i][j]);
//            }
//            System.out.println();
//        }

    }
}
