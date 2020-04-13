package com.wildlife.park.auth.repository;

import com.wildlife.park.common.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.time.LocalDateTime;

/**
 * @author yan
 * @desc UserRepoTest
 * @date 2020/4/12
 */
@SpringBootTest
public class UserRepoTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Rollback(value = false)
    public void testSaveUser(){
        UserEntity user = new UserEntity();
        user.setUserName("Jack");
        user.setAge(18);
        user.setCreatedBy("Yan");
        user.setCreatedTime(LocalDateTime.now());
        user.setModifiedTime(LocalDateTime.now());
        user.setModifiedBy("Yan");
        user.setIsDeleted(0);
        userRepository.saveAndFlush(user);
    }
}
