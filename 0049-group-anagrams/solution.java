class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int hash = hashCodeForAnagram(str);
            if(!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
                map.get(hash).add(str);
            }
            else {
                map.get(hash).add(str);
            }
        }

        List<List<String>> returnList = new ArrayList<>();

        for (Map.Entry<Integer, List<String>> keyval: map.entrySet()) {
            returnList.add(keyval.getValue());
        }

        return returnList;
    }

    public int hashCodeForAnagram(String word) {
        char[] wordChars = word.toLowerCase().toCharArray();
        Arrays.sort(wordChars);
        String sortedWord = new String(wordChars);
        return sortedWord.hashCode();
    }
}
