package com.books.springbootLibrary.dao;

import com.books.springbootLibrary.entity.History;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface HistoryRepository extends JpaRepository<History, Long> {
    Page<History> findBooksByUserEmail(@RequestParam("email") String userEmail, Pageable pageable);
}
