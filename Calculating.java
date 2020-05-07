public class Calculating {
    private double x;

    public Calculating(double x) throws Except {

        if (x <= 1.928 || x >= 71.202) throw new Except("Wrong range", x);
        this.x = x;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double formula1() {
        double y;
        y = Math.pow(x, 4) * 3.072 + Math.pow(x, 3) * 4.597 - Math.pow(x, 2) * 4.886 + x * 4.315;
        return y;
    }

    public double formula2() {
        double y;
        y = Math.pow(x, 3) * 2.78 - Math.pow(x, 2) * 2.143 + x * 9.713;
        return y;
    }

    public double formula3() {
        double y;
        y = Math.pow(x, 2) * 1.189 + x * 2.769;
        return y;
    }

    public double formula4() {
        double y;
        y = x * 8.183;
        return y;
    }

}
