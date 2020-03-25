/*
 * Developer: Brady Lange
 * Class: NameIterator
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
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
	// Default Constructor
	// ========================================================================
	/**
	 * 
	 */
	public NameIterator()
	{
		this.curPersonNode = null;
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
		return false;
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
		return null;
	}
}