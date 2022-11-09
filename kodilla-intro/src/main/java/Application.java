public class Application {
    String name;
    double age;
    int height;

    public Application(String name, double age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkData() {
        if(this.name == null) {
            return;
        }

        if (this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }

    public static void main(String[] args) {
        Application adam = new Application("Adam", 40.5,178);
        adam.checkData();
        System.out.println("Name: " + adam.name);
        System.out.println("Age: " + adam.age);
        System.out.println("Height: " + adam.height);
    }
}
