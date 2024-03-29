package com.example.dits.DAO;

import com.example.dits.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
     User getUserByLogin(String login);
     User getUserByUserId(int id);
     void deleteUserByUserId(int userId);
}
