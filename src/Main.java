public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87; // должно получиться 500
        int bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}
