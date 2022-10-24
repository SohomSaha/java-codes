class Solution {
        List<Set<Character>> sets = new ArrayList<>();
        int maxLength = 0;
    public int maxLength(List<String> arr) {
        // to make sure that terms with existing letters are not considered
        // keep track of seen letters
        // because all need to be unique, use a set
        // if two sets are disjoint, then combine them, or not
        for(String a : arr){
            Set<Character> curr = new HashSet<>();
            for(char c : a.toCharArray()){
                curr.add(c);
            }
            sets.add(curr);
        }
        tryConcatenations(arr, 0, new HashSet<>());
        
        return maxLength;
    }
    
    private void tryConcatenations(List<String> arr, int index, Set<Character> currentSet){
        // update maxLength to current if greater
		// if any string is added, this recursive function will always be called with i+1 as index
		// so, maxlength will always be updated whenever a new set of characters is added to the result
        maxLength = Math.max(maxLength, currentSet.size());
        
        for(int i = index; i < arr.size(); i++){
            // check if the string itself contains repeated characters
            if(arr.get(i).length() != sets.get(i).size())
                continue;
            // take this string and split its characters (done in global "sets")
            // if there is any character in current sequence then don't add
            boolean repeats = false;
            for(char c : sets.get(i)){
                if(currentSet.contains(c)){
                    repeats = true;
                    break;
                }
            }
            // if unique characters then proceed
            if(!repeats){
                Set<Character> nextSet = new HashSet<>(currentSet);
                nextSet.addAll(sets.get(i));
				// calling the function with the current string added
                tryConcatenations(arr, i+1, nextSet);
            }
        }
        // the case where the current string is not added will be considered in all further iterations of this loop
    }
}