public class Fraction {
    
    private int numerator; 
    private int denominator;

    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int n, int d)
    {
        numerator = n;
        denominator = d;
    }

    public Fraction add(Fraction other)
    {
        Fraction newFrac = new Fraction();
        if(this.denominator == other.denominator)
        {
            newFrac.numerator = this.numerator + other.numerator;
            newFrac.denominator = this.denominator;
        }
        
        return newFrac;

    }
}
