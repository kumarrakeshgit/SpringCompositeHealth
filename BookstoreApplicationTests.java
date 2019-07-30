package com.example.test.framework.bookstore;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.transaction.TestTransaction;
import org.springframework.transaction.annotation.Transactional;

import com.example.test.framework.bookstore.model.Post;
import com.example.test.framework.bookstore.model.User;
import com.example.test.framework.bookstore.model.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class BookstoreApplicationTests {
	
	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
	}
	
	/*
	 * @Test public void testAllJpaUsers() { List<User> users =
	 * userRepository.findAll(); assertNotNull(users);
	 * assertTrue(TestTransaction.isActive()); }
	 */
	
	@Test
	public void testSaveUser(){
		TestTransaction.end();
		TestTransaction.start();
		TestTransaction.flagForRollback();
		
		User user = new User();
		user.setName("testing");
		Post post = new Post();
		post.setId(11002);
		post.setDescription("testing Description");
		List<Post> postl = new ArrayList<>();
		postl.add(post);
		user.setPosts(postl);
		user.setBirthDate(new Date());
		user.setId(1005);

		Long usrc = userRepository.count(); 
		System.out.println("Rakesh BEFORE :::::::::::::::::::"+usrc);

		
		userRepository.save(user);
		
		
		
		System.out.println("Rakesh:::::::::::::::::::::::::::::::::::::::::::::::"+TestTransaction.isFlaggedForRollback());

		try {
			Long usr = userRepository.count(); 
			System.out.println("Rakesh AFTER :::::::::::::::::::"+usr);
			
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Rakesh transaction rollbacked:::::::::::::::::::::;;>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		assertNotNull(user);
		
		TestTransaction.end();
		
		Long usrlase = userRepository.count(); 
		System.out.println("Rakesh LAST ::::::::::::::::::::::::::::"+usrlase);
		
	}

}
