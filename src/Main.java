public class Main {
    public static void main(String[] args) {
        float weightKG = 65;
        float heightCM = 172;
        float BMI = weightKG / ((heightCM * heightCM) / 10000);
        System.out.println(BMI);
    }
}