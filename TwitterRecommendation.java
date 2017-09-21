package com.cerner.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Recommend Tweets to an user taking into consideration following parameters:
 * followGraph, likeGraph, min threshold, targeted student
 * 
 * @author Aaquib
 *
 */
public class TwitterRecommendation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * followGroup_edges stores follow relationships (User - User)
		 */
		List<Tuple> followGraph = new ArrayList<Tuple>();
		Tuple tuple1 = new Tuple("A", "B");
		Tuple tuple2 = new Tuple("A", "C");
		Tuple tuple3 = new Tuple("B", "C");
		Tuple tuple4 = new Tuple("A", "D");
		Tuple tuple5 = new Tuple("A", "E");

		followGraph.add(tuple1);
		followGraph.add(tuple2);
		followGraph.add(tuple3);
		followGraph.add(tuple4);
		followGraph.add(tuple5);

		/**
		 * likeGraph_edges would store like relationships (User - Tweet)
		 */
		List<Tuple> likeGraph = new ArrayList<Tuple>();
		Tuple tuple11 = new Tuple("A", "T1");
		Tuple tuple12 = new Tuple("B", "T2");
		Tuple tuple13 = new Tuple("B", "T2");
		Tuple tuple14 = new Tuple("C", "T3");
		Tuple tuple15 = new Tuple("D", "T3");
		Tuple tuple16 = new Tuple("E", "T3");
		Tuple tuple17 = new Tuple("H", "T10");
		Tuple tuple18 = new Tuple("I", "T10");
		Tuple tuple19 = new Tuple("J", "T10");
		
		likeGraph.add(tuple11);
		likeGraph.add(tuple12);
		likeGraph.add(tuple13);
		likeGraph.add(tuple14);
		likeGraph.add(tuple15);
		likeGraph.add(tuple16);
		likeGraph.add(tuple17);
		likeGraph.add(tuple18);
		likeGraph.add(tuple19);
		
		String targetUser = "A";
		int minLikeThreshold = 2;

		List<String> recommendedTweets = getRecommendedTweets(followGraph, likeGraph, targetUser, minLikeThreshold);
		System.out.println("Target User: A" + "\nMin Threshold: 2 rakha\n" +
		"Recommended Tweets: " + recommendedTweets);

	}

	private static List<String> getRecommendedTweets(List<Tuple> followGraph, List<Tuple> likeGraph, String targetUser,
			int minLikeThreshold) {

		List<String> recommendedTweets = new ArrayList();
		List<String> targetUserFollowList = new ArrayList();
		/**
		 * Get the followers of the target USer and store them in a list
		 */
		for (int i = 0; i < followGraph.size(); i++) {
			if (followGraph.get(i).x == targetUser)
				targetUserFollowList.add(followGraph.get(i).y);
		}
		
		/**
		 * Build a HashMap with <K, V> pairs as <Tweet, list{persons who likd the tweet}>
		 */
		Map<String, List<String>> likesByTweetMap = new HashMap();
		for (int i = 0; i < likeGraph.size(); i++) {
			List<String> personsLiked = likesByTweetMap.get(likeGraph.get(i).y);
			if (personsLiked == null) {
				personsLiked = new ArrayList<String>();
				likesByTweetMap.put(likeGraph.get(i).y, personsLiked);
			}
			personsLiked.add(likeGraph.get(i).x);
		}
		
	//	printTweetMap(likesByTweetMap);
		
		/**
		 * For each tweet, check whether the followers of the target USer have liked or not. and If they have 
		 * liked enough(>= minThreshold) add the tweet to the recommendation engine.
		 */
		for(Map.Entry<String, List<String>> m : likesByTweetMap.entrySet()){
			List<String> tempList = m.getValue();
			tempList.retainAll(targetUserFollowList);
			if(tempList.size() >= minLikeThreshold){
				recommendedTweets.add(m.getKey());
			}
		}
		
	//    printTweetMap(likesByTweetMap);

		return recommendedTweets;
	}

	/**
	 * Method to print the HashMap
	 * @param likesByTweetMap
	 */
	private static void printTweetMap(Map<String, List<String>> likesByTweetMap) {
		for (Map.Entry<String, List<String>> m : likesByTweetMap.entrySet()) {
			System.out.println(m.getKey() + " -> " + m.getValue());
		}
	}

}
