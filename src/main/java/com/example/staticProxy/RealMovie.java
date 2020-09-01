package com.example.staticProxy;

public class RealMovie  implements Movie{
    @Override
    public void play() {
        System.out.println("您 正在观看电影《Java改变世界》");
    }
}
