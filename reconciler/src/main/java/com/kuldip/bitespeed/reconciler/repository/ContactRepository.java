package com.kuldip.bitespeed.reconciler.repository;

import com.kuldip.bitespeed.reconciler.Models.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    Interface for DB connections / operations
 */
@Repository
public interface ContactRepository extends JpaRepository<Contacts, Long> {

    List<Contacts> findByPhoneOrEmail(String phone, String email);


}
