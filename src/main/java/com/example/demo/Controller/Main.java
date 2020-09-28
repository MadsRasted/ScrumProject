package com.example.demo.Controller;

import com.mysql.jdbc.Driver;
import com.example.demo.Model.Movie;
import com.example.demo.Repository.MovieRepository;

public class Main {

    public static void main(String[] args) throws Exception{
        Movie m = new Movie("Star Wars", 1991, 100);
        MovieRepository mR = new MovieRepository();

        mR.create(m);
    }
}
