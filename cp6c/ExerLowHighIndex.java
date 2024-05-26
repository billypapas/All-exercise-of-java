package gr.aueb.cf.cp6c;

public class ExerLowHighIndex {
    public static void main(String[] args) {
        int[] arr = {0,1,4,4,4,6,7,8,8,8,8,8};
        int keyValue = 8;

        int[] result = getLowAndHighIndex(arr, keyValue);

        System.out.printf(String.format("low index: %s \n",result[0]!=0?result[0]:"not found"));
        System.out.printf(String.format("high index: %s",result[1]!=0?result[1]:"not found"));
    }

    public static int[] getLowAndHighIndex (int[] arr, int key) {
        int[] returnArray = new int[2];
        //int counterKey = 0;

        if (arr == null) return returnArray;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key && returnArray[0] == 0 ) {
                returnArray[0] = i;
                continue;
            }
            if (arr[i] == key) {
                returnArray[1] = i;
            }
        }
        return returnArray ;
    }
}
