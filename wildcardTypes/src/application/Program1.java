package application;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		
		//List<Object> myObjs = new ArrayList<>();
		List<?> myObjs = new ArrayList<>();
		List<Integer> myNumbers = new ArrayList<>();
		
		myObjs = myNumbers;

	}

}
