public class ArrayClone {
    public static void main (String[] args){
        int[] original = {1, 2, 3};
        int[] copy = original.clone(); 
        System.out.println(copy[1]); 
    }
}
