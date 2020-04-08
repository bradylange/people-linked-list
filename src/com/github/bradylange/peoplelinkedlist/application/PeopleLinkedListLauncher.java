/*
 * Developer: Brady Lange
 * Class: PeopleLinkedListLauncher
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2020 Brady Lange
 */

package com.github.bradylange.peoplelinkedlist.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.github.bradylange.peoplelinkedlist.iterators.AgeIterator;
import com.github.bradylange.peoplelinkedlist.iterators.NameIterator;
import com.github.bradylange.peoplelinkedlist.linkedlist.PersonLinkedList;
import com.github.bradylange.peoplelinkedlist.people.Person;

public class PeopleLinkedListLauncher
{
	// ========================================================================
	// Main Method
	// ========================================================================
	/**
	 * Instantiates and sets up a {@link PersonLinkedList} that has the ability
	 * to iterate by alphabetically ordered names or numerically ascending
	 * ages.
	 * 
	 * @param args  the array of command line arguments to be passed
	 * 
	 * @throws IOException
	 * 
	 * @version  1.0.0, 04/07/2020
	 * @since  1.0, 04/07/2020
	 */
	public static void main(String[] args) throws IOException
	{
		PersonLinkedList peopleList = loadData("./data/people.txt");
		System.out.println("Print by Alphabetical Order of Name:");
		System.out.println("************************************************");
		printLinkedListByName(peopleList);
		System.out.println("\nPrint by Numerical Ascending Order of Age:");
		System.out.println("************************************************");
		printLinkedListByAge(peopleList);
	}
	
	// ========================================================================
	// Person Linked List Method
	// ========================================================================
	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public static PersonLinkedList loadData(String filePath) throws IOException
	{
		PersonLinkedList peopleLinkedList = new PersonLinkedList();
		Person tempPerson;
		String[] lineWords;
		String fullName;
		int age;
		BufferedReader inFile = new BufferedReader(new FileReader(filePath));
		String ln = inFile.readLine();
		while (ln != null)
		{
			lineWords = ln.split(", ");
			fullName = lineWords[0];
			age = Integer.parseInt(lineWords[1]);
			tempPerson = new Person(fullName, age);
			peopleLinkedList.addPerson(tempPerson);
			ln = inFile.readLine();
		}
		inFile.close();
		return peopleLinkedList;
	}
	
	// ========================================================================
	// Print Linked List By Name Method
	// ========================================================================
	/**
	 * 
	 * @param pplLinkedList
	 */
	public static void printLinkedListByName(PersonLinkedList pplLinkedList)
	{
		NameIterator nameIterator = pplLinkedList.iterator();
		while (nameIterator.hasNext())
		{
			System.out.println(nameIterator.next());
		}
	}
	
	// ========================================================================
	// Print Linked List By Age Method
	// ========================================================================
	/**
	 * 
	 * @param pplLinkedList
	 */
	public static void printLinkedListByAge(PersonLinkedList pplLinkedList)
	{
		AgeIterator ageIterator = pplLinkedList.ageIterator();
		while (ageIterator.hasNext())
		{
			System.out.println(ageIterator.next());
		}
	}
}