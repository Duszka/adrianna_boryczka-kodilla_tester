public class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User zosia = new User("Zosia", 21);
        User antek = new User("Antek", 28);
        User hania = new User("Hania", 25);
        User franek = new User("Franek", 32);
        User bruno = new User("Bruno", 22);
        User gaja = new User("Gaja", 16);
        User olga = new User("Olga", 36);

        User[] users = {zosia, antek, hania, franek, bruno, gaja, olga};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result= result + users[i].getAge();
        }

        int average = result/ users.length;
        System.out.println(average);

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < average) {
                System.out.println(users[i].getName());
            }
        }
    }
}
