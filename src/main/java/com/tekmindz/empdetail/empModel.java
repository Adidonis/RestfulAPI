// package com.tekmindz.empdetail;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class empModel {

//     @Autowired 
// 	private empRepository empRepo;


// 	public List<empInfo> getempInfo(){
// 		return empRepo.findAll();
// 	}

// 	public void getempInfobyId(Long id) {
// 		empRepo.findById((id));
// 	}
	
// 	public void setempInfo(empInfo eInfo) {
// 		empRepo.save(eInfo);
// 	}

// 	public void updateInfo(empInfo eInfo) {
// 		empRepo.save(eInfo);
		
// 	}
	
// 	public void deleteInfo(Long parseLong) {
// 		empInfo entity =  empRepo.getById(parseLong);
// 		empRepo.delete(entity);
// 	}
		
//     public static void add(empInfo eInfo)  {
//     }

//     public static void update(empInfo eInfo) {
//     }

// 	public static void delete(empInfo eInfo) {
//     }
// }
