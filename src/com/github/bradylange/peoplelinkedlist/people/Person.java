/*
 * Developer: Brady Lange
 * Class: Person
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.peoplelinkedlist.people;

public class Person implements Comparable<Person>
{
	// Instance variables
	private String firstName;
	private String lastName;
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
		this.firstName = "";
		this.lastName = "";
		createFullName("", "");
		this.age = -1;
	}
	
	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public Person(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		createFullName(this.firstName, this.lastName);
		this.age = age;
	}
	
	// ========================================================================
	// Set First Name Method
	// ========================================================================
	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	// ========================================================================
	// Set Last Name Method
	// ========================================================================
	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	// ========================================================================
	// Create Full Name Method
	// ========================================================================
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public void createFullName(String firstName, String lastName)
	{
		this.fullName = firstName + " " + lastName;
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
	// Get First Name Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public String getFirstName()
	{
		return this.firstName;
	}
	
	// ========================================================================
	// Get Last Name Method
	// ========================================================================
	/**
	 * 
	 * @return
	 */
	public String getLastName()
	{
		return this.lastName;
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
		return firstName + " | " + lastName + " | " + age;
	}
}