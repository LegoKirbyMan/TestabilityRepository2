public class BmiService {
    public int calculate(double Height, double Weight) {
        double index = (Weight / (Height * Height));
        return (int) index;
    }
}
