package csv_movie.demo;

import csv_movie.demo.Model.MovieList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {

        List<MovieList> movie = new ArrayList<>();
        Scanner scan;

    {
        try {
            scan = new Scanner(new File("C:\\Users\\Nmtur\\IdeaProjects\\3Semester\\JonUndervisning\\CSV_Movie\\src\\main\\resources\\movie_metadata_500.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void generateList() {
            while (scan.hasNext()) {
                String word = scan.nextLine();
                String[] column = word.split(",");

                movie.add(new MovieList(column[1], column[9], column[19], column[11]));
            }
        }

        public List<MovieList> getList(){
            generateList();
            for (MovieList current: movie) {
                System.out.println(current.getTitle() + ", " + current.getDirectorName() + ", " + current.getGenre() + ", " + current.getLanguage());
            }
            return movie;
        }


    }





