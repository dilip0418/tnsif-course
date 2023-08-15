package com.dilip.dayTenCodes.comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie {
	private String name;
	private double budget;
	private float rating;

	public Movie(String name, double budget, float rating) {
		super();
		this.name = name;
		this.budget = budget;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public float getRating() {
		return rating;
	}

	// sort by single attribute
	public static Comparator<Movie> nameComparator = Comparator.comparing(Movie::getName);
	public static Comparator<Movie> budgetComparator = Comparator.comparing(Movie::getBudget);
	public static Comparator<Movie> ratingComparator = Comparator.comparing(Movie::getRating);

	/*
	 * sort by multiple attributes; here the movies are sorted by budget first and
	 * if the movies have same budget then compare the rating in reverse natural
	 * ordering i.e descending order
	 */
	public static Comparator<Movie> budgetRatingComparator = budgetComparator.thenComparing(Movie::getRating,
			Comparator.reverseOrder());

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", budget=" + budget + ", rating=" + rating + "]\n";
	}

}

public class ComparatorExample2 {

	public static void main(String[] args) {

		List<Movie> moviesList = new ArrayList<>();

		moviesList.add(new Movie("FalakNuma Das", 4000000, 4.2f));
		moviesList.add(new Movie("Bahubali-The Beginning", 40000000, 4.5f));
		moviesList.add(new Movie("Raadhe Shyam", 30000000, 4.0f));
		moviesList.add(new Movie("Hushaaru", 800000, 4.3f));
		moviesList.add(new Movie("3", 800000, 5.0f));
		moviesList.add(new Movie("Shershah", 400000, 4.9f));
		moviesList.add(new Movie("Gajini", 300000, 4.3f));

		// sort by movie name
//		Collections.sort(moviesList, Movie.nameComparator);
		moviesList.sort(Movie.nameComparator);
		System.out.println("Movies Sort by there name:");
		System.out.println(moviesList);

		System.out.println();

		// sort by budget and then by rating in descending order
		System.out.println("Movies Sort by there budget and rating:");
		Collections.sort(moviesList, Movie.budgetRatingComparator);
		System.out.println(moviesList);

		System.out.println();

		// using lambda expression to sort movie by the length of the movie name
		System.out.println("Movies Sort by the lenght of the movies name:");
		Collections.sort(moviesList, (m1, m2) -> {
			return m1.getName().length() - m2.getName().length();
		});
		System.out.println(moviesList);

	}

}
