package main.java.org.example.Task4;

public class Car implements Comparable {

    private int price;
    private int year;       // рік виготовлення
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // гетери та сетери які не використовуються, але хай будуть на всяк випадок, може хтось захоче змінити щось
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getHorsePower() { return horsePower; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    @Override
    public int compareTo(Object object) {

        if (this.price != ((Car) object).price) {
            return ((Car) object).price - this.price;
        }

        if (this.year != ((Car) object).year) {
            return this.year - ((Car) object).year;
        }

        return this.horsePower - ((Car) object).horsePower;
    }

    @Override
    public String toString() {
        return "Car{price=" + price + ", year=" + year + ", hp=" + horsePower + "}";
    }
}