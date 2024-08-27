public class _18MaxmimumValue {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 10, 5};
        
        // Assume the first element is the maximum
        int max = array[0];
        
        // Loop through the array to find the maximum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update the maximum value
            }
        }
        
        // Print the maximum value
        System.out.println("Maximum value in the array: " + max);
    }
}
