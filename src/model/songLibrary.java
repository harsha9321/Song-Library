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
	//String file_name = "Songlibrary.txt";
		songLibrary model;
		static LinkedList<Song> songList;
	    ObservableList<Song> obList;

		
		public songLibrary(){
			songList = new LinkedList<Song>();  
			obList =  FXCollections.observableArrayList();
			//read the txt file whenever a songLibrary is creates
		}
		//remove static
		public static int add(String name, String artist, String album, int year){
			Song newly_added_song = new Song(name, artist, album, year);
			songList.add(newly_added_song);	
			return 0;
			
			
		}
		
		public static void main(String args[]){
			
			songLibrary.add("dope", "Akash", "asd", 2232);
			Song temp;
			Iterator<Song> itr= songList.iterator();  
			  while(itr.hasNext()){  
			 temp = itr.next();
			   System.out.println(temp.toString()); 
		   }  
			  
			
		}

}
