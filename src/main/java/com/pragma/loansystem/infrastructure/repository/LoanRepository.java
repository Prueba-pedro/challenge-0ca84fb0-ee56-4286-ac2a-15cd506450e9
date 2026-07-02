package com.pragma.loansystem.infrastructure.repository;

import com.pragma.loansystem.domain.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}