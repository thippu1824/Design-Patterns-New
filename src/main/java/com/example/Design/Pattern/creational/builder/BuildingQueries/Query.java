package com.example.Design.Pattern.creational.builder.BuildingQueries;

public class Query {

    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private int limit;

    private Query(QueryBuilder builder) {
        this.select = builder.select;
        this.from = builder.from;
        this.where = builder.where;
        this.join = builder.join;
        this.orderBy = builder.orderBy;
        this.limit = builder.limit;
    }

    public static QueryBuilder getBuilder() {
        return new QueryBuilder();
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getJoin() {
        return join;
    }

    public void setJoin(String join) {
        this.join = join;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public static class QueryBuilder {

            public String select;
            public String from;
            public String where;
            public String join;
            public String orderBy;
            public int limit;

        public QueryBuilder select(String select) {
            this.select = select;
            return this;
        }

        public QueryBuilder from(String from) {
            this.from = from;
            return this;
        }

        public QueryBuilder where(String where) {
            this.where = where;
            return this;
        }

        public QueryBuilder join(String join) {
            this.join = join;
            return this;
        }

        public QueryBuilder orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public QueryBuilder limit(int limit) {
            this.limit = limit;
            return this;
        }

        public Query build() {
            return new Query(this);
        }
    }

}
