package by.academy.lesson9;

public class UserTask2 {

    private String login;
    private String password;

    public UserTask2(String login, String password) {
        super();
        this.login = login;
        this.password = password;
    }

    public static void main(String... args) {

        UserTask2 user = new UserTask2("Вася", "12345Qwerty");

        class Query {
            public void printToLog() {
                StringBuilder queryInformation = new StringBuilder();
                queryInformation.append("Пользователь ");
                queryInformation.append(user.login);
                queryInformation.append(" с паролем ");
                queryInformation.append(user.password);
                queryInformation.append(" отправил запрос");
                System.out.println(queryInformation);
            }
        }
        Query query = new Query();
        query.printToLog();
    }
}
