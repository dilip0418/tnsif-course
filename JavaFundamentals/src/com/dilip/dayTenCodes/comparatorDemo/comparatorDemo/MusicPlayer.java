package com.dilip.dayTenCodes.comparatorDemo.comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Song {
	private String name;
	private String author;
	private int duration;

	public Song(String name, String author, int duration) {
		super();
		this.name = name;
		this.author = author;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", author=" + author + ", duration=" + duration + "]";
	}

}

public class MusicPlayer {

	public static void main(String[] args) {
		ArrayList<Song> songs = new ArrayList<>();

		songs.add(new Song("Ishq hai Risk hai", "Rahh Fateh Ali Khan", 200));
		songs.add(new Song("Phir Bhi Tum Ko Chahunga", "Arijith Singh", 170));
		songs.add(new Song("Dusk till dawn", "Zyan Malik", 160));
		songs.add(new Song("Venom", "Eminem", 190));
		
		
		// sort by song name
		Comparator<Song> nameComparator = Comparator.comparing(Song::getName);
		Collections.sort(songs, nameComparator);
		System.out.println("Sort by song name:");
		display(songs);

		System.out.println();
		// sort by song author
		Comparator<Song> auhtorComparator = Comparator.comparing(Song::getAuthor);
		Collections.sort(songs, auhtorComparator);
		System.out.println("Sort by song author:");
		display(songs);
		
		System.out.println();
		// sort by song author
		Comparator<Song> durationComparator = Comparator.comparing(Song::getDuration);
		Collections.sort(songs, durationComparator);
		System.out.println("Sort by song duration:");
		display(songs);
		
	}
	
	public static void display(ArrayList<Song> songs) {
		for(Song song : songs)
			System.out.println(song);
	}

}
