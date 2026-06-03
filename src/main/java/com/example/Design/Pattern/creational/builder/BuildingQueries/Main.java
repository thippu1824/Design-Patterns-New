package com.example.Design.Pattern.creational.builder.BuildingQueries;

public class Main {

    public static void main(String[] args) {

        Query query = Query.getBuilder()
            .select("id,name")
            .from("users")
            .where("userType == Contractor")
            .join("INNER JOIN department d on d.id = users.deptId")
            .orderBy("name ASC")
            .limit(10)
            .build();

        System.out.println(query.getJoin());
    }
}
