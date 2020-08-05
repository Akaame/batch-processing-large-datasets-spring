package com.sddk.demo.repository;

import com.sddk.demo.dao.Voltage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoltageRepository extends CrudRepository<Voltage, Long> {

}
