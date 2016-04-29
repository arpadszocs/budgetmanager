package com.finance.movierental;

import java.util.Date;

public class Rental {
	private final Integer Id;

	private final Integer filmId;

	private final Integer userId;

	private final Date startDate;

	private final Date endDate;

	public Rental(final Integer id, final Integer filmId, final Integer userId, final Date startDate,
			final Date endDate) {
		super();
		this.Id = id;
		this.filmId = filmId;
		this.userId = userId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getId() {
		return this.Id;
	}

	public Integer getFilmId() {
		return this.filmId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}
}
