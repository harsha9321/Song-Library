package model;

import java.util.Iterator;
import java.util.LinkedList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.*;
import java.text.Collator;
import java.util.*;
import javafx.collections.ObservableList;
import java.text.Collator;

public class songLibrary {
	// String file_name = "Songlibrary.txt";
	songLibrary model;
	LinkedList<Song> songList;
	static ObservableList<Song> ob_list;

	public songLibrary() {
		songList = new LinkedList<Song>();
		ob_list = FXCollections.observableArrayList();
		// read the txt file whenever a songLibrary is creates
	}

	// remove static
	public static int addlibrary(String name, String artist, String album, int year){
		//1--> adding to an empty observable list
		//2--> adding in the middle of an observable list
		//3-- >adding at the end of an observable list
		//returning the index of the newly added node(new_song)
		
		Song new_song  = new Song(name, artist,album, year);
		//1--->
		if(ob_list == null){
			ob_list.add(new_song);
			return 0;
		}
		//2-->
		else {
			for(int i = 0 ; i < ob_list.size(); i++){
				 if (new_song.compareTo(ob_list.get(i))< 0){
					 ob_list.add(i,new_song);
					 return i;
				 }
			}
		}
		//3-->
		ob_list.add(new_song);
		return ob_list.size()-1;
	}
	
	public static int update(int index_tochange, String name, String artist, String album, int year){
		//deleting then adding 
		//or changing the content and then sorting it again ~ more work
		//return the index of the newly settled node(new_song)
		
		return 0;
	}
	
	
	
	static void print(){
		for(int i = 0 ; i < ob_list.size(); i++){
			System.out.println(ob_list.get(i).toString());
		}
		
	}
	public static void main(String args[]) {
		songLibrary test = new songLibrary();
		test.addlibrary("A", "z", "asd", 1993);
		test.addlibrary("A", "A", "asd", 1993);
	
		print();
		
		

	}

}
