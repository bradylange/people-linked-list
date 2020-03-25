/*
 * Developer: Brady Lange
 * Class: LinkedList
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.peoplelinkedlist.linkedlist;

import java.util.Iterator;

import com.github.bradylange.peoplelinkedlist.iterators.AgeIterator;
import com.github.bradylange.peoplelinkedlist.iterators.NameIterator;
import com.github.bradylange.peoplelinkedlist.people.Person;

public class PersonLinkedList implements Iterable<Person>
{
	// Instance variables
	private PersonNode firstNameNode;
	private PersonNode firstAgeNode;
	
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * 
	 */
	public PersonLinkedList()
	{
		this.firstNameNode = null;
		this.firstAgeNode = null;
	}
	
	// ========================================================================
	// Add Person Method
	// ========================================================================
	/**
	 * 
	 * @param person
	 */
	public void addPerson(Person person)
	{
		PersonNode newNode = new PersonNode(person);
		if (newNode.compareTo(firstNameNode) < 0)
		{
			
		}
		else if (newNode.compareTo(firstNameNode) > 0)
		{
			
		}
		else
		{
			
		}
		
		if (newNode.compareToAge(firstAgeNode) < 0)
		{
			
		}
		else if (newNode.compareToAge(firstAgeNode) > 0)
		{
			
		}
		else
		{
			
		}
	}
	
	// ========================================================================
	// Name Iterator Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	@Override
	public Iterator<Person> iterator()
	{
		NameIterator nameIterator = new NameIterator();
		return nameIterator;
	}
	
	// ========================================================================
	// Age Iterator Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public Iterator<Person> ageIterator()
	{
		AgeIterator ageIterator = new AgeIterator();
		return ageIterator;
	}
}