import java.util.HashMap;
import java.util.Map;

public class CountCommonWords {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> temp = new HashMap<>();
        Map<String,Integer> temp1 = new HashMap<>();

        for(int i=0; i<words1.length; i++){
            if(temp.containsKey(words1[i])){
                temp.put(words1[i],0);
            }else{
                temp.put(words1[i],1);
            }
        }

        for(int i=0; i<words2.length; i++){
            if(temp1.containsKey(words2[i])){
                temp1.put(words2[i],0);
            }else{
                temp1.put(words2[i],1);
            }
        }

        int out = 0;
        for(int i=0; i<words2.length; i++){
            if(temp.containsKey(words2[i]) && temp.get(words2[i])==1 && temp1.get(words2[i])==1){
                out++;
            }
        }
        return out;
    }
}
