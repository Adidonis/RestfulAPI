// package com.tekmindz.empdetail;

// import java.util.List;

// import javax.validation.Valid;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.cache.annotation.Cacheable;
// import org.springframework.cache.annotation.EnableCaching;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.validation.BindingResult;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/api")
// @EnableCaching
// public class empController {

//     @Autowired
//     empModel eModel;

//     @Autowired
//     empService eServ;

//     @Cacheable
//     @GetMapping("/emp")
//         public List<empInfo> findAll() {
//         return eModel.getempInfo();
//         }

//     @PostMapping("/emp")
//         public void add(@RequestBody @Valid empInfo eInfo, BindingResult Result){

//             if(Result.hasErrors()){
//                 System.out.println(Result);
//             }

//             eModel.setempInfo(eInfo);
//         }

//     @PutMapping("/emp")
//         public void update(@RequestBody empInfo eInfo) {
//             eModel.updateInfo(eInfo);
//         }

//     @DeleteMapping("/emp/{id}")
//         public ResponseEntity<HttpStatus> delete(@PathVariable String id) {
//             try {
//                 this.eModel.deleteInfo(Long.parseLong(id));
//                 return new ResponseEntity<>(HttpStatus.OK);
//                 } catch (Exception e) {
//                 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//     @RequestMapping(path = "/feedEmpData")
//         public void setData() throws Exception{
//             eServ.saveEmpData();
//         }

//         public void add(empModel eModel) {
//         }    
// }
