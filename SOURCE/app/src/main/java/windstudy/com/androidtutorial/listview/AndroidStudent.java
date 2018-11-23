package windstudy.com.androidtutorial.listview;

public class AndroidStudent {
    int id;
    String name, addr, phoneNumber;

    public AndroidStudent(int id, String name, String addr, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
