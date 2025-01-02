import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HypotenuseFinder> triangles = new ArrayList<>();
        
        

        boolean processing = true;

        while (processing){
            System.out.println("value a : ");
            double valueA = scanner.nextDouble();
            System.out.println("value b : ");
            double valueB = scanner.nextDouble();
            triangles.add(new HypotenuseFinder(valueA, valueB));

            scanner.nextLine(); 

            System.out.println("Want continue (Y/N) :");
            String isContinue = scanner.nextLine();
            if(!isContinue.equalsIgnoreCase("Y")){
                processing = false;
            }
        }


        for (HypotenuseFinder triangle : triangles ){
            System.out.println(triangle);
        }
        
        
        

    }

}
