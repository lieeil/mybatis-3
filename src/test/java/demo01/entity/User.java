package demo01.entity;

public class User {

  private static final long serialVersionUID = 7978990097390980515L;


  private  Integer id;
  private String createTime;
  private String name;
  private String password;
  private String phone;
  private String nick_name;


  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getNick_name() {
    return nick_name;
  }


  public void setNick_name(String nick_name) {
    this.nick_name = nick_name;
  }

}
