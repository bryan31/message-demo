package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL_SELECTOR;

import com.example.demo.context.BatchMessageResultContext;
import com.example.demo.vo.QueryVO;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import java.util.List;

/**
 * 渠道余量最大选择器
 * @author LiXiaoPing
 */
@LiteflowComponent(id = CHANNEL_SELECTOR, name = "渠道余量最大选择器")
public class ChannelSelectorCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        BatchMessageResultContext context = this.getFirstContextBean();

        List<QueryVO> queryList = context.getQueryResultList();

        // 选择渠道余量最大的
        QueryVO vo = queryList.stream().min((o1, o2) -> o2.getAvailCount() - o1.getAvailCount()).orElse(null);

        assert vo != null;
        context.setFinalResultChannel(vo.getChannel());
    }
}
