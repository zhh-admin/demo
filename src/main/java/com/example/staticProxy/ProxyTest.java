package com.example.staticProxy;

public class ProxyTest {
    public static void main(String[] args) {
        RealMovie realMovie=new RealMovie();
        Movie movie=new Cinema(realMovie);
        movie.play();
    }
}
