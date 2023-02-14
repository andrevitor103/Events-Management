package com.andrevitor.event.adapters.out.repository;

import com.andrevitor.event.adapters.out.repository.entity.EventEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<EventEntity, String> {
}
