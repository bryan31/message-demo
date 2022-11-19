package com.example.demo.context;

import com.example.demo.vo.QueryVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiXiaoPing
 */
public class BatchMessageResultContext {

    private final List<QueryVO> queryResultList = new ArrayList<>();

    private String finalResultChannel;

    public List<QueryVO> getQueryResultList() {
        return queryResultList;
    }


    public String getFinalResultChannel() {
        return finalResultChannel;
    }

    public void setFinalResultChannel(String finalResultChannel) {
        this.finalResultChannel = finalResultChannel;
    }

    public void addQueryVO(QueryVO queryVO){
        queryResultList.add(queryVO);
    }
}
