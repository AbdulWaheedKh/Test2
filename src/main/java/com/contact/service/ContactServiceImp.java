package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;

@Service
public class ContactServiceImp implements ContactService {

	List<Contact> list = List.of(
			new Contact(1L, "ALI@gmail", "amit", 11L), 
			new Contact(2L, "A@gmail", "nom", 11L),
			new Contact(3L, "ALI@gmail", "amit", 13L),
			new Contact(4L, "ALI@gmail", "amit", 14L));

	@Override
	public List<Contact> getContactOfUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
