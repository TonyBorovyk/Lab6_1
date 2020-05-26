
public class Triangle_3 extends Figure {


    Triangle_3(double a) {

        this.verges = new double[1];

        this.verges[0] = a;


    }


    @Override
    double getPerimeter() {

        return this.verges[0] * 3;

    }


    @Override
    double getSquare() {

        double p = (this.verges[0] * 3) / 2;

        return Math.sqrt(p * (p - this.verges[0]) * (p - this.verges[0]) * (p - this.verges[0]));

    }

}
