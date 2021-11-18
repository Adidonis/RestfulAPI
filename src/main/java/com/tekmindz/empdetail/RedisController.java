package com.tekmindz.empdetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/redisemp")
public class RedisController {
    
    @Autowired
    private RedisRepository redisRepo;

    @PostMapping
    public empInfo save(@RequestBody empInfo eInfo) {
        return redisRepo.save(eInfo);
    }

    @GetMapping
    public List<empInfo> getAllEmpInfo() {
        return redisRepo.findAll();
    }

    @GetMapping("/{id}")
    public empInfo findEmpInfo(@PathVariable Long id) {
        return redisRepo.findEmpInfoById(id);
    }
    
    @DeleteMapping("/{id}")
    public String remove(@PathVariable Long id)   {
    	return redisRepo.deleteEmpInfo(id);
	}

    
}
