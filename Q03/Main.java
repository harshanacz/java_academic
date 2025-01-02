import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HypotenuseFinder> triangles = new ArrayList<>();
        
        System.out.println("value a : ");
        double valueA = scanner.nextDouble();
        System.out.println("value b : ");
        double valueB = scanner.nextDouble();
        triangles.add(new HypotenuseFinder(valueA, valueB));


        for (HypotenuseFinder triangle : triangles ){
            System.out.println(triangle);
        }
        
        
        

    }

}
