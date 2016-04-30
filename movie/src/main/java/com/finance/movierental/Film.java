package com.finance.movierental;

public class Film implements Comparable<Film> {
	private final Integer Id;

	private final String name;

	private final Integer length;

	private final String genre;

	private final Integer year;

	public Film(final Integer id, final String name, final Integer length, final String genre, final Integer year) {
		super();
		this.Id = id;
		this.name = name;
		this.length = length;
		this.genre = genre;
		this.year = year;
	}

	public Integer getId() {
		return this.Id;
	}

	public String getName() {
		return this.name;
	}

	public Integer getLength() {
		return this.length;
	}

	public String getGenre() {
		return this.genre;
	}

	public Integer getYear() {
		return this.year;
	}

	@Override
	public int compareTo(final Film film) {
		if (film.getName() == null) {
			return 1;
		}
		final int compare = this.getName().compareTo(film.getName());
		if (compare != 0) {
			return compare;
		} else if (this.length > film.length) {
			return 1;
		} else if (this.length < film.length) {
			return -1;
		} else {
			return 0;
		}
	}

}
