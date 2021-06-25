package com.demo.thread;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

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
@Component
public class ThreadTestC {

    /**
     * 线程池的生命周期（状态管理）
     * 线程池线程管理策略（创建与回收）
     * 线程池任务管理策略（申请线程执行与阻塞队列、消费）
     *
     * ThreadPoolExecutor
     * 提交任务唯一入口函数：execute  (submit也是最终调用这个函数)
     * 创建线程唯一入口函数：addWorker
     * 回收线程唯一入口函数：processWorkerExit
     * 工作线程执行唯一入口函数：runWorker
     * 线程去阻塞队列获取任务唯一入口函数：getTask
     * 线程池状态变更函数 shutdown和shutdownNow
     * 从这几个核心函数出发。
     *
     * private final ReentrantLock mainLock = new ReentrantLock();
     * private final HashSet<Worker> workers = new HashSet<Worker>();
     * private int largestPoolSize;
     * private long completedTaskCount;
     * private volatile ThreadFactory threadFactory;
     * private volatile long keepAliveTime;
     * private volatile boolean allowCoreThreadTimeOut;  //是否允许核心线程回收
     * private volatile int corePoolSize;
     * private volatile int maximumPoolSize;
     * private static final RuntimePermission shutdownPerm =
     *         new RuntimePermission("modifyThread");
     *
     * 然后开始介绍这些属性是啥，然后分别在线程池哪个过程中使用到了
     */
    @Resource(name = "commonExecutor")
    private ThreadPoolExecutor commonExecutor;
    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int RUNNING    = -1 << COUNT_BITS;
    private static final int SHUTDOWN   =  0 << COUNT_BITS;
    private static final int STOP       =  1 << COUNT_BITS;
    private static final int TIDYING    =  2 << COUNT_BITS;
    private static final int TERMINATED =  3 << COUNT_BITS;
    private static final int CAPACITY   = (1 << COUNT_BITS) - 1;

    public void fund() throws ExecutionException, InterruptedException {
        List<String> members = new ArrayList<>();
        List<FutureTask<String>> futureTaskList = new ArrayList<>();
        for (String member : members) {
//        FutureTask<String> task = new FutureTask<String>(() -> calMemberData(member, year, month));
            FutureTask<String> task = new FutureTask<String>(() -> null);
        futureTaskList.add(task);

            commonExecutor.execute(task);
        }
        for (FutureTask<String> task : futureTaskList) {
            String taskResult = task.get();
//            rateLogger.info("calMemberData result:{}", toJSON(taskResult));
        }
    }

    public static void main(String[] args) {

        System.out.println(RUNNING);
        System.out.println(SHUTDOWN);
        System.out.println(STOP);
        System.out.println(TIDYING);
        System.out.println(TERMINATED);

        System.out.println(((RUNNING | 0) & ~CAPACITY));
        System.out.println(RUNNING < SHUTDOWN);
    }

}
