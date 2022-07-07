package com.example.demo.context;

import com.example.demo.vo.QueryVO;

import java.util.ArrayList;
import java.util.List;

public class BatchMessageResultContext {

    private List<QueryVO> queryResultList;

    private String finalResultChannel;

    public List<QueryVO> getQueryResultList() {
        return queryResultList;
    }

    public void setQueryResultList(List<QueryVO> queryResultList) {
        this.queryResultList = queryResultList;
    }

    public String getFinalResultChannel() {
        return finalResultChannel;
    }

    public void setFinalResultChannel(String finalResultChannel) {
        this.finalResultChannel = finalResultChannel;
    }

    public void addQueryVO(QueryVO queryVO){
        if (queryResultList == null){
            queryResultList = new ArrayList<>();
        }
        queryResultList.add(queryVO);
    }
}
