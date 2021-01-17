package com.iris.user;

public class IUserServiceImplStub implements IUserService {


    public IUserServiceImplStub(IUserService userService) {
        this.userService = userService;
    }

    private final IUserService userService;

    public String hello(String name) {
        //此处写对所有服务的统一处理逻辑
        if (name == null) {
            return "400, validate params";
        }
        return userService.hello(name);
    }
}
