public class HypotenuseFinder {
    double hypotenuse,a,b;

    HypotenuseFinder (double a, double b){
        this.a = a;
        this.b = b;
        this.hypotenuse =  Math.sqrt((a*a)+(b*b));
    }

    @Override
    public String toString() {
        int A = (int) this.a;
        int B = (int) this.b;
        int Hypotenuse = (int) this.hypotenuse;

        return ("Triangle " + A +"," + B + "," + Hypotenuse);
    }

}
