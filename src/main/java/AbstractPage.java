import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Scanner;

abstract class AbstractPage {
    abstract String getName();

    public List<WebElement> getWebElements() {
        return null; // Вернуть список веб элементов
    }

    public WebElement getElementByName(String name) {
        return null; // Вернуть веб элемент по имени
    }

   /* public static void main(String[] args) {
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

    }*/
    private static boolean authenticate (String username, String password){
        // проверка имени пользователя и пароля
        return true;
    }
    private static void showMainPage(String username) {
        System.out.println("\nДобро пожаловать на главную страницу, " + username + "!");
        System.out.println("Это ваш личный кабинет.");
        // добавьте здесь дополнительный функционал главной страницы
    }

    class Table extends AbstractPage implements WithSize, WithText, Editable {

        @Override
        String getName() {
            return "Table";
        }

        @Override
        public String getTSize() {
            return null;
        }

        @Override
        public String getText() {
            return null;
        }

        @Override
        public void setTest() {

        }

        @Override
        public void isEditable() {

        }
    }

    class InputField extends AbstractPage implements Editable, WithText, WithSize {

        @Override
        String getName() {
            return "InputField";
        }

        @Override
        public void isEditable() {

        }

        @Override
        public String getText() {
            return null;
        }

        @Override
        public String getTSize() {
            return null;
        }

        @Override
        public void setTest() {

        }
    }

    class CheckBox extends AbstractPage implements Click, Active {

        @Override
        String getName() {
            return "CheckBox";
        }

        @Override
        public void Click() {

        }

        @Override
        public void isActive() {

        }
    }

    class RadioButton extends AbstractPage implements Click, Active {

        @Override
        String getName() {
            return "RadioButton";
        }

        @Override
        public void Click() {

        }

        @Override
        public void isActive() {

        }
    }

    class AlertWindow extends AbstractPage implements Click, Removable, WithText {

        @Override
        String getName() {
            return "AlertWindow";
        }

        @Override
        public void Click() {

        }

        @Override
        public String getText() {
            return null;
        }

        @Override
        public void setTest() {

        }

        @Override
        public void Remove() {

        }
    }

    class TextField extends AbstractPage implements WithText, WithSize {

        @Override
        String getName() {
            return "TextField";
        }

        @Override
        public String getText() {
            return null;
        }

        @Override
        public String getTSize() {
            return null;
        }

        @Override
        public void setTest() {

        }
    }

    interface Click {
        void Click();
    }

    interface WithText {
        String getText();

        void setTest();
    }

    interface Active {
        void isActive();
    }

    interface Editable {
        void isEditable();
    }

    interface WithSize {
        String getTSize();

        void setTest();
    }

    interface Removable {
        void Remove();
    }
}