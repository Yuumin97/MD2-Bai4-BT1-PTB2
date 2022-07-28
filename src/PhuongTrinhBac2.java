public class PhuongTrinhBac2 {
   public double a;
   public double b;
   public double c;
   public PhuongTrinhBac2(){
   }
   public PhuongTrinhBac2(double a,double b,double c){
       this.a = a ;
       this.b = b ;
       this.c = c;
   }

    public double getA() {
        return a;
    }
    public double getB(){
    return  b;
    }
    public double getC(){
       return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return (this.b*this.b - 4*this.a*this.c);
    }
    public double getRoot1(){
        return (-this.b+Math.pow(this.getDiscriminant(),0.5))/2*this.a;
    }
    public double getRoot2(){
        return (-this.b-Math.pow(this.getDiscriminant(),0.5))/2*this.a;
    }
    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
