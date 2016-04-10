package io.github.julianjupiter.springbootcrud.repository;

import io.github.julianjupiter.springbootcrud.domain.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer>{
    
}
