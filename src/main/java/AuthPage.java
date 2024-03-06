import java.util.Scanner;

public class AuthPage extends AbstractPage {
    @Override
    String getName() {
        return "AuthPage";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать на страницу авторизации!");
        System.out.print("Введите имя пользователя: ");
        String username = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Авторизация прошла успешно!");
            showMainPage(username);
        } else {
            System.out.println("Неверное имя пользователя или пароль. Попробуйте еще раз.");
        }

    }
    private static boolean authenticate (String username, String password){
        // проверка имени пользователя и пароля
        return true;
    }
    private static void showMainPage(String username) {
        System.out.println("\nДобро пожаловать на главную страницу, " + username + "!");
        System.out.println("Это ваш личный кабинет.");
        // добавьте здесь дополнительный функционал главной страницы
    }


}
