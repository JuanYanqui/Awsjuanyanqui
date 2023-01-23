package com.trabaautonomo.awsJuanYanqui.service;

import com.trabaautonomo.awsJuanYanqui.model.User;
import com.trabaautonomo.awsJuanYanqui.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public CrudRepository<User, Integer> getDao() {
        return userRepository;
    }

}
