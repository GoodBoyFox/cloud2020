package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ywj
 * @version 1.0
 * @date 2020/7/1 15:17
 */
@Component
public class MyLb  implements LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current=0;
        int next = 0;
        do{
            current= this.atomicInteger.get();
            next = current>=2147483647 ? 0 : current+1;
        }while (!atomicInteger.compareAndSet(current,next));
        System.out.println("********next"+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        int index = getAndIncrement() % serviceInstances.size();


        return serviceInstances.get(index);
    }
}
