package main.java.com.ohgiraffers.understand.chap02;

import java.util.ArrayList;
import java.util.HashMap;

public class MovieTheater {

    MovieDTO movieDTO = new MovieDTO();
//    HashMap<String, MovieDTO> movielist = new HashMap();
    ArrayList<MovieDTO> movielist = new ArrayList();

    public void addMovie(String movieTitle, int runningTime,  int numberOfSeats){
            /*movieDTO.setTitle(movieTitle);
            movieDTO.setNumbOfSeat(numberOfSeats);
            movieDTO.setRunningTime(runningTime);*/
            movielist.add(new MovieDTO(movieTitle,runningTime,numberOfSeats,0,numberOfSeats));

    }

    public void showMovieList(){
        System.out.println("=====영화 목록=====");
        for(MovieDTO movieDTO : movielist){
            System.out.println(movieDTO);
            System.out.println("-------------");
        }
    }

    public void bookSeat(String movieChoice, int numOfBookingSeats) throws Exception{
        for(MovieDTO movie : movielist){
            if(movieChoice.equals(movie.getTitle())){
                movie.setNumbOfBookedSeat(numOfBookingSeats);
                if(movie.getNumbOfRemainingSeat()==0){
                    throw new Exception("좌석이 모두 예약되었습니다. 예매 불가!!!");
                } else {
                    movie.setNumbOfRemainingSeat(movie.getNumbOfRemainingSeat() - movie.getNumbOfBookedSeat());
                    System.out.println(movieChoice + " 의 좌석 " + numOfBookingSeats + " 개가 예매 되었습니다.");
                    System.out.println(movieChoice + " 의 남은 좌석수는 " + movie.getNumbOfRemainingSeat() + " 개 입니다.");
                }

            }
        }

    }

}
