package com.sms.moneytracker.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Debt {
    public enum TypeDebt {
        BORROW, LEND
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String description;

    @NotNull
    private BigDecimal amount;

    @NotNull
    private TypeDebt type;

    @ManyToOne
    @NotNull
    private User user;

    @NotNull
    private LocalDate date;

}
