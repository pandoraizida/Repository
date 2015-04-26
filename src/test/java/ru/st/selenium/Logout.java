import junit.framework.Test;
import junit.framework.TestSuite;

public class Logout {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(login.class);
    suite.addTestSuite(add_del_user.class);
    suite.addTestSuite(add_del_film.class);
    suite.addTestSuite(logout.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
