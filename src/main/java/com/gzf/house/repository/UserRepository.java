package com.gzf.house.repository;

import com.gzf.house.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author GFZ
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    User findUserByName(String username);
}
