package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int pearls = 0;
		for(int i = 0; i < oysters.size();i++) {
			if(oysters.get(i)) {
				pearls++;
			}
		}
		System.out.println(pearls);
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double max = 0;
		for(int i = 0; i <peeps.size();i++) {
			if(peeps.get(i)>max) {
				max = peeps.get(i);
			}
		}
		return max;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		int longest = 0;
		String word = "";
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>longest) {
				word=words.get(i);
				longest=words.get(i).length();
			}
		}
		return word;
	}

	public static Object containsSOS(List<String> message2) {
		// TODO Auto-generated method stub
		for(int i = 0; i < message2.size(); i++) {
		if(message2.get(i).contains("... --- ...")) {
			return true;
		}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> arr) {
		// TODO Auto-generated method stub
		int length = arr.size();  
        Double temp;  
         for(int i=0; i < length; i++){  
            for(int j=1; j < (length-i); j++){  
               if(arr.get(j-1) > arr.get(j)){  
                  temp = arr.get(j-1);  
                  arr.set(j-1, arr.get(j));  
                  arr.set(j, temp);
                  
               }  
            }
         }
		return arr;
	}

	public static List<String>  sortDNA(List<String> arr) {
		// TODO Auto-generated method stub
		int length = arr.size();  
        String temp;  
         for(int i=0; i < length; i++){  
            for(int j=1; j < (length-i); j++){  
               if(arr.get(j-1).length() > arr.get(j).length()){  
                  temp = arr.get(j-1);  
                  arr.set(j-1, arr.get(j));  
                  arr.set(j, temp);
                  
               }  
            }
         }
		return arr;
	}

	public static List<String> sortWords(List<String> arr) {
		// TODO Auto-generated method stub
		int length = arr.size();  
        String temp;  
         for(int i=0; i < length; i++){  
            for(int j=1; j < (length-i); j++){  
               if(arr.get(j-1).compareTo(arr.get(j)) > 0){  
                  temp = arr.get(j-1);  
                  arr.set(j-1, arr.get(j));  
                  arr.set(j, temp);
                  
               }  
            }
         }
		return arr;
	}
}
