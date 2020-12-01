class ReverseWordsProb {
    
    // 1ms solution
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder sp = new StringBuilder();
        int length = words.length;
        for (int i=length-1; i>0; i--) {
            if (!"".equals(words[i])) {
                sp.append(words[i]).append(" ");
            }
        }
        if (length > 0) {
            sp.append(words[0]);
        }
        return sp.toString();
    }
    
    // My solution
    public String reverseWords2(String s) {
        String[] words = s.trim().split("\\s+");
        String result = words[0];
        //StringBuilder result = new StringBuilder();
        for (int i = 1; i < words.length; i++) {
            result = words[i] + " " +  result;
        }
        return result;
    }
}
