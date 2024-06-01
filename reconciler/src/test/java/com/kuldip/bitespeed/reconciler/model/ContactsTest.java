package com.kuldip.bitespeed.reconciler.model;

import com.kuldip.bitespeed.reconciler.Models.Contacts;
import com.kuldip.bitespeed.reconciler.Models.Precedence;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.time.LocalDateTime;


public class ContactsTest {

    @Test
    void testContactObject() {


        Contacts contact = Contacts.builder()
                .phone("9876543210")
                .email("a@b.com")
                .linkedPrecedence(Precedence.PRIMARY)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();


        assertNotNull(contact);
        assertEquals("9876543210", contact.getPhone());
        assertEquals("a@b.com", contact.getEmail());
        assertEquals(Precedence.PRIMARY , contact.getLinkedPrecedence());


    }
}
