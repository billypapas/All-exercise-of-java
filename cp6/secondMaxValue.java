package gr.aueb.cf.cp6;

public class secondMaxValue {
    static int[] arr = {5, 4, 7, 8, 16, 3, 12, 11};
    public static void main(String[] args) {

        int secondMinPosition = getMinPosition(arr, 0, 7);
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("\nthe second min value is: " + secondMinPosition);
    }

    /**
     * sort the input array by desc and returns the second min value of input array
     * @param arr input array
     * @param low staring position
     * @param high ending position
     * @return the second min value of input array
     */
    public static int getMinPosition (int [] arr, int low, int high) {
        int minValue;

        if ((low < 0 ) || (high > arr.length -1)) {
            return -1; //error code
        }

       for (int i = arr.length -1; i > 0; i-- ) {
           for (int j = 0; j < i; j++) {
               if (arr[j] > arr[j+1]) swap (j, j+1);
           }
       }
       minValue = arr[1];//second item of sorted array
        return minValue;
    }

    public  static void swap (int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
