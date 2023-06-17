package ExampleNo3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Преступление и наказание", "Достоевский", 2022, 296, 608);
        Books book2 = new Books("Маленький принц", "Сант-Экзюпери", 2012, 129, 107);
        Books book3 = new Books("Превращение", "Кафка", 2010, 240, 211);
        Books book4 = new Books("Крёстный отец", "Пьюзо", 2000, 620, 576);
        Books book5 = new Books("Тарас Бульба", "Гоголь", 2002, 160, 352);
        Books book6 = new Books("Введение в психоанализ", "Фрейд", 2020, 168, 480);
        List<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        String bookName = "";

        for (Books book : booksList){
            if(book.getYearPublic() >= 2010){
                if (book.getSurnameAuthor().contains("а")){
                    if (isPrime(book.getNumOfPages())){
                        bookName = book.getNameBook();
                        System.out.println(bookName);
                    }
                }
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
