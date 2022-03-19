package com.maerskrsk.repository;

import org.springframework.data.repository.CrudRepository;
import com.maerskrsk.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {
}
