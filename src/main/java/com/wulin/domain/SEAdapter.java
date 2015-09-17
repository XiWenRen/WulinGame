package com.wulin.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 用来在场景和事件中传输数据的适配器
 */
public class SEAdapter<T> {

    private T data;

    private List<T> dataList = new ArrayList<>();

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    public void addData(T data){
        this.dataList.add(data);
    }

    public List<T> getDataList(){
        return this.dataList;
    }

    public void addAdapter(SEAdapter<T> adapter){
        this.data = adapter.data;
        this.dataList.addAll(adapter.dataList);
    }
}
