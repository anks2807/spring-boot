package com.springbootquickstart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootquickstart.model.Topic;
import com.springbootquickstart.repository.TopicRepository;


@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topicList = new ArrayList<>();
		topicRepository.findAll().forEach(t -> topicList.add(t));
		return topicList;
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

}
