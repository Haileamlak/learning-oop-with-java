package LAB;

public class Fraction {
    private int num;
    private int denum;

    public Fraction() {
        num = 0;
        denum = 1;
    }

    public Fraction(int aNum, int aDenum) {
        setNum(aNum);
        setDenum(aDenum);
    }

    public void setDenum(int denum) {
        if (denum == 0) {
            System.out.println("error : 0 as a denominator");
            System.exit(0);
        }
        this.denum = denum;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenum() {
        return denum;
    }

    public int getNum() {
        return num;
    }
    
    // @Override
    // public int compareTo(Object obj) {
    //     if (obj == null) {
    //         System.out.println("error : comparing to null object");
    //         System.exit(2);
    //     }
    //     if (getClass() != obj.getClass()) {
    //         System.out.println("comparing incompatible objects");
    //         System.exit(3);
    //     }
    //     Fraction temp = (Fraction) obj;
    //     if (num / denum == temp.getNum() / temp.getDenum())
    //         return 0;
    //     return (num / denum < temp.getNum() / temp.getDenum()) ? -1 : 1;
    // }

    @Override
    public String toString() {
        if (num == 0)
            return "0";
        if (denum == 1)
            return String.valueOf(num);
        return (num + "/" + denum);// num/denom
    }

    private int gcd() {
        int gcdNum = 1;
        for (int i = 1; i <= Math.abs(Math.min(num, denum)); i++) {
            if (num % i == 0 && denum % i == 0)
                gcdNum = i;
        }
        return gcdNum;
    }

    public Fraction simplify() {
        int gcdNum = gcd();
        num /= gcdNum;
        denum /= gcdNum;
        Fraction f = new Fraction(num, denum);
        return f;
    }

    public Fraction add(Fraction f) {
        if (f == null) {
            System.out.println("error : can't add null object");
            System.exit(1);
        }
        Fraction fSum = new Fraction();
        fSum.setNum(getNum() * f.getDenum() + getDenum() * f.getNum());
        fSum.setDenum(getDenum() * f.getDenum());
        fSum.simplify();
        return fSum;
    }

    public Fraction sub(Fraction f) {
        if (f == null) {
            System.out.println("error : can't add null object");
            System.exit(1);
        }
        Fraction fSub = new Fraction();
        fSub.setNum(getNum() * f.getDenum() - getDenum() * f.getNum());
        fSub.setDenum(getDenum() * f.getDenum());
        fSub.simplify();
        return fSub;
    }

    public Fraction div(Fraction f) {
        if (f == null) {
            System.out.println("error : can't add null object");
            System.exit(1);
        }
        Fraction fDiv = new Fraction();
        fDiv.setNum(getNum() * f.getDenum()); // a/b / c/d == a*d / c*b
        fDiv.setDenum(getDenum() * f.getNum());
        fDiv.simplify();
        return fDiv;
    }

    public Fraction mult(Fraction f) {// f1.mult(f2)
        // if (f == null) {
        //     System.out.println("error : can't add null object");
        //     System.exit(1);
        // }
        Fraction fMult = new Fraction();
        fMult.setNum(getNum() * f.getNum());
        fMult.setDenum(getDenum() * f.getDenum());
        fMult.simplify();
        return fMult;
    }

    public Fraction add(int number) { 
        // Fraction fSum = new Fraction(number, 1);//number/1 == number

        Fraction retu = new Fraction();
        retu.setNum(number + this.num);
        retu.setDenum(1 + this.denum);

        retu.simplify();
        return retu;
    }

    public Fraction sub(int number) {
        Fraction fSub = new Fraction(number, 1);
        fSub = this.sub(fSub);
        fSub.simplify();
        return fSub;
    }

    public Fraction div(int number) {
        Fraction fDiv = new Fraction(number, 1);
        fDiv = this.div(fDiv);
        fDiv.simplify();
        return fDiv;
    }

    public Fraction mult(int number) {
        Fraction fMult = new Fraction(number, 1);
        fMult = this.mult(fMult);
        fMult.simplify();
        return fMult;
    }

}
