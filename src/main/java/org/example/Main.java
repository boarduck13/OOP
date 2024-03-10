public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport = "4444 № 444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birhtday = new FormDate();

        post.birhtday.day = 13;
        post.birhtday.month = 6;
        post.birhtday.year = 1999;

        System.out.println(post.birhtday.day);
        System.out.println(post.birhtday.month);
        System.out.println(post.birhtday.year);
        System.out.println(post.name);
        System.out.println(post.passport);
        System.out.println(post.patronymic);
        System.out.println(post.phone);
        System.out.println(post.surname);
        System.out.println(post.subscription);
    }
}