package services;

import models.Human;


public class UserService implements Service {

    @Override
    public void writeUserData(Human human) {
        System.out.println("This method is not achievable for this class " + UserService.class.getSimpleName());
    }
}



