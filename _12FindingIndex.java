public class _12FindingIndex
{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int elementToFind = 20;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
