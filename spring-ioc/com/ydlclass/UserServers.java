package com.ydlclass;

public class UserServers {
    private static final UserServers USER_SERVERS = new UserServers();
    private UserDao userDao;
    private AddressDao addressDao;
    public static UserServers creat() {
        synchronized (USER_SERVERS) {
            return USER_SERVERS;
        }
    }
    public UserDao create2() {
        return new UserDao();
    }
    public void hello() {
        userDao.hello();
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setAddressDao(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    public UserServers(UserDao userDao, AddressDao addressDao) {
        this.userDao = userDao;
        this.addressDao = addressDao;
    }

    public UserServers() {
    }
}
