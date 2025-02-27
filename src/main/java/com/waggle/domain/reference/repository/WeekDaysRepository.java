package com.waggle.domain.reference.repository;

import com.waggle.domain.reference.entity.WeekDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeekDaysRepository extends JpaRepository<WeekDays, Long> {
}
