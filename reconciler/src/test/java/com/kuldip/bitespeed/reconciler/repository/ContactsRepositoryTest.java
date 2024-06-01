package com.kuldip.bitespeed.reconciler.repository;

import com.kuldip.bitespeed.reconciler.Models.Contacts;
import com.kuldip.bitespeed.reconciler.Models.Precedence;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class ContactsRepositoryTest {

    @Autowired
    ContactRepository contactRepository;

    @Test
    void testDbChecksForContacts(){

        // Creating contact obj

        Contacts contact = Contacts.builder()
                .phone("9876543210")
                .email("a@b.com")
                .linkedPrecedence(Precedence.PRIMARY)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        // db connection will be tested
        contactRepository.save(contact);

        List<Contacts> contactsList = contactRepository.findByPhoneOrEmail("9876543210", "a@b.com");

        // other checks

        assertNotNull(contactsList);

        assertEquals(1, contactsList.size());
        assertEquals("9876543210" ,contactsList.get(0).getPhone());
        assertEquals("a@b.com", contactsList.get(0).getEmail());
    }


}
