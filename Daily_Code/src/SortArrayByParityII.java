public class SortArrayByParityII {
public  static void main(String[] args){
    int [] array={4,1,1,0,1,0};
    for(int i=0;i<array.length;i++){
        boolean check=true;
        int temp=array[i];
        if(array[i]%2==0 &&i%2==0||array[i]%2!=0 &&i%2!=0){
             continue;
        }
        else if(array[i]%2==0 &&i%2!=0){
            int k=i;
              while (check){
                  if(array[k]%2!=0 &&k%2==0){
                      array[i]=array[k];
                      array[k]=temp;

                      check=false;
                  }
                  else {
                      k++;
                  }
              }

        }
        else if(array[i]%2!=0 &&i%2==0){
            int k=i;
            while (check){
                if(array[k]%2==0 &&k%2!=0){
                    array[i]=array[k];
                    array[k]=temp;

                    check=false;
                }
                else {
                    k++;
                }
            }

        }

    }
    for(int j=0;j<array.length;j++){
        System.out.print(array[j]+" ");
    }
}
}
