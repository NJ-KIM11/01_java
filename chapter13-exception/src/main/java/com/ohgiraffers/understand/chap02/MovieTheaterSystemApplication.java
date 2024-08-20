package main.java.com.ohgiraffers.understand.chap02;

import java.util.Scanner;

public class MovieTheaterSystemApplication {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        MovieTheater movieTheater = new MovieTheater();
        String movieTitle;
        int runningTime;
        int seats;

        System.out.println("===========영화관 시스템===========");
        System.out.println("몇 편의 영화를 추가 할까요??");
        int numOfMovies = scr.nextInt();
        scr.nextLine();

        //입력한 숫자만큼 영화 추가
        for (int i = 0; i < numOfMovies; i++) {
            System.out.println("영화 제목 입력 : ");
            movieTitle = scr.nextLine();
            System.out.println("상영 시간 입력 : ");
            runningTime = scr.nextInt();
            scr.nextLine();
            System.out.println("좌석수 입력 : ");
            seats = scr.nextInt();
            scr.nextLine();

            movieTheater.addMovie(movieTitle, runningTime, seats);
            System.out.println(movieTitle + " 추가 완료");
            System.out.println("------------------------------");
        }

        while (true){
            //영화 목록 출력
            movieTheater.showMovieList();

            //영화 좌석 예매
            System.out.println("좌석을 예매할 영화 제목 입력 : ");
            String movieChoiceTitle = scr.nextLine();
            System.out.println("예매할 좌석수 입력 : ");
            int numOfBooking = scr.nextInt();
            scr.nextLine();

            try{
                movieTheater.bookSeat(movieChoiceTitle, numOfBooking);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }




    }
}
