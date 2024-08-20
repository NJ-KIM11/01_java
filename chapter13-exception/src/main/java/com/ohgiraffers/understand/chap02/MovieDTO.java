package main.java.com.ohgiraffers.understand.chap02;

public class MovieDTO {

    private String title;
    private int runningTime;
    private int numbOfSeat;
    private int numbOfBookedSeat;
    private int numbOfRemainingSeat;

    public MovieDTO() {
    }

    public MovieDTO(String title, int runningTime, int numbOfSeat, int numbOfBookedSeat, int numbOfRemainingSeat) {
        this.title = title;
        this.runningTime = runningTime;
        this.numbOfSeat = numbOfSeat;
        this.numbOfBookedSeat = numbOfBookedSeat;
        this.numbOfRemainingSeat = numbOfRemainingSeat;
    }

    public int getNumbOfRemainingSeat() {
        return numbOfRemainingSeat;
    }

    public void setNumbOfRemainingSeat(int numbOfRemainingSeat) {
        this.numbOfRemainingSeat = numbOfRemainingSeat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public int getNumbOfSeat() {
        return numbOfSeat;
    }

    public void setNumbOfSeat(int numbOfSeat) {
        this.numbOfSeat = numbOfSeat;
    }

    public int getNumbOfBookedSeat() {
        return numbOfBookedSeat;
    }

    public void setNumbOfBookedSeat(int numbOfBookedSeat) {
        this.numbOfBookedSeat = numbOfBookedSeat;
    }

    @Override
    public String toString() {
        return  "영화 제목 : " + title +
                "\n상영시간 : " + runningTime +
                "\n총 좌석수 : " + numbOfSeat +
                "\n남은 좌석수 : " + numbOfRemainingSeat +
                "\n예약된 좌석수 : " + numbOfBookedSeat;

    }
}
