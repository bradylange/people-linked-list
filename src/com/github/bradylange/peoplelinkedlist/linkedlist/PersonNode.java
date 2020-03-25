/*
 * Developer: Brady Lange
 * Class: PersonNode
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.peoplelinkedlist.linkedlist;

import com.github.bradylange.peoplelinkedlist.people.Person;

public class PersonNode implements Comparable<PersonNode>
{
	private PersonNode nextNameNode;
	private PersonNode nextAgeNode;
	private Person data;
	
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * 
	 */
	public PersonNode()
	{
		this.nextNameNode = null;
		this.nextAgeNode = null;
		this.data = null;
	}
	
	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * 
	 * @param data
	 */
	public PersonNode(Person data)
	{
		this.data.setFirstName(data.getFirstName());
		this.data.setLastName(data.getLastName());
		this.data.setAge(data.getAge());
	}
	
	// ========================================================================
	// Has Next Name Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public boolean hasNextName()
	{
		if (this.nextNameNode == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	// ========================================================================
	// Has Next Age Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public boolean hasNextAge()
	{
		if (this.nextAgeNode == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	// ========================================================================
	// Get Next Name Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public PersonNode getNextName()
	{
		return this.nextAgeNode;
	}
	
	// ========================================================================
	// get Next Age Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public PersonNode getNextAge()
	{
		return this.nextAgeNode;
	}
	
	// ========================================================================
	// Compare to Name Method
	// ========================================================================
	/**
	 * 
	 * @param personNode
	 * @return
	 */
	@Override
	public int compareTo(PersonNode personNode)
	{
		return this.data.compareTo(personNode.data);
	}
	
	// ========================================================================
	// Compare to Age Method
	// ========================================================================
	/**
	 * 
	 * @param personNode
	 * @return
	 */
	public int compareToAge(PersonNode personNode)
	{
		return this.data.compareToAge(personNode.data);
	}
}