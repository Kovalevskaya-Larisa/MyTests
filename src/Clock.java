/*создайте класс Clock с полями для хранения часов, минут и секунд.
Реализуйте методы для установки и получения времени, а также метод tick() для увеличения времени на 1 секунду.
Создайте интерфейс Readable с методом readTime(), который выводит текущее время часов
 */

public class Clock implements Readable{
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours , int minutes , int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public void tick(){
        seconds ++;
        System.out.println ("Увеличение на 1 секунду " + getSeconds());
    }

    @Override
    public void readTime() {
        System.out.printf("Текущее время: " + "%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
