package com.javasm.redis;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Tuple;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Repository
public class RedisDaoImpl extends RedisDaoSupport implements RedisDao {

	@Override
	@Resource(name = "redisDataSource")
	//从spring容器中拿到redisDataSource
	//resource和autowired的区别是resource会去spring找id/name="redisDataSource"的数据
	public void setRedisDataSource(RedisDataSource redisDataSource) {
		super.setRedisDataSource(redisDataSource);
	}

	@Override
	public <T> Long lpush(String key, T value) {
		String json = JSONUtils.toJSONString(value);
		Long s = getRedisTemplate().lpush(key, json);
		return s;
	}

	@Override
	public <T> Long lrem(String key, T value) {
		String json = JSON.toJSONString(value);
		Long s = getRedisTemplate().lrem(key, 1, json);
		return s;
	}

	@Override
	public <T> List<String> lrange(String key, Long start, Long end)
			throws Exception {
		List<String> str = getRedisTemplate().lrange(key, start, end);
		return str;
	}

	@Override
	public <T> Long del(String key) {
		return getRedisTemplate().del(key);
	}

	@Override
	public <T> Long hset(String key, String field, T value, Integer seconds) {
		String json = JSON.toJSONString(value);
		Long s = getRedisTemplate().hset(key, field, json);
		if (seconds != null) {
			getRedisTemplate().expire(key, seconds);
		}
		return s;
	}

	@Override
	public <T> T hget(String key, String field, Class<T> c) {
		String str = getRedisTemplate().hget(key, field);
		T value = null;
		if (str != null)
			value = JSON.parseObject(str, c);
		return value;
	}
	
	@Override
	public String hgetstr(String key, String field) {
		return getRedisTemplate().hget(key, field);
	}

	@Override
	public <T> Boolean hexists(String key, String field) {
		return getRedisTemplate().hexists(key, field);
	}

	@Override
	public <T> Long hdel(String key, String field) {
		return getRedisTemplate().hdel(key, field);
	}

	@Override
	public <T> Long zadd(String key, double score, String value) {
		Long s = getRedisTemplate().zadd(key, score, value);
		return s;
	}

	@Override
	public <T> Double zscore(String key, String value) {
		Double s = getRedisTemplate().zscore(key, value);
		return s;
	}

	@Override
	public <T> Long zcount(String key, double min, double max) {
		Long s = getRedisTemplate().zcount(key, min, max);
		return s;
	}

	@Override
	public <T> Double zincrby(String key, double score, String value) {
		Double s = getRedisTemplate().zincrby(key, score, value);
		return s;
	}

	@Override
	public <T> Set<Tuple> zrevrangeWithScores(String key, int start, int end)
			throws Exception {
		Set<Tuple> set = getRedisTemplate()
				.zrevrangeWithScores(key, start, end);
		return set;
	}

	@Override
	public <T> Set<String> zrevrange(String key, int start, int end)
			throws Exception {
		Set<String> set = getRedisTemplate().zrevrange(key, start, end);
		return set;
	}

	@Override
	public <T> Long zremrangeByRank(String key) {
		Long s = getRedisTemplate().zremrangeByRank(key, 0, -1);
		return s;
	}

	@Override
	public <T> Long zrem(String key, String member) {
		Long s = getRedisTemplate().zrem(key, member);
		return s;
	}

	@Override
	public <T> Long zrank(String key, String member) {
		Long s = getRedisTemplate().zrank(key, member);
		return s;
	}

	@Override
	public <T> Long zrevrank(String key, String member) {
		Long s = getRedisTemplate().zrevrank(key, member);
		return s;
	}

	@Override
	public <T> Long zcard(String key) {
		Long s = getRedisTemplate().zcard(key);
		return s;
	}

	@Override
	public <T> String zrevrange(String key, int index) {
		Set<String> set = getRedisTemplate().zrevrange(key, index, index);
		return set.iterator().next();
	}

	@Override
	public <T> String setex(String key, int score, T value) {
		String json = JSON.toJSONString(value);
		String s = getRedisTemplate().setex(key, score, json);
		return s;
	}

	@Override
	public <T> T get(String key, Class<T> c) {
		String str = getRedisTemplate().get(key);
		T value = null;
		if (str != null)
			value = JSON.parseObject(str, c);
		return value;
	}

	@Override
	public <T> String set(String key, T value) {
		String json = JSON.toJSONString(value);
		return getRedisTemplate().set(key, json);
	}

	@Override
	public String getString(String key) {
		return getRedisTemplate().get(key);
	}

	@Override
	public Map<?, ?> hgetAll(String key) {
		return getRedisTemplate().hgetAll(key);
	}

	@Override
	public <T> Long hlen(String key) {
		return getRedisTemplate().hlen(key);
	}

}
