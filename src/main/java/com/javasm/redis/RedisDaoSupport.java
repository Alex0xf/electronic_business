package com.javasm.redis;

/**
 * ClassName: RedisDaoSupport 
 * @Description: ��ȡredisTemplate��redisDataSource����
 * @author Mr.Wang
 * @date 2017��11��19��
 */
public class RedisDaoSupport {
	
	private RedisDataSource redisDataSource;  
	  
    private RedisTemplate redisTemplate;  
  
    public RedisDataSource getRedisDataSource() {  
        return redisDataSource;  
    }  
  
    public void setRedisDataSource(RedisDataSource redisDataSource) {  
        if (this.redisTemplate == null  ) {  
            this.redisTemplate = createRedisTemplate(redisDataSource);  
        }  
    }  
  
    public RedisTemplate getRedisTemplate() {  
        return redisTemplate;  
    }  
  
    public void setRedisTemplate(RedisTemplate redisTemplate) {  
        this.redisTemplate = redisTemplate;  
    }  
  
    protected RedisTemplate createRedisTemplate(  
            RedisDataSource redisDataSource) {  
        return new RedisTemplate(redisDataSource); 
    }  
}
