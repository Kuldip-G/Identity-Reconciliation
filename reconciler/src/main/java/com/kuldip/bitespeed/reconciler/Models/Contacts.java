package com.kuldip.bitespeed.reconciler.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/*
    Class for contact POJO
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contacts {

    @Id
    @GeneratedValue
    private Long id;

    private String phone;

    private String email;

    private long linkedId;

    @Enumerated(EnumType.STRING)
    private Precedence linkedPrecedence;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
