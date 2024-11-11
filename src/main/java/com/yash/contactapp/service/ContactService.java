package com.yash.contactapp.service;

import com.yash.contactapp.domain.Contact;

import java.util.List;

public interface ContactService {
    public void save(Contact c);
    public void update(Contact c);
    public void delete(Integer contactId);
    public void delete(Integer[] contactIds);

    public List<Contact> findUserContact(Integer userId);

    public List<Contact> findUserContacts(Integer userId, String txt);
}