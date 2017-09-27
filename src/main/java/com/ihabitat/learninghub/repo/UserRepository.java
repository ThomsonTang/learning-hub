package com.ihabitat.learninghub.repo;

import org.springframework.data.repository.CrudRepository;

/**
 * User数据访问接口
 *
 * @author Thomson Tang
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findById(Long id);

    User findByUserName(String userName);

    Integer countByUserName(String userName);
}
