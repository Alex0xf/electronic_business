package com.javasm.redis;

import redis.clients.jedis.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 
 * ClassName: RedisDemo 
 * @Description: 测试redis
 * @author Alex
 * @date 2018年8月8日
 */
public class RedisDemo {
	
	static Jedis jedis = new Jedis("redis://:javasm@127.0.0.1:6379/0");//javasm是密码 /0是redis库
	
	public static void main(String[] args) {
		jedis.set("javasm_name","hello redis");
		String str=jedis.get("javasm_name");
		System.out.println(str);
		//设置过期时间
		int id=1001;
		jedis.setex("username_"+id, 60*10, "7685");
		checkUserLogin(1001);
		jedisPoolTest();
		//jedis.close();
	}
	
	/*
	 * 用户 当天第一次登录  记录个人信息到数据库
	 * 第二次或者之后的登录 都不记录
	 * 
	 * 
	 * 不使用redis   先去数据库查询 如果查到了  就不做任何操作  如果查不到 就添加
	 * 使用redis		先去redis查询 如果查到了 不做任何操作 如果查不到 添加到数据库 和 redis
	 */
	public static  void checkUserLogin(Integer userid){
		//今天的日期
		/*Date date=new Date();
		System.out.println(date.toLocaleString());*/
		Calendar ca = Calendar.getInstance();
		StringBuffer datestr = new StringBuffer();
		datestr.append(ca.get(Calendar.YEAR));
		datestr.append(ca.get(Calendar.MONTH));
		datestr.append(ca.get(Calendar.DAY_OF_MONTH));
		//组合一个key
		String key = "userLogin:"+datestr+":"+userid;
		System.out.println(key);
		//先查询
		String str = jedis.get(key);
		if(str != null && str.equals(userid)){
			//已经存值  不做任何操作
		}else{
			//用户登录信息 存入数据库  多线程操作
			//用户登录信息 存入 redis 多线程操作
			jedis.setex(key, 60*60*24, userid.toString());
		}
		
	}
	
	public static void jedisPoolTest(){
		//声明一个连接池的配置
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		//个性化的配置
		//分片的对象
		JedisShardInfo infoA = new JedisShardInfo("redis://:javasm@127.0.0.1:6379/0");
		JedisShardInfo infoB = new JedisShardInfo("redis://:javasm@127.0.0.1:6379/1");
		JedisShardInfo infoC = new JedisShardInfo("redis://:javasm@127.0.0.1:6379/2");
		List<JedisShardInfo> infoList = new ArrayList<>();//jedis分片的集合
	    infoList.add(infoA);
		infoList.add(infoB);
		infoList.add(infoC);
		//连接池对象
		ShardedJedisPool pool = new ShardedJedisPool(poolConfig, infoList);
		//获得连接资源
		ShardedJedis sharjedis = pool.getResource();
		sharjedis.set("shar_demo","hello");
		//关闭连接
		sharjedis.close();
		pool.close();
	}
}
