package by.academy.lesson9;

public class UserTask1 {
    private String login;
    private String password;

    public UserTask1(String login, String password) {
        super();
        this.login = login;
        this.password = password;
    }

    public class Query {

        public void printToLog() {

            StringBuilder queryInformation = new StringBuilder();
            queryInformation.append("Пользователь ");
            queryInformation.append(login);
            queryInformation.append(" с паролем ");
            queryInformation.append(password);
            queryInformation.append(" отправил запрос");
            System.out.println(queryInformation);
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String... args) {
        System.out.println("------Var 1--------");

        UserTask1 user1 = new UserTask1("Вася-1", "12345Qwerty");
        user1.createQuery();

        System.out.println("------Var 2--------");
        UserTask1 user2 = new UserTask1("Вася-2", "12345Qwerty");
        UserTask1.Query query2 = user2.new Query();
        query2.printToLog();

        System.out.println("------Var 3--------");
        UserTask1.Query query3 = new UserTask1("Вася-3", "qwertY54321").new Query();
        query3.printToLog();
    }
}
