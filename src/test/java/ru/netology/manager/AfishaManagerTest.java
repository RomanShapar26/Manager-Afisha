package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {


    AfishaManager afisha = new AfishaManager();

    Afisha first = new Afisha(1, "Мульт в кино. Выпуск №138. Весна в тренде", "Мульт", false);
    Afisha second = new Afisha(2, "Щенячий патруль и Вспыш и чудо-машинки", "Мультфильм", false);
    Afisha third = new Afisha(3, "Анчартед: На картах не значится", "Боевик", false);
    Afisha fourth = new Afisha(4, "Смерть на Ниле", "Боевик", false);
    Afisha fifth = new Afisha(5, "Наемник", "Боевик", false);
    Afisha sixth = new Afisha(6, "Потустороннее", "Детектив", true);
    Afisha seventh = new Afisha(7, "Номер Один", "Комедия", true);
    Afisha eighth = new Afisha(8, "Парни под прикрытием", "Боевик", false);
    Afisha ninth = new Afisha(9, "Хочу замуж", "Комедия", false);
    Afisha tenth = new Afisha(10, "Хочу замуж", "Комедия", false);

    @Test
    void shouldShowTenMovies() {

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);


        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, afisha.showMovies());
    }

    @Test
    void shouldShowMoviesUnderTen() {

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);

        Afisha[] expected = new Afisha[]{sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, afisha.showMovies());
    }
    @Test
    void shouldShowMoviesBelowTenCurrentMoviesLenght() {

        AfishaManager afisha = new AfishaManager(6);

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);

        Afisha[] expected = new Afisha[]{
                tenth, ninth, eighth, seventh, sixth, fifth};

        assertArrayEquals(expected, afisha.showMovies());
    }

}