// package com.tekmindz.empdetail;

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class empService {

//     @Autowired
//     private empRepository empRepo;
//     String line="";
//     public void saveEmpData() throws Exception {
//         try (BufferedReader br = new BufferedReader(new FileReader("empdetail/src/main/resources/dataFile.csv"))) {
//             while((line=br.readLine())!=null) {
//                 String [] data = line.split(",");
//                 empInfo e = new empInfo();


//                 e.setName(data[0]);
//                 e.setEmail(data[1]);
//                 e.setAge((24));
//                 e.setPhone(Double.valueOf(6357894125D));
//                 empRepo.save(e);
//             }

//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }