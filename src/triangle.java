public class triangle {
    double a;
    double b;
    double c;
    public void area() {
//        double p = (a + b + c) / 2;
//        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);
        System.out.println("Площадь " + (Math.sqrt(s)));
    }
}