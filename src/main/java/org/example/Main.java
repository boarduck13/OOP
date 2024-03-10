public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday.day = 13;   //заполнили поле day в поле birthday
        post.birthday.month = 6;  //заполнили поле month в поле birthday
        post.birthday.year = 1999; //заполнили поле year в поле birthday

        post.name = "Иван";                 //заполнили поле name
        post.passport = "4444 № 44444444";  //заполнили поле passport
        post.patronymic = "Иванович";       //заполнили поле patronymic
        post.phone = "+7 (999)-999-99-99";  //заполнили поле phone
        post.surname = "Иванов";            //заполнили поле surname
        post.subscription = true;           //заполнили поле subscription

    }
}