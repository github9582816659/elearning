package com.elearning;

import io.hypersistence.optimizer.HypersistenceOptimizer;
import io.hypersistence.optimizer.core.event.Event;
import io.hypersistence.optimizer.hibernate.event.configuration.connection.Connection4Event;
import io.hypersistence.optimizer.hibernate.event.configuration.query.Query2Event;
import io.hypersistence.optimizer.hibernate.event.configuration.query.Query3Event;
import io.hypersistence.optimizer.hibernate.event.configuration.schema.SchemaGenerationEvent;
import io.hypersistence.optimizer.hibernate.event.mapping.association.Association6Event;
import io.hypersistence.optimizer.hibernate.event.mapping.association.Association7Event;
import io.hypersistence.optimizer.hibernate.event.mapping.association.OneToOneWithoutMapsIdEvent;
import io.hypersistence.optimizer.hibernate.event.mapping.association.fetching.EagerFetchingEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.support.TransactionTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class ElearningApplicationTests {

	@Autowired
	private HypersistenceOptimizer hypersistenceOptimizer;

	@Test
	public void test() throws ExecutionException, InterruptedException {
		assertEventTriggered(2, EagerFetchingEvent.class);
		assertEventTriggered(1, Association6Event.class);
		assertEventTriggered(1, Association7Event.class);
		assertEventTriggered(1, OneToOneWithoutMapsIdEvent.class);
		assertEventTriggered(1, Connection4Event.class);
		assertEventTriggered(1, SchemaGenerationEvent.class);
		assertEventTriggered(1, Query3Event.class);
		assertEventTriggered(1, Query2Event.class);
	}

	protected void assertEventTriggered(int expectedCount, Class<? extends Event> eventClass) {
		int count = 0;

		for (Event event : hypersistenceOptimizer.getEvents()) {
			if (event.getClass().equals(eventClass)) {
				count++;
			}
		}

		assertSame(expectedCount, count);
	}

	@Test
	void contextLoads() {
	}

}
