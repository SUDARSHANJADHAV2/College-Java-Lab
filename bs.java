import java.util.*;
public class bs {
    public static void bs(int array[],int size){
        int count=1;
        while(count<size){
            for(int i=0;i<size-count;i++){
                if(array[i]>array[i+1]){
                    int temp;
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
            count++;
        }
        
        System.out.println("Sorted Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements in the array : ");
        for(int i =0;i<size;i++){
            array[i]=sc.nextInt();
        }

        bs(array,size);
    }    
}
