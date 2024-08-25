public class _11RemoveElement {

        public static void main(String[] args) {
            int[] originalArray = {18, 19, 20, 21};
            int positionToRemove = 1; // Index of the element to remove
    
            // Create a new array with one less element
            int[] newArray = new int[originalArray.length - 1];
    
            // Copy elements before the position to remove
            for (int i = 0; i < positionToRemove; i++) {
                newArray[i] = originalArray[i];
            }
    
            // Copy elements after the position to remove
            for (int i = positionToRemove; i < newArray.length; i++) {
                newArray[i] = originalArray[i + 1];
            }
    
            // Print the new array
            System.out.print("New array: ");
            for (int i : newArray) {
                System.out.print(i + " ");
            }
        }
    }
    

