package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import java.util.*;


public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        if (bookSet.size() == 0) return 0;
        int[] years = new int[bookSet.size()];
        int n = 0;
        for (Book book : bookSet) {
            int bookPublicationYear = book.getPublicationYear();
            years[n] = bookPublicationYear;
            n++;
        }
        Arrays.sort(years);
        return years[years.length / 2];
    }
}
