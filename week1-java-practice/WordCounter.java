import java.util.Arrays;

public class WordCounter{
    public static void main(String[]  args){
        String wordCounter = "Java is easy and Java is powerful";
        String[] arr = wordCounter.split(" ");
        String[] uniqueWord = new String[arr.length];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        int uniqueCount=0;
        for(int i=0;i<arr.length;i++){
            boolean alreadyExists = false;
            for(int k=0; k<uniqueCount;k++){
                if(uniqueWord[k].equals(arr[i])){
                    alreadyExists = true;
                    break;
                }
            }

            if(!alreadyExists){
                uniqueWord[uniqueCount]=arr[i];
                uniqueCount++;
            }
        }
        for (int i=0;i<uniqueCount;i++){
            int counter = 0;
            for(int j=0; j<arr.length;j++){
                if(uniqueWord[i].equals(arr[j])){
                counter++;
                }
            }
            System.out.println(uniqueWord[i]+"-"+counter);   
        }
    }
}