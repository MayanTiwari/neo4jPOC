package com.mt.springWeb.com.mt.springWeb.basic.repo;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.SubCatagory;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface SubCatagoryRepo extends Neo4jRepository<SubCatagory,Long> {
}
