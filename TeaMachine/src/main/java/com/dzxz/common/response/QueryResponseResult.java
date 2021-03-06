package com.dzxz.common.response;

public class QueryResponseResult<T> extends ResponseResult{

    QueryResult<T> queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult<T> queryResult) {

        super(resultCode);

        this.queryResult = queryResult;

    }

    public QueryResult<T> getQueryResult() {
        return queryResult;
    }

    public void setQueryResult(QueryResult<T> queryResult) {
        this.queryResult = queryResult;
    }
}
