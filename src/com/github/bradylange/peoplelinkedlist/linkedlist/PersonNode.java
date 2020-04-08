/*
 * Developer: Brady Lange
 * Class: PersonNode
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2020 Brady Lange
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
		this.data = new Person(data.getFullName(), data.getAge());
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
	// Set Next Name Node Method
	// ========================================================================
	/**
	 * 
	 * @param node
	 */
	public void setNextNameNode(PersonNode node)
	{
		this.nextNameNode = node;
	}
	
	// ========================================================================
	// Set Next Age Node Method
	// ========================================================================
	/**
	 * 
	 * @param node
	 */
	public void setNextAgeNode(PersonNode node)
	{
		this.nextAgeNode = node;
	}
	
	// ========================================================================
	// Get Next Name Node Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public PersonNode getNextNameNode()
	{
		return this.nextNameNode;
	}
	
	// ========================================================================
	// Get Next Age Node Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public PersonNode getNextAgeNode()
	{
		return this.nextAgeNode;
	}
	
	// ========================================================================
	// Get Data Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public Person getData()
	{
		return this.data;
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