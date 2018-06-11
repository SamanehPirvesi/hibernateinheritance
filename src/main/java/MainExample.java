
import com.samane.dao.UserDao;
import com.samane.model.Client;
import com.samane.model.Employee;
import com.samane.model.User;

public class MainExample {

	public static void main(String[] args) {
	Employee e=new Employee("maryam","fathi",2500);
		Client c=new Client("ali","bahri","n3456");
	UserDao udao=new UserDao();
	udao.createUser(c);
	udao.createUser(e);
	}

}
