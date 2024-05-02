package com.devgucci.database.services.impl;

import com.devgucci.database.domain.entities.BookEntity;
import com.devgucci.database.repositories.BookRepository;
import com.devgucci.database.services.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createUpdateBook(String isbn, BookEntity book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }


    @Override
    public Page<BookEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public void delete(String isbn) {

    }

    @Override
    public BookEntity partialUpdate(String isbn, BookEntity bookEntity) {
        return null;
    }

    @Override
    public boolean isExists(String isbn) {
        return false;
    }

    @Override
    public Optional<BookEntity> findOne(String isbn) {
        return Optional.empty();
    }

    @Override
    public List<BookEntity> findAll() {
        return List.of();
    }
}
