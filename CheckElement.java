import java.util.Scanner;
public class CheckElement {
    
    public static void main(String[] args) {
  Scanner myobj=new Scanner(System.in);
    System.out.println("Enter the size of the Array:");
   
    int size=myobj.nextInt();
    int[] Arr=new int[size];//input array size 
    
    //for inputing the array Elemnts
    System.out.println("Enter the Elements for the array:");
    for(int i=0;i<size;i++){
    Arr[i]=myobj.nextInt();
    }
    //input the Elemnet you want to search
    System.out.println("Enter the number you want to search:");
    int Findnum=myobj.nextInt();
    //Searching for the the number
    boolean found=false;
    for(int number:Arr){
        if(number==Findnum){
            found=true;
            break;
        }
    }
    if(found){
        System.err.println("the number "+Findnum+" is present in the array");
    }else{
        System.out.println("the number "+Findnum+" is present in tthe array");}
}
}
