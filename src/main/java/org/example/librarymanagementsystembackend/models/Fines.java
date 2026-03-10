package org.example.librarymanagementsystembackend.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fine_id")
    private int fineId;

    @Column(name = "overdue_date")
    private LocalDateTime overdueDate;

    @Column(name = "amount")
    private double amount;

    @Column(name = "paid")
    private Boolean paid;

    @Column(name = "paid_date")
    private LocalDateTime paidDate;

    @OneToOne
    @JoinColumn(name = "loan_id", referencedColumnName = "loan_id")
    private Loans loan;
}
