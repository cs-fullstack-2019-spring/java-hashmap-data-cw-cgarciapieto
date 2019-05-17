import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;



public class Main {

    private static HashMap<String, String> defs = new HashMap<String, String>();

    public static void main(String[] args) {
        File myFile = new File("/home/student/CodeSchool/IdeaProjects/Java/2019-15-17/classwork/java-hashmap-data-cw-cgarciapieto/data.txt");

        Scanner myReader = null;

        try {
            myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String txt = myReader.nextLine();
                String[] parts = txt.split(",");
//                System.out.println(parts);
                defs.put(parts[0], parts[1]);
            }
//            for (String i : defs.keySet()) {
//                System.out.println(i + ":" + defs.get(i));
//            }
        } Scanner reader = new Scanner(System.in);
        System.out.print("Enter a word");
        String defWord = reader.nextLine().trim().toLowerCase();
        String response = defs.get(defWord) != null ? defs.get(defWord) : "Word not found";
        System.out.println(response);

    catch (FileNotFoundException e){
            e.printStackTrace();
        }






    }
}
