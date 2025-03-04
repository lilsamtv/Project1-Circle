public class Circle {
    double Radius;

    Circle() {
        Radius = 1;
    }
    Circle(double newRadius) {
        Radius = newRadius ;
    }


    double getArea () {

        return Radius * Radius * Math.PI;
    }


    double getPerimeter(){
        return Radius * 2 * Math.PI;
    }

    void setRadius(double newRadius){
        Radius = newRadius;
    }




}
