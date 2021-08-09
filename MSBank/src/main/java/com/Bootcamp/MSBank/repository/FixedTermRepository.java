package com.Bootcamp.MSBank.repository;


import com.Bootcamp.MSBank.model.FixedTerm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Map;

public interface FixedTermRepository extends MongoRepository<FixedTerm,String> {
    //@Query(value = "{customerId: ?0}", count = true)
    public List<FixedTerm> findFixedTermByCustomerId(String customerId);
}
