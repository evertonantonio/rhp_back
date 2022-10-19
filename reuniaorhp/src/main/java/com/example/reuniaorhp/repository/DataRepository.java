package com.example.reuniaorhp.repository;

import com.example.reuniaorhp.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DataRepository extends JpaRepository <Data, Long> {
}
