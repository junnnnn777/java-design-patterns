## Name / classification

---
layout: pattern
title: Query Object
folder: query-object
permalink: /patterns/query-object/
categories: Behavioral
tags:
- Data Access
---



## Intent

Using objects to represent data queries and thus achieve independence from the database schema. Changes to the schema can be localized in a single place. 

## Explanation

This chapter consists of the following sections
  * Real-world example

	> [Hibernate Criteria API](http://docs.jboss.org/hibernate/core/3.2/api/org/hibernate/Criteria.html)  
     [JA2 Criteria API](http://docs.oracle.com/javaee/6/api/javax/persistence/criteria/package-summary.html)

## Class diagram

Shows the class diagram for the pattern example

## Applicability

- When there is a need to form queries without knowing what the database schema looks like.
- Avoid having a long list of methods for complicated queries.

## Credits

List of articles/authors that have helped in authoring this pattern example.

[Query Object Pattern](https://www.hojjatk.com/2018/08/query-object-pattern.html)

[Thinking In Design Pattern—Query Object Pattern](https://www.cnblogs.com/OceanEyes/archive/2012/11/14/think-in-design-pattern-query-object.html)