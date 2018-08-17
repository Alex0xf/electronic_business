package com.javasm.redis;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;


@Repository("redisDataSource")
//将当前的RedisDataSource类以redisDataSource的名字注入到spring容器中
public class RedisDataSource {  
  
	private static final Logger log = Logger.getLogger(RedisDataSource.class);
  
	@Autowired
  	private ShardedJedisPool shardedJedisPool;
  
	public ShardedJedis getRedisClient() {
	    try {  
	        ShardedJedis shardJedis = shardedJedisPool.getResource();
	        return shardJedis;  
	    } catch (Exception e) {  
	        log.error("getRedisClent error", e);  
	    }  
	    return null;  
	}  
  
	public void returnResource(ShardedJedis shardedJedis) {
	    shardedJedisPool.returnResourceObject(shardedJedis);  
	}  
  
	@SuppressWarnings("deprecation")
	public void returnResource(ShardedJedis shardedJedis, boolean broken) {
	 if (broken) {  
	        shardedJedisPool.returnBrokenResource(shardedJedis);  
	    } else {  
	        shardedJedisPool.returnResourceObject(shardedJedis);  
	    }  
	}  
  
}
