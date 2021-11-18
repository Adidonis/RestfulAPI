package com.tekmindz.empdetail;
// import java.io.BufferedReader;
// import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
// import java.util.ArrayList;
public class empStream {
    
    // public static void main(String [] args) {

    //     List<Integer> list1 = List.of(2,4,6,21,44,33);

    //     List<Integer> newList = list1.stream().filter(i -> i%2 == 0 ).collect(Collectors.toList());
    //     System.out.println(newList);

    //     List<Integer> newList1 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
    //     System.out.println(newList1);



    // }

    public static void main(String[] args) throws IOException {
        final var fileuserDiv = System.getProperty("user.dir");
        var filepath = fileuserDiv + "/empdetail/src/main/resources/dataFile.csv";
        Files.lines(Paths.get(filepath))
        .filter(line -> line.startsWith("Arpit,Arpit.mukherjee@tekmindz.com"))
        .forEach(System.out::println);
    }
    
    // public class ProcessCSVFile {
    //     public void main(String[] args) throws IOException {
    //         var filePath = System.getProperty("user.dir") + "empdetail/src/main/resources/dataFile.csv";
    //         var fileEntries = new ArrayList<String>();
    //         try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
    //                 String line = "";
    //                 while ((line = br.readLine()) != null)
    //                     fileEntries.add(line);
    //             } catch (IOException e) {
    //                 e.printStackTrace();
    //             }
    //         Files.lines(Paths.get(filePath))
    //             .filter(line -> line.startsWith("23,aman.chauhan@tekmindz.com"))
    //             .forEach(System.out::println);
    //     }
    // }
}