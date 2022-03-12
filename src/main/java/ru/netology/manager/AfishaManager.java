package ru.netology.manager;

import ru.netology.domain.Afisha;

public class AfishaManager {
    private Afisha[] movies = new Afisha[0];
    private int currentMoviesLenght = 10;

    public AfishaManager() {
    }

    public AfishaManager(int currentMoviesLenght) {
        this.currentMoviesLenght = currentMoviesLenght;
    }

    public void add(Afisha movie) {
        int length = movies.length + 1;
        Afisha[] tmp = new Afisha[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastCell = tmp.length - 1;
        tmp[lastCell] = movie;
        movies = tmp;
    }

    public Afisha[] showMovies() {
        int resultLenght = currentMoviesLenght;
        if (movies.length < resultLenght) {
            resultLenght = movies.length;
        }
        Afisha[] result = new Afisha[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            int cell = movies.length - i - 1;
            result[i] = movies[cell];
        }
        return result;
    }
}