package model;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private int year;
	
	public Song(String t, String art, String alb, int y) {
		this.title = t;
		this.artist = art;
		this.album = alb;
		this.year = y;
	}
	
	public Song(String t, String art) {
		this(t, art, "", -1);
	}
	
	public Song(String t, String art, String alb) {
		this(t, art, alb, -1);
	}
	
	public Song(String t, String art, int y) {
		this(t, art, "", y);
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public String getAlbum() {
		return this.album;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public void setArtist(String art) {
		this.artist = art;
	}
	
	public void setAlbum(String alb) {
		this.album = alb;
	}
	
	public void setYear(int y) {
		this.year = y;
	}
	
	public String toString() {
		String s = getTitle() + "=" +
					getArtist() + "=" +
					getAlbum() + "=" +
					getYear();
		return s;
	}
	
	public String getString(){	//for sorting returns back Title + Artist
        return (this.getTitle() + "\t" + this.getArtist()).toLowerCase();
	}
	public int compareTo(Song new_song){			//for sorting returns back number for sorting 
		return this.getString().compareTo(new_song.getString());
		
	}
}
