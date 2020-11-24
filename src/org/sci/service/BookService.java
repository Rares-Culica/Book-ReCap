package org.sci.service;

import org.sci.repo.AtlasRepo;
import org.sci.repo.BookRepo;

public class BookService {

    private BookRepo bookRepo;

        public BookService(BookRepo bookRepo){
            this.bookRepo = bookRepo;
        }


}
