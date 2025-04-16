public class BmiService {
    public int calculate(double HeightInMeters, double WeightInKgs) {
        double index = (WeightInKgs / (HeightInMeters * HeightInMeters));
        return (int) index;
    }
}
