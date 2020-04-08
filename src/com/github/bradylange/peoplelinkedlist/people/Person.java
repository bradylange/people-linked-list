/*
 * Developer: Brady Lange
 * Class: Person
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2020 Brady Lange
 */

package com.github.bradylange.peoplelinkedlist.people;

public class Person implements Comparable<Person>
{
	// Instance variables
	private String fullName;
	private int age;
	
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * 
	 */
	public Person()
	{
		this.fullName = "";
		this.age = -1;
	}
	
	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * 
	 * @param fullName
	 * @param age
	 */
	public Person(String fullName, int age)
	{
		this.fullName = fullName;
		this.age = age;
	}
	
	// ========================================================================
	// Set Full Name Method
	// ========================================================================
	/**
	 * 
	 * @param fullName
	 */
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
	
	// ========================================================================
	// Set Age Method
	// ========================================================================
	/**
	 * 
	 * @param age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	// ========================================================================
	// Get Full Name Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public String getFullName()
	{
		return this.fullName;
	}
	
	// ========================================================================
	// Get Age Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public int getAge()
	{
		return this.age;
	}
	
	// ========================================================================
	// Compare to Name Method
	// ========================================================================
	/**
	 * 
	 * @param person
	 * @return
	 */
	@Override
	public int compareTo(Person person)
	{
		if (this.fullName.compareTo(person.fullName) < 0)
		{
			return -1;
		}
		else if (this.fullName.compareTo(person.fullName) > 0)
		{
			return 1;
		}
		else
		{
			return compareToAge(person);
		}
	}
	
	// ========================================================================
	// Compare to Age Method
	// ========================================================================
	/**
	 * 
	 * @param person
	 * @return
	 */
	public int compareToAge(Person person)
	{
		if (this.age < person.age)
		{
			return -1;
		}
		else if (this.age > person.age)
		{
			return 1;
		}
		else
		{
			return compareTo(person);
		}
	}
	
	// ========================================================================
	// To String Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public String toString()
	{
		return fullName + " | " + age;
	}
}