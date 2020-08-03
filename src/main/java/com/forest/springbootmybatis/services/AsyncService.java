package com.forest.springbootmybatis.services;


import com.forest.springbootmybatis.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class AsyncService {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Async
    public void hi() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Data is being processed...");

        // opsForValue
        // opsForList
        // opsForSet
        // opsForHash
        // opsForZSet
        // opsForGeo
        // opsForHyperLogLog

        // RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
        // connection.flushDb();
        // connection.flushAll();

        redisTemplate.opsForValue().set("mykey", "Forest Gump");

        System.out.println(redisTemplate.opsForValue().get("mykey"));

        User user = new User("森林里的水凼凼", 28);
        //String json = new ObjectMapper().writeValueAsString(user);

        redisTemplate.opsForValue().set("user", user);

        User user1 = (User)redisTemplate.opsForValue().get("user");
        System.out.println(user1);
    }
}
