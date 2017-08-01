//
//public class Solution {
//	public static int strStr(String haystack, String needle) {
//		if (needle.length() > haystack.length())
//			return -1;
//		int i = 0, j = 0;
//		String result = "";
//		int index;
//		while (i < haystack.length() - 1 && j <= needle.length() - 1) {
//			if(result.length() == 1){
//				index = haystack.indexOf(haystack.charAt(i));
//			}
//			if (haystack.charAt(i) == needle.charAt(j)) {
//				result = result + haystack.charAt(i);
//				i++;
//				j++;
//			} else {
//				result = "";
//				i++;
//				j = 0;
//			}
//		}
//		if (needle.equals(result)) {
//			return index;
//		} else {
//			return -1;
//		}
//
//	}
//	
//	/*
//    public class Solution {
//    public int strStr(String haystack, String needle) {
//        int l1 = haystack.length(), l2 = needle.length();
//        if (l1 < l2) {
//            return -1;
//        } else if (l2 == 0) {
//            return 0;
//        }
//        int threshold = l1 - l2;
//        for (int i = 0; i <= threshold; ++i) {
//            if (haystack.substring(i,i+l2).equals(needle)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
//	 */
//
//	public static void main(String[] args) {
//		int result = strStr("mathematics", "hema");
//		// System.out.println(result);
//		String s; s.m
//	}
//}