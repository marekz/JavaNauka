package figury;

public class FabrykaFigur {
    
    public static Figura wygeneruj(String nazwa, double arg1, double arg2) {
        switch(nazwa) {
            case "Koło" : return new Kolo(arg1);
            case "Kwadrat" : return new Kwadrat(arg1);
            case "Prostokąt" : return new Prostokat(arg1, arg2);
            default : return null;
        }
    }
}

class Kolo extends Figura {
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double pole() {
        return Math.PI * r * r;
    }

    @Override
    public double obwod() {
        return 2 * Math.PI * r;
    }   
}

class Kwadrat extends Figura {
    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double pole() {
        return a*a;
    }

    @Override
    public double obwod() {
        return 4 * a;
    }   
}

class Prostokat extends Figura {
    private double a, b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double pole() {
        return a * b;
    }

    @Override
    public double obwod() {
        return 2 * a + 2 * b;
    }   
}

