package com.springbootquickstart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootquickstart.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Integer>{

}
