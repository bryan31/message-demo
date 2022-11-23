package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.PACKAGE_DATA;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 组装数据流程组件
 * @author bryan31
 */
@LiteflowComponent(id = PACKAGE_DATA, name = "组装数据")
public class PackageDataCmp extends NodeComponent {
    @Override
    public void process() throws InterruptedException {
        // 模拟业务耗时
        int time = ThreadLocalRandom.current().nextInt(1500);
        Thread.sleep(time);
    }
}
