package main.java.com.ohgiraffers.understand;

import java.util.Set;
import java.util.TreeSet;

public class Lotto {

    public TreeSet lottoCreator(){
        TreeSet <Integer> lottoSet = new TreeSet<Integer>();
        while(lottoSet.size() < 6){
            lottoSet.add((int)(Math.random()*8) + 1);
        }
        return lottoSet;
    }
}
