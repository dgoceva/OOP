package utils;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {
	public static int sum(List<Integer> data) {
		int result=0;
		if (data!=null) {
			for(int element : data) {
				result += element;
			}
		}
		return result;
	}
	
	public static List<Integer> possitive(List<Integer> data){
		List<Integer> result = new ArrayList<>();
		
		for(int i=0;i<data.size();++i) {
			if (data.get(i)>0) {
				result.add(data.get(i));
			}
		}
		
		return result;
	}

	public static List<Integer> negative(List<Integer> data){
		List<Integer> result = new ArrayList<>();
		
		for(int element : data) {
			if (element<0) {
				result.add(element);
			}
		}
		
		return result;
	}
}
