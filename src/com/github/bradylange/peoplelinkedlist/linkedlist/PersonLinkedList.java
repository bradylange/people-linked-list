/*
 * Developer: Brady Lange
 * Class: LinkedList
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2020 Brady Lange
 */

package com.github.bradylange.peoplelinkedlist.linkedlist;

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
		
		if (isEmpty() == true || this.firstNameNode.compareTo(newNode) > 0 
				&& this.firstAgeNode.compareToAge(newNode) > 0)
		{
			newNode.setNextNameNode(this.firstNameNode);
			newNode.setNextAgeNode(this.firstAgeNode);
			this.firstNameNode = newNode;
			this.firstAgeNode = newNode;
		}
		else
		{
			addPersonName(newNode);
			addPersonAge(newNode);	
		}
	}
	
	// ========================================================================
	// Add Person Name Method
	// ========================================================================
	/**
	 * 
	 * @param newNode
	 */
	private void addPersonName(PersonNode newNode)
	{
		PersonNode currentNode = this.firstNameNode;
		while (currentNode.getNextNameNode() != null 
				&& currentNode.getNextNameNode().compareTo(newNode) < 0)
		{
			currentNode = currentNode.getNextNameNode();
		}
		
		newNode.setNextNameNode(currentNode.getNextNameNode());
		currentNode.setNextNameNode(newNode);
	}
	
	// ========================================================================
	// Add Person Age Method
	// ========================================================================
	/**
	 * 
	 * @param newNode
	 */
	private void addPersonAge(PersonNode newNode)
	{
		PersonNode currentNode = this.firstAgeNode;
		while (currentNode.getNextAgeNode() != null && 
				currentNode.getNextAgeNode().compareToAge(newNode) < 0)
		{
			currentNode = currentNode.getNextAgeNode();
		}
		
		newNode.setNextAgeNode(currentNode.getNextAgeNode());
		currentNode.setNextAgeNode(newNode);
	}
	
	// ========================================================================
	// Name Iterator Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	@Override
	public NameIterator iterator()
	{
		NameIterator nameIterator = new NameIterator(this.firstNameNode);
		return nameIterator;
	}
	
	// ========================================================================
	// Age Iterator Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public AgeIterator ageIterator()
	{
		AgeIterator ageIterator = new AgeIterator(this.firstAgeNode);
		return ageIterator;
	}
	
	// ========================================================================
	// Is Empty Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		if (this.firstNameNode == null || this.firstAgeNode == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}