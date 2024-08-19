package main.java.com.ohgiraffers.understand;

import java.util.TreeSet;

public class LottoDTO {

    private int order;
    private TreeSet<Integer> lottoNum;

    public LottoDTO() {
    }

    public LottoDTO(int order, TreeSet<Integer> lottoNum) {
        this.order = order;
        this.lottoNum = lottoNum;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public TreeSet<Integer> getLottoNum() {
        return lottoNum;
    }

    public void setLottoNum(TreeSet<Integer> lottoNum) {
        this.lottoNum = lottoNum;
    }

    @Override
    public String toString() {
        return "LottoDTO{" +
                "order=" + order +
                ", lottoNum=" + lottoNum +
                '}';
    }
}
