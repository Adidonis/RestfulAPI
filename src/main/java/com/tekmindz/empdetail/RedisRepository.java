package com.tekmindz.empdetail;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RedisRepository implements CommandLineRunner{


    public static final String HASH_KEY = "eInfo";

    @Autowired
    public RedisTemplate template;
    
    public empInfo save(empInfo eInfo) {
        template.opsForHash().put(HASH_KEY,eInfo.getId(),eInfo);
        return eInfo;

    }
    public List<empInfo> findAll() {
        return template.opsForHash().values(HASH_KEY);
    }

    public empInfo findEmpInfoById(Long id)  {
        return (empInfo) template.opsForHash().get(HASH_KEY, id);
    }

    public String deleteEmpInfo(Long id) {
        template.opsForHash().delete(HASH_KEY, id);
        return "empInfo Removed";
    }
    @Override
    public void run(String... args) throws Exception {
    }


    
}
