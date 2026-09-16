package com.tori413.gbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tori413.gbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
