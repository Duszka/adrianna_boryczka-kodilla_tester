public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

        public void add(int value) {
            if (this.size == 10) {
                return;
            }
            this.grades[this.size] = value;
            this.size++;
        }

        public int lastGrade() {
            return this.grades[grades.length-1];
        }

        public int gradesAverage() {
            int sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum = sum + grades[i];
            }
            return sum / grades.length;
        }

        public static void main (String [] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(6);
        grades.add(5);
        grades.add(4);
        grades.add(1);
        grades.add(3);
        grades.add(5);
        grades.add(4);
        grades.add(6);
        grades.add(4);

        System.out.println(grades.gradesAverage());
        System.out.println(grades.lastGrade());
        }
}

