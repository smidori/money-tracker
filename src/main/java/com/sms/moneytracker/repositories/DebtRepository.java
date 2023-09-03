package com.sms.moneytracker.repositories;

import com.sms.moneytracker.models.Debt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtRepository extends JpaRepository<Debt,Long> {

}
