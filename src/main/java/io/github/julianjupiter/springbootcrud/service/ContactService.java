package io.github.julianjupiter.springbootcrud.service;

import io.github.julianjupiter.springbootcrud.domain.Contact;

public interface ContactService {
    Iterable<Contact> getAllContacts();
    Contact getContactById(Integer id);
    Contact saveContact(Contact contact);
    void deleteContact(Integer id);
}
