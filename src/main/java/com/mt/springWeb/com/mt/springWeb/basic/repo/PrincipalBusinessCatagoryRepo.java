package com.mt.springWeb.com.mt.springWeb.basic.repo;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.PrincipalBusinessCatagory;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PrincipalBusinessCatagoryRepo extends Neo4jRepository<PrincipalBusinessCatagory,Long> {
}
