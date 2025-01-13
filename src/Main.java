public class Main {
    public static void main(String[] args) {

        Book book = new Book ();
        book.setAuthor ( "Есенин" );
        book.setName ( "Стихи" );
        book.setData ( 1995 );
        book.display ();

        Student student = new Student ();
        student.setSurname ( "Иванов" );
        student.setGrade_book (25);
        student.setAverage_score ( 4.5 );
        student.print ();

        Point point = new Point();
        point.setX ( 10 );
        point.setY ( 20 );
        System.out.println ("Начало координат: " + point.getX () + " " + point.getY ());

        point.moveUp(5);
        point.moveLeft(7);
        point.moveDown(8);
        point.moveRight(12);

        Clock clock = new Clock(11, 15, 15);
        clock.setSeconds ( 16 );
        clock.readTime ();
        clock.tick ();

        Car car = new Car();
        car.setMake ( "Nissan" );
        car.setModel ("Armada");
        car.setYear ( 2023 );
        car.displey ();

    }
}
