/*
 * Developer: Brady Lange
 * Class: NameIterator
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2020 Brady Lange
 */

package com.github.bradylange.peoplelinkedlist.iterators;

import java.util.Iterator;

import com.github.bradylange.peoplelinkedlist.linkedlist.PersonNode;
import com.github.bradylange.peoplelinkedlist.people.Person;

public class NameIterator implements Iterator<Person>
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
	public NameIterator(PersonNode node)
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
		this.curPersonNode = this.curPersonNode.getNextNameNode();
		return currentPersonData;
	}
}