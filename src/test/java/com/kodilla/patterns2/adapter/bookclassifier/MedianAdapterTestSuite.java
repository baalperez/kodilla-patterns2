package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Book book1 = new Book("Stephen King", "Salem's Lot", 1978, "15");
        Book book2 = new Book("Stephen King", "Misery[", 1987, "156");
        Book book3 = new Book("Stephen King", "The Green Mile", 1996, "1233");
        Book book4 = new Book("Stephen King", "Doctor Sleep", 2013, "16");
        Book book5 = new Book("Stephen King", "Cujo", 1982, "556");
        Book book6 = new Book("Stephen King", "Hearts in Atlantis", 2000, "887");
        Book book7 = new Book("Stephen King", "The something", 1988, "6");
        Book book8 = new Book("Stephen King", "The tower", 2001, "996");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        bookSet.add(book7);
        bookSet.add(book8);

        // When
        MedianAdapter medianAdapter = new MedianAdapter();
        int result = medianAdapter.publicationYearMedian(bookSet);

        // Then
        assertEquals(1996, result);
    }
}
