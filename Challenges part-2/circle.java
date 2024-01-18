public class circle {
    double radiusinmm;

circle(double radiusinmm){
this.radiusinmm=radiusinmm;
}
    double getcircumference(){
return 2 *radiusinmm* Math.PI;
    }
    double getArea()
    {
        return Math.PI *Math.pow(radiusinmm,2);
    }
    @Override
    public String toString() {
    return "circle props: radius in mm:"+radiusinmm+",circumference :"+getcircumference()+" ,area : "+getArea()+" ";
    }
    public static void main(String[] args) {
        circle abc=new circle(8);
        System.out.println(abc);
    //    System.out.println(abc.getcircumference()); 
    //  System.out.println(   abc.getArea());
    }
}
