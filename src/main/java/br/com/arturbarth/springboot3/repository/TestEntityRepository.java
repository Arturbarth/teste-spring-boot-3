package br.com.arturbarth.springboot3.repository;

import br.com.arturbarth.springboot3.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {
}