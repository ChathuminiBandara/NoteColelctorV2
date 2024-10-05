package lk.ijse.dao;

import lk.ijse.entity.impl.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//public interface UserDAO extends CrudRepository<UserEntity, String> {
public interface UserDAO extends JpaRepository<UserEntity, String> {  // entity type and primality keys daya type{

}