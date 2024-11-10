package com.yash.contactapp.service;

import com.yash.contactapp.domain.Contact;

import java.util.List;

public interface ContactService {

    public void save(Contact c);

    public void update(Contact c);

    public void delete(Integer contactId);

    public void delete(Integer[] contactIds);

    /**
     * Return all contacts of User who loged in
     * @param userId
     * @return
     */
    public List<Contact> findUserContact(Integer userId);

    /**
     * user can serach specific contact by giving txt
     * @param userId
     * @param txt
     * @return
     */
    public List<Contact> findUserContact(Integer userId, String txt);
}
