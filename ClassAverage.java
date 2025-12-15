import java.util.Scanner;

public class ClassAverage {
    import java.util.Scanner;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] testScore = new double[5];

            for (int x = 0; x < 5; x++) {
                testScore[x] = scanner.nextDouble();
            }
            double average = calcAverage(testScore);
            System.out.println("Average Test Score: " + average);

            System.out.println("Letter Grades:");
            for (int x = 0; x < 5; x++) {
                String score = determineGrade(testScore[x]);
                System.out.println("Test Score " + (x + 1) + ": " + score);
            }
        }

        public static double calcAverage(double[] testScores) {
            double sum = 0;
            for (double score : testScores) {
                sum += score;
            }
            return sum / testScores.length;
        }

        public static String determineGrade(double score) {
            if (score >= 90 && score <= 100) {
                return "A";
            } else if (score >= 80) {
                return "B";
            } else if (score >= 70) {
                return "C";
            } else if (score >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
    }

