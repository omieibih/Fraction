public class App {
    public static void main(String[] args) throws Exception {
        Fraction a = new Fraction(1,3);
        Fraction b = new Fraction(1,6);
        Fraction c = new Fraction(1,4);
        Fraction d = new Fraction(3,6);
        Fraction e = new Fraction(3,8);
        Fraction f = new Fraction(2,5);
        Fraction sum;
        sum = b.add(e); // 1/6 + 3/8 
        System.out.println(b + " + " + e + " = " + sum);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(c.add(d));
        System.out.println(c.multiply(d));
        System.out.println(e.add(f));
        System.out.println(e.multiply(f));



        
    }
}
