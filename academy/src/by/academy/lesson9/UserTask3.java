package by.academy.lesson9;

public class UserTask3 {
    private String login;
    private String password;

    public UserTask3(String login, String password) {
        super();
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog(login, password);
    }

    public static void main(String... args) {
        UserTask3 user = new UserTask3("Вася", "12345Qwerty");
        user.createQuery();

    }
    public static class Query {
        public void printToLog(String login, String password) {

            StringBuilder queryInformation = new StringBuilder();
            queryInformation.append("Пользователь ");
            queryInformation.append(login);
            queryInformation.append(" с паролем ");
            queryInformation.append(password);
            queryInformation.append(" отправил запрос");
            System.out.println(queryInformation);
        }
    }
}