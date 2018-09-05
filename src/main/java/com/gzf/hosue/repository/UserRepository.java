package com.gzf.hosue.repository;

import com.gzf.hosue.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author GFZ
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
