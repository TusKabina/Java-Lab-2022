package com.ivanrogulj.exercise4.repositories;


import com.ivanrogulj.exercise4.entitites.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;


public interface DataRepository extends JpaRepository<Data, Long> {

    @Query(value= "select SUM(CAST(value AS INTEGER)) from data where year= :year", nativeQuery = true)
    String getTotalValuesByYear(@Param("year") String year);

    @Query(value= "select month, SUM(CAST(value AS INTEGER)) from data where year= :year group by month", nativeQuery = true)
    ArrayList<String> getTotalValuesByYearPerMonth(@Param("year") String year);


    @Query(value= "select SUM(CAST(value AS INTEGER)) from data where year= :year AND month = :month", nativeQuery = true)
    String getTotalValuesByYearAndMonth(@Param("year") String year, @Param("month") String month);




}
