package cn.xiaozi5.graduation.pojo;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer state;
    
//    private UserInfo userInfo;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

//	public UserInfo getUserInfo() {
//		return userInfo;
//	}
//
//	public void setUserInfo(UserInfo userInfo) {
//		this.userInfo = userInfo;
//	}
    
}