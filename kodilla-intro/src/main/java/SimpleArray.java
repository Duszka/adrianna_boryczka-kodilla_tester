public class SimpleArray {
    public static void main(String[] args) {
String[] italianCities = new String[5];
italianCities[0] = "Rzym";
italianCities[1] = "Wenecja";
italianCities[2] = "Palermo";
italianCities[3] = "Florencja";
italianCities[4] = "Prato";

String city = italianCities[3];
System.out.println(italianCities[3]);

int numberOfElements = italianCities.length;
System.out.println(italianCities.length);
System.out.println("Moja tablica zawiera 5 elementów");
    }
}
