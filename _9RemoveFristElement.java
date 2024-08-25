 class RemoveFirstElement {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14};

        // Check if the array has more than one element
        if (arr.length > 1) {
            int[] newArray = new int[arr.length - 1];

            // Copy elements from the original array starting from the second element
            for (int i = 1; i < arr.length; i++) {
                newArray[i - 1] = arr[i];
            }

            // Print the new array
            System.out.print("New array: ");
            for (int i : newArray) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Array has only one element or is empty. No elements to remove.");
        }
    }
}
