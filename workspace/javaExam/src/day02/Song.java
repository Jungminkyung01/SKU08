package day02;

public class Song {
	
	private String title;
	private String artist;
	private String allbum;
	private String composer;
	private int year;
	private int track;

	public void setTitle(String t) {
		title = t;
	}
	
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAllbum() {
		return allbum;
	}

	public void setAllbum(String allbum) {
		this.allbum = allbum;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show() {
		System.out.println("æ∆¿Ã¿Ø");
	}
	
}
