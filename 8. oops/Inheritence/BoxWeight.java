public class BoxWeight extends Box {
    double weight;

    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);  // used to call the parent constructor
        this.weight = weight;
    }

    BoxWeight() {
        this.weight = -1;
    }
}
