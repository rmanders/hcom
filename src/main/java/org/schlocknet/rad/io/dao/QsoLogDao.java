package org.schlocknet.rad.io.dao;


import org.schlocknet.rad.io.model.QSOLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QsoLogDao extends MongoRepository<QSOLog, String> {
}
