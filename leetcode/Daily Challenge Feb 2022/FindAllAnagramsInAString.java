public class FindAllAnagramsInAString{
	public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length())return new ArrayList<>();
        int sFre[]=new int[26];
        int pFre[]=new int[26];
        for(char ch: p.toCharArray()){
            pFre[(int)(ch-'a')]++;
        }
        List<Integer> out= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            sFre[s.charAt(i)-'a']++;
            if(i>=p.length()){
                char ch=s.charAt(i-p.length());
                sFre[ch-'a']--;
            }
            if(Arrays.equals(sFre,pFre)){
                out.add(i-p.length()+1);
            }
        }
        return out;
    }
}