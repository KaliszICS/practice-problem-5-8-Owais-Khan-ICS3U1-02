/**
	* Lesson: Maps/HashMaps
	* Author: Owais Ali Khan
	* Date Created: May 7, 2026
 	* Date Last Modified: May 7, 2026
	*/


import java.util.HashMap;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
	    HashMap<String, Integer> map = new HashMap<String, Integer>();
	    for (int i = 0; i < names.length; i++) {
	        map.put(names[i], ages[i]);
	    }
	    return map;
	}
	
	public static void increaseAge(HashMap<String, Integer> map, String name) {
	    map.replace(name, map.get(name)+1);
	}
	
	public static void replaceName(HashMap<String, Integer> map, String name1, String name2) {
	    int value = map.remove(name1);
	    map.put(name2, value);
	}

}
