

public class Triangle extends Figure {


    Triangle(double a, double b) {

        this.verges = new double[3];

        this.verges[0] = a;

        this.verges[1] = b;


    }


    @Override
    double getPerimeter() {
        double gypoten = Math.sqrt(Math.pow(this.verges[0], 2) + Math.pow(this.verges[1], 2));
        return this.verges[1] + this.verges[0] + gypoten;


    }


    @Override
    double getSquare() {

        return 0.5 * (this.verges[0] * this.verges[1]);

    }

}

