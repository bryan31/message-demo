package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.IF_2;
import static com.example.demo.cmp.NodeIdConstant.SWITCH_SUB_2;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 业务判断2选择组件，选择短信渠道
 * @author LiXiaoPing
 */
@LiteflowComponent(id = IF_2, name = "业务判断2，选择短信渠道")
public class IF2SwitchCmp extends NodeSwitchComponent {
    @Override
    public String processSwitch() throws Exception {
        //模拟业务耗时
        int time = ThreadLocalRandom.current().nextInt(1000);
        Thread.sleep(time);

        // 这里写死，你可以改成其他分支
        return SWITCH_SUB_2;
    }
}
