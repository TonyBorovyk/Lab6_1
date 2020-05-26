public class Triangle_2 extends Figure {


    Triangle_2(double a,double b) {

        this.verges = new double[2];

        this.verges[0] = a;

        this.verges[1] = b;

    }


    @Override
    double getPerimeter() {

        return this.verges[0] * 2 + this.verges[1];

    }


    @Override
    double getSquare() {

        double p = (this.verges[0] * 2  + this.verges[1]) / 2;

        return Math.sqrt(p * (p - this.verges[0]) * (p - this.verges[0]) * (p - this.verges[1]));

    }

}