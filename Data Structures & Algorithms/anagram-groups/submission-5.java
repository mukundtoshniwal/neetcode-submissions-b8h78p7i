class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagrams = new HashMap();
        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(anagrams.containsKey(sorted)){
                anagrams.get(sorted).add(str);
            }
            else{
                List<String> list = new ArrayList<String>();
                list.add(str);
                anagrams.put(sorted,list);
            }
        }
    return new ArrayList<List<String>>(anagrams.values());
    }
}
