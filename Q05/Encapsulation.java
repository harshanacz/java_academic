public class Encapsulation {
    public static void main (String[] args){
        testEncap testEncap = new testEncap();

        testEncap.printName();
        testEncap.setName("Dineth");
        testEncap.printName();
    }

    
}

class testEncap{
    private String name = "Janith";

    void printName (){
        System.out.println(name);
    }

   public void setName ( String newName){
    this.name = newName;

    } 
}