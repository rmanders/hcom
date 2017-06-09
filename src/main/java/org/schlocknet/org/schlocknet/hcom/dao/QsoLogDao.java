package org.schlocknet.org.schlocknet.hcom.dao;


import org.schlocknet.org.schlocknet.hcom.model.QSOLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QsoLogDao extends MongoRepository<QSOLog, String> {
}
