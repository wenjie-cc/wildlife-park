package com.wildlife.park.auth.service;

import com.wildlife.park.auth.entity.User;

/**
 * @author wenjiewu
 */
public interface UserAuthService {
    /**
     *
     * @param user
     * @return
     */
    User userAuthentication(User user);
}
