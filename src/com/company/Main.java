package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader is used to read input as 1 token instead of being separated by spaces
	//Scanner keyboard = new Scanner(System.in);

	ArrayList<String> movie = new ArrayList<String>(); //list called movie

	//String movieName;

	do {
        System.out.println("Enter favorite movie to add to list: ");
        String movieName = buf.readLine();
        //String movieName = keyboard.next(); //input is called movieName
        if (movie.contains(movieName)) {
            System.out.println("This title is already in the list.");
        } //if movieName is in movie list then repeat the loop


        else if (movieName.equalsIgnoreCase("q")) {
            break; //if movieName is one letter q then ends
        }
        else movie.add(movieName); //if not add movieName to movie list

    } while (true);
        System.out.println("Movie List: " + Arrays.toString(movie.toArray()));

    }

    }
