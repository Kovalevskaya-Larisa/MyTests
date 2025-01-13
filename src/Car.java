/*Создайте класс Car с полями для марки, модели и года выпуска.
Реализуйте методы для получения и установки этих полей.
Создайте интерфейс Drivable с методами start(), stop(), drive(),
 которые реализуют класс Car для имитации вождения автомобиля
 */

public class Car implements Drivable{
    private String make;
    private String model;
    private int year;

    public Car() {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println("Двигатель запущен!");
    }

    @Override
    public void stop() {
        System.out.println("Двигатель остановлен!");
    }

    @Override
    public void drive() {
        System.out.println("Автомобиль движется!");
    }
    public void displey(){
        System.out.println ("Инфо о машине: " + getMake () + " " + getModel () + " " + getYear () );
    }
}
