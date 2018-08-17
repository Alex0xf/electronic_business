package com.javasm.redis;

import redis.clients.jedis.Tuple;

import java.util.List;
import java.util.Map;
import java.util.Set;


public interface RedisDao {

	/**
	 * 
	 * @Title: lpush
	 * @Description: ????List???????
	 * @param @param key
	 * @param @param value
	 * @param @return
	 * @return Long
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Long lpush(String key, T value);

	/**
	 * 
	 * @Title: lrem
	 * @Description: ???List?????е?????
	 * @param @param key
	 * @param @param value
	 * @param @return
	 * @return Long
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Long lrem(String key, T value);

	/**
	 * 
	 * @Title: lrange
	 * @Description: ?????????key??list??start??end???????
	 * @param @param key
	 * @param @param start
	 * @param @param end
	 * @param @param c
	 * @param @return
	 * @param @throws Exception
	 * @return List<String>
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> List<String> lrange(String key, Long start, Long end) throws Exception;

	/**
	 * @Title: del
	 * @Description: ???????
	 * @param @param key
	 * @param @return
	 * @return Long
	 * @throws
	 */
	<T> Long del(String key);

	/**
	 * @Title: hset
	 * @Description: ???????key??hash????????field
	 * @param @param key
	 * @param @param field
	 * @param @param value
	 * @param @return
	 * @return Long
	 * @throws
	 */
	<T> Long hset(String key, String field, T value, Integer s);

	/**
	 * @Title: hget
	 * @Description: ?????????key??hash??field?????value
	 * @param @param key
	 * @param @param field
	 * @param @param c
	 * @param @return
	 * @return T
	 * @throws
	 */
	<T> T hget(String key, String field, Class<T> c);
	
	String hgetstr(String key, String field);

	/**
	 * 
	 * @Title: hexists
	 * @Description: ?????key??hash??????????field????
	 * @param @param key
	 * @param @param field
	 * @param @return
	 * @return Boolean
	 * @throws
	 */
	<T> Boolean hexists(String key, String field);

	/**
	 * @Title: hdel
	 * @Description: ????????????
	 * @param @param key
	 * @param @param field
	 * @param @return
	 * @return Long
	 * @throws
	 */
	<T> Long hdel(String key, String field);

	/**
	 * 
	 * @Title: zadd
	 * @Description: ???????????? ????????????
	 * @param @param key
	 * @param @param score
	 * @param @param value
	 * @param @return
	 * @return Long
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Long zadd(String key, double score, String value);

	/**
	 * 
	 * @Title: zscore
	 * @Description: ???????????????
	 * @param @param key
	 * @param @param value
	 * @param @return
	 * @return Double
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Double zscore(String key, String value);

	/**
	 * 
	 * @Title: zcount
	 * @Description: ?????????????????
	 * @param @param key
	 * @param @param min
	 * @param @param max
	 * @param @return
	 * @return Long
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Long zcount(String key, double min, double max);

	/**
	 * 
	 * @Title: zrange
	 * @Description: ???????????
	 * @param @param key
	 * @param @param index
	 * @param @return
	 * @return String
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> String zrevrange(String key, int index);

	/**
	 * 
	 * @Title: zincrby
	 * @Description: ???? ?????????
	 * @param @param key
	 * @param @param score
	 * @param @param value
	 * @param @return
	 * @return Double
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Double zincrby(String key, double score, String value);

	/**
	 * 
	 * @Title: zrevrangeWithScores
	 * @Description: ?????С??
	 * @param @param key
	 * @param @param start
	 * @param @param end
	 * @param @return
	 * @return Set<Tuple>
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Set<Tuple> zrevrangeWithScores(String key, int start, int end)
			throws Exception;

	/**
	 * 
	 * @Title: zrevrange
	 * @Description: (???С)
	 * @param @param key
	 * @param @param start
	 * @param @param end
	 * @param @return
	 * @param @throws Exception
	 * @return Set<String>
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Set<String> zrevrange(String key, int start, int end) throws Exception;

	/**
	 * 
	 * @Title: zremrangeByRank
	 * @Description: ???
	 * @param @param key
	 * @param @return
	 * @return Long
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Long zremrangeByRank(String key);

	/**
	 * 
	 * @Title: zrem
	 * @Description: ??????member???
	 * @param @param key
	 * @param @param member
	 * @param @return
	 * @return Long
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Long zrem(String key, String member);

	/**
	 * 
	 * @Title: zrank
	 * @Description: ?????????λ???(??С????)
	 * @param @param key
	 * @param @param member
	 * @param @return
	 * @return Long
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Long zrank(String key, String member);

	/**
	 * 
	 * @Title: zrevrank
	 * @Description: ?????????λ???(???С)
	 * @param @param key
	 * @param @param member
	 * @param @return
	 * @return Long
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Long zrevrank(String key, String member);

	/**
	 * 
	 * @Title: zcard
	 * @Description: ??????Key???????Sorted-Sets?а???????????
	 * @param @param key
	 * @param @return
	 * @return Long
	 * @author Wangshaocheng
	 * @throws
	 */
	<T> Long zcard(String key);

	/**
	 * @Title: setex
	 * @Description: ??????
	 * @param @param key
	 * @param @param score
	 * @param @param value
	 * @param @return
	 * @return String
	 * @throws
	 */
	<T> String setex(String key, int score, T value);

	/**
	 * @Title: get
	 * @Description: get
	 * @param @param key
	 * @param @param c
	 * @param @return
	 * @return T
	 * @throws
	 */
	<T> T get(String key, Class<T> c);

	/**
	 * @Title: set
	 * @Description: 
	 * @param @param key
	 * @param @param value
	 * @param @return
	 * @return String
	 * @throws
	 */
	<T> String set(String key, T value);

	String getString(String key);

	/**
	 * @Description: ????key???map
	 * @param @param key
	 * @param @return   
	 * @return Map  
	 * @throws
	 */
	Map<?, ?> hgetAll(String key);
	//Map hgetAll(String key);

	/**
	  * @Title: hlen 
	  * @Description: ?????????key??hash????????
	  * @param @param key
	  * @param @return
	  * @return Long
	  * @throws
	 */
	<T> Long hlen(String key);

}
