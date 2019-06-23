

public class MainDAO {

        public static void main (String[] args) {


            DAO dao = new DAO();
            if (dao.open()) {
                dao.fillTestData();
                System.out.println("\n");
                dao.fillTestData2();
                dao.close();
            }

        }


}





