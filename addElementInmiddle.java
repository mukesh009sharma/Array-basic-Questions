public class addElementInmiddle {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int newElement= 100;
        int position=3;
        for(int i=arr.length-1;i>position-1;i--){
            arr[i]=arr[i-1];
        }
        
    }
}
