import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        System.out.println(randomNumbers.getCountOfRandomNumber());
        System.out.println("Min value: " + randomNumbers.getMin());
        System.out.println("Max value: " + randomNumbers.getMax());
    }
        int min = 30;
        int max = 0;

        public int getCountOfRandomNumber() {
            Random random = new Random();
            int sum = 0;
            while (sum <= 5000) {
                int randomNumber = random.nextInt(31);
                sum = sum + randomNumber;
                if (randomNumber < min) {
                    min = randomNumber;
                }
                if (randomNumber > max) {
                    max = randomNumber;
                }
            }
            return sum;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }
}
