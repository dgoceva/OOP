package utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColorUtils {
	private Set<String> colors = new HashSet<>();
	
	public void add(String color) {
		colors.add(color);
	}
	
	public void remove(String color) {
		colors.remove(color);
	}
	
	public int size() {
		return colors.size();
	}
	
	public List<String> toList(){
		return new ArrayList<>(colors);
	}
	
	public boolean contains(String color) {
		return colors.contains(color);
	}
}
