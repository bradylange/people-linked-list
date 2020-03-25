/*
 * Developer: Brady Lange
 * Class: PeopleLinkedListLauncher
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.peoplelinkedlist.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.github.bradylange.peoplelinkedlist.linkedlist.PersonLinkedList;
import com.github.bradylange.peoplelinkedlist.people.Person;

public class PeopleLinkedListLauncher
{
	// ========================================================================
	// Main Method
	// ========================================================================
	/**
	 * Instantiates and sets up #.
	 * 
	 * @param args  the array of command line arguments to be passed
	 * 
	 * @version  1.0.0, 03/24/2020
	 * @since  1.0, 03/24/2020
	 */
	public static void main(String[] args)
	{
		
	}
	
	public static PersonLinkedList loadData(String filePath)
	{
		PersonLinkedList personLinkedList = new PersonLinkedList();
		ArrayList<Person> people = new ArrayList<Person>();
		Person tempPerson = new Person();
		String name;
		int age;
		BufferedReader inFile = new BufferedReader(new FileReader(filePath));
		String ln = inFile.readLine();
		StringTokenizer personTokenizer = new StringTokenizer(ln, "\\d\\w");
		while (personTokenizer.hasMoreTokens() == true)
		{
			StringTokenizer nameAgeTokenizer = new StringTokenizer(personTokenizer.nextToken(), ",");
			name = nameAgeTokenizer.nextToken();
			age = Integer.parseInt(nameAgeTokenizer.nextToken());
			tempPerson.setFirstName(name);
			people.add(tempPerson);
		}
		
	}
}
