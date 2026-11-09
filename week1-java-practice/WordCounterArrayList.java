import java.util.ArrayList;
import java.util.HashMap;

public class WordCounterArrayList{
    public static void main(String[] args){
        String wordCounter = "Java is easy and Java is powerful";
        String[] arr = wordCounter.split(" ");

        HashMap<String,Integer> counts = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            if(counts.containsKey(arr[i])){
                counts.put(arr[i],counts.get(arr[i])+1);
            }else{
                counts.put(arr[i],1);
            }
        }
        System.out.println(counts);
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            if(!names.contains(arr[i])){
                names.add(arr[i]);
            }
        }
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.contains("easy"));
    }
}