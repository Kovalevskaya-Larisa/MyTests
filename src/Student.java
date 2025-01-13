public class Student implements Printable{
    private String surname;
    private int grade_book;
    private double average_score;

    @Override
    public void print(){
        System.out.println("Фамилия студента: " + this.getSurname() + "," + " "  + "Номер зачетки: " +
                                   this.getGrade_book() + "," + " " + "Средний балл: " + this.getAverage_score());
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade_book() {
        return grade_book;
    }

    public double getAverage_score() {
        return average_score;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGrade_book(int grade_book) {
        this.grade_book = grade_book;
    }

    public void setAverage_score(double average_score) {
        this.average_score = average_score;
    }


}
