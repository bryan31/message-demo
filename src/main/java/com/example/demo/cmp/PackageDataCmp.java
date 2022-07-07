package com.example.demo.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

import java.util.Random;

@LiteflowComponent(id = "packageData", name = "组装数据")
public class PackageDataCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        //模拟业务耗时
        int time = new Random().nextInt(1500);
        Thread.sleep(time);
    }
}
