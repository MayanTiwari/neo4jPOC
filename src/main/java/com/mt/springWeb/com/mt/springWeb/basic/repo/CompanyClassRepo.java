package com.mt.springWeb.com.mt.springWeb.basic.repo;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.Company;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.CompanyClass;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CompanyClassRepo extends Neo4jRepository<CompanyClass,Long> {
}
