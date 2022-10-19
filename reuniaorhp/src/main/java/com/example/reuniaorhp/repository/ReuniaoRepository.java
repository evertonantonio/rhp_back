package com.example.reuniaorhp.repository;

import com.example.reuniaorhp.model.Reuniao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReuniaoRepository extends JpaRepository<Reuniao, Long> {
}
