public class BmiService {
    public int calculate(double heightInMeters, double weightInKgs) {
        double index = (weightInKgs / (heightInMeters * heightInMeters));
        return (int) index;
    }
}
