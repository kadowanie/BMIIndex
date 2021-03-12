public class Main {
    public static void main(String[] args) {
        float weightKg = 65;
        float heightCm = 172;
        float bmi = weightKg / ((heightCm * heightCm) / 10000);
        System.out.println(bmi);
    }
}