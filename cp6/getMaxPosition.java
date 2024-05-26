package gr.aueb.cf.cp6;
public class getMaxPosition  {

    /**
     * returns the position of max value from input array
     * @param arr input array
     * @param low starting position
     * @param high ending position
     * @return the position of max value
     */
    public int getMaxPosition (int [] arr, int low, int high) {
        int maxPosition = low;
        int maxValue = -1;

        if ((low < 0 ) || (high > arr.length -1)) {
            return -1;
        }

        maxValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
