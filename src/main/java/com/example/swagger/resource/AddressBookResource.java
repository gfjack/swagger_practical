package com.example.swagger.resource;

import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/rest/address")
public class AddressBookResource {

  ConcurrentHashMap<String, Contact> contacts = new ConcurrentHashMap<>();

  @GetMapping("/{id}")
  public Contact getContact(
      @ApiParam(value = "id that you wanted to lookup", required = true) @PathVariable
          final String id) {
    return contacts.get(id);
  }

  @GetMapping("/")
  public List<Contact> getAllContacts() {
    return new ArrayList<Contact>(contacts.values());
  }

  @PostMapping("/")
  public Contact addContact(@RequestBody Contact contact) {
    contacts.put(contact.getId(), contact);
    return contact;
  }
}
