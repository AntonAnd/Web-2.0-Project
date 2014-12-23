package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the window database table.
 * 
 */
@Entity
@NamedQuery(name="Window.findAll", query="SELECT w FROM Window w")
public class Window implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="w_id")
	private int wId;

	@Column(name="calendar_id")
	private int calendarId;

	@Temporal(TemporalType.DATE)
	private Date date;

	private String url;

	public Window() {
	}

	public int getWId() {
		return this.wId;
	}

	public void setWId(int wId) {
		this.wId = wId;
	}

	public int getCalendarId() {
		return this.calendarId;
	}

	public void setCalendarId(int calendarId) {
		this.calendarId = calendarId;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}