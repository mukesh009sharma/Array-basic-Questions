public class _8AddElementAtBegining{
    public static void main(String[] args) {
        //Creating an array
        int arr[]={11,12,13,14};
        //Element we wnat to add
        int Element=10;
        //creating a new array with  the one more element thsn "arr"
        int newarr[]=new int[arr.length+1];
        //addind the new Element at the first position zero index
        newarr[0]=Element;
        //copying the "arr" Elements to new arr with the 1st index position or starting from index 1
        for(int i=0;i<arr.length;i++){
            newarr[i+1]=arr[i];

        }
        //printing the new array
        for (int num  : newarr) {
            System.out.println(num);
        }            
        }

    }
