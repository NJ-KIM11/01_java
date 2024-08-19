package main.java.com.ohgiraffers.section01.list.comparator;

import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int result = 0;
        if (o1.getPrice() > o2.getPrice()) {
            result = 1; //순서를 바꾸려면 양수
        } else if (o1.getPrice() < o2.getPrice()) {
            result = -1;    //순서를 안바꾸려면 음수
        } else {
            result = 0;
        }
        return result;
    }


}
