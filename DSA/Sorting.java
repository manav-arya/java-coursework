package DSA;

public class Sorting {

    public static void printArray(int arr[]){
        for(int k=0; k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }

    //logic in lecture
    public static void main(String args[]){
        int[] numbers = {4,8,6,5,2,4,5};
        
        // Bubble Sort
        // time complexity = O
        // int temp;
        // for(int i=0; i<numbers.length-1; i++){
        //     for(int j=0; j<numbers.length-1; j++){
        //         if(numbers[j] > numbers[j+1]){
        //             temp = numbers[j];
        //             numbers[j]=numbers[j+1];
        //             numbers[j+1] = temp;
        //         }
        //     }
        // }

        // Selection Sort
        //Time complexity --> O(n^2)
        // for(int i=0; i<numbers.length-1; i++){
        //     int pos = i;
        //     for(int j=i+1; j<numbers.length; j++){
        //         if (numbers[pos]>numbers[j]){
        //             pos = j;
        //         }
        //     }
        //     int temp = numbers[pos];
        //     numbers[pos] = numbers[i];
        //     numbers[i] = temp;
        // }
        // printArray(numbers);

        // Insertion Sort
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i-1;
            while(j>=0 && current < numbers[j]){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = current;

            printArray(numbers);
        }
    }
}
