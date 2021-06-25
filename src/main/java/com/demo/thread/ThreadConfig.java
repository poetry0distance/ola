package com.demo.thread;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.concurrent.DefaultManagedAwareThreadFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-06-24
 */
@Configuration
public class ThreadConfig {

    private static final Integer CORE_POOL_SIZE = 16;
    private static final Integer MAX_POOL_SIZE = 64;
    private static final Integer QUEUE_CAPACITY = 200;
    private static final Integer KEEP_ALIVE_SECOND = 120;

    @Lazy
    @Bean(name = "commonExecutor")
    public ThreadPoolExecutor commonExecutor() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE,
                KEEP_ALIVE_SECOND, TimeUnit.SECONDS, new ArrayBlockingQueue<>(QUEUE_CAPACITY));
        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolExecutor.setThreadFactory(new DefaultManagedAwareThreadFactory());
        return threadPoolExecutor;
    }

}
