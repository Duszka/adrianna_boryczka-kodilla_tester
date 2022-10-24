public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 1000 && this.weight < 1600) {
            System.out.println("This notebook isn't very heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkPrice() {
        if (this.price<600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price>600 && this.price<1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
            }
        }
    public void checkYear() {
        if(this.year>2020 || this.price>1000) {
            System.out.println("This is the latest version of the Notebook.");
        } else if (this.year>2015 && this.price<1200) {
            System.out.println("This Notebook is weighty.");
        } else {
            System.out.println("This is the first version of the Notebook");
        }
    }
    }
