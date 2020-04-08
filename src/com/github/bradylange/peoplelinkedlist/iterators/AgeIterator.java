/*
 * Developer: Brady Lange
 * Class: AgeIterator
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2020 Brady Lange
 */

package com.github.bradylange.peoplelinkedlist.iterators;

import java.util.Iterator;

import com.github.bradylange.peoplelinkedlist.linkedlist.PersonNode;
import com.github.bradylange.peoplelinkedlist.people.Person;

public class AgeIterator implements Iterator<Person>
{
	// Instance variables
	private PersonNode curPersonNode;
	
	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * 
	 * @param node
	 */
	public AgeIterator(PersonNode node)
	{
		this.curPersonNode = node;
	}
	
	// ========================================================================
	// Has Next Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	@Override
	public boolean hasNext()
	{
		return curPersonNode != null;
	}

	// ========================================================================
	// Next Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	@Override
	public Person next()
	{
		Person currentPersonData = this.curPersonNode.getData();
		this.curPersonNode = this.curPersonNode.getNextAgeNode();
		return currentPersonData;
	}
}