public class _7RemoveLastElement{
public static void main(String[] args) {
    int Oldarr[]={4,5,6,7};
    for(int num:Oldarr){
        System.out.println(num);
    }
    //creating a new Array with one less element than the Old Array
    int newarr[]=new int[Oldarr.length-1];
    //copying the Elements from the Old Array to the new Array
    for(int i=0;i<newarr.length;i++) {
        newarr[i]=Oldarr[i];
    }
    //printing the new array for verifying ,lat element if removed or not
    System.out.println("the new array is :");
    for(int num:newarr){
        System.out.println(num);
    }

}
}