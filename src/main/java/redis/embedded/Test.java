/**
 * embedded-redis
 * <p>
 * Copyright 2014 Acooly.cn, Inc. All rights reserved.
 *
 * @author Administrator
 * @date 2021-08-15 08:58
 */
package redis.embedded;

import java.io.IOException;

/**
 *
 * @author cayden
 * @date 2021-08-15 08:58
 */
public class Test {
    public static void main(String[] args) throws IOException {
        RedisServer redisServer = new RedisServer(6379);
        redisServer.start();
// do some work
        //redisServer.stop();
    }
}
