import csv_movie.demo.Model.MovieList;
import csv_movie.demo.MovieService;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteToFile {

    public static void main(String[] args) {


        List<MovieList> movie = new ArrayList<>();
        MovieList ml = new MovieList();
        MovieService ms = new MovieService();


        try(FileWriter fileWriter = new FileWriter("moviesTocsv.csv")){ // Try her er mere moderne, og sørger for at lukke cvs reader automatisk
            ms.getList();
            for (int i = 0; i <ms.getList().size(); i++) {
                fileWriter.write(ms.getList().get(i).getDirectorName() + "," + ms.getList().get(i).getGenre() + "," + ms.getList().get(i).getLanguage() + "," + ms.getList().get(i).getTitle() + "\n");


            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
