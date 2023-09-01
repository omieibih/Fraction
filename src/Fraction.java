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
    int n1 = this.numerator;
    int d1 = this.denominator;
    int n2 = other.numerator;
    int d2 = other.denominator;
    int nfinal = 0;
    int dfinal = 0; 

    if (d1 != d2)
    {
      int lowcommult = Fraction.lcm(d1,d2);
      int multiplier1 = lowcommult/d1;
      int multiplier2 = lowcommult/d2;
      n1 *= multiplier1;
      n2 *= multiplier2;
      nfinal = n1 + n2;
      dfinal = lowcommult;
      Fraction sumFrac = new Fraction(nfinal, dfinal);
      sumFrac.reduce();
      return sumFrac;
    }
    else {
      nfinal = n1 + n2;
      dfinal = d1;
      Fraction sumFrac = new Fraction(nfinal, dfinal);
      sumFrac.reduce();
      return sumFrac;
    }
  }

   public Fraction multiply(Fraction other){
  //variables
  int n1 = this.numerator;
  int d1 = this.denominator;
  int n2 = other.numerator;
  int d2 = other.denominator;
  //code
  int nfinal = n1 * n2;
  int dfinal = d1 * d2;
  Fraction newFrac = new Fraction(nfinal,dfinal);
  newFrac.reduce();
  return newFrac;

  }

  private void reduce()
  {
    int gcd = Fraction.gcd(numerator,denominator);
    numerator /= gcd;
    denominator /=gcd;
  }
  
  static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

  public String toString()
  {
    return numerator + "/" + denominator;
  }
}
