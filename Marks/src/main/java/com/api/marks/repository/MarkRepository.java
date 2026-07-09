package com.api.marks.repository;

import com.api.marks.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepository extends JpaRepository<Mark,Integer> {
}
