package modul13;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

public class HomeWork13Test {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        System.out.println("-------------------HomWork13 task1/1-------------------");
        System.out.println(HomeWork13.addNewUser(newUsers()));
        System.out.println("-------------------HomWork13 task1/2-------------------");
        Optional<User> userByIdToUpdate = HomeWork13.getIdUsers(7);
        System.out.println(HomeWork13.getIdUsers(7));
        if (userByIdToUpdate.isPresent()) {
            User userToUpdate = userByIdToUpdate.get();
            userToUpdate.setUsername("OPACHA");
            Optional<User> updatedUser = HomeWork13.updateUser(userToUpdate);
            updatedUser.ifPresent(System.out::println);
        } else {
            System.out.println("User with this ID not found");
        }
        System.out.println("-------------------HomWork13 task1/3-------------------");
        System.out.println(HomeWork13.deleteUser(7));
        System.out.println("-------------------HomWork13 task1/4-------------------");
        System.out.println(HomeWork13.getInfoAllUsers());
        System.out.println("-------------------HomWork13 task1/5-------------------");
        System.out.println(HomeWork13.getIdUsers(4));
        System.out.println("-------------------HomWork13 task1/6-------------------");
        System.out.println(HomeWork13.getUsersName("Elwyn.Skiles"));
        System.out.println("--------------------HomWork13 task2--------------------");
        System.out.println(HomeWork13.getCommentsOfUsersLastPost(10));
        System.out.println("--------------------HomWork13 task3--------------------");
        System.out.println(HomeWork13.getUncomletedTasks(4));


    }

    private static User newUsers() {
        User user = new User();
        user.setName("Ismahilov Kostya");
        user.setUsername("Spy");
        user.setEmail("OpaCha.ua.94@gmail.com");
        user.setPhone("+380964894532");
        user.setWebsite("Test");
        Address address = new Address();
        address.setStreet("Spivdrugnosti");
        address.setCity("Kryvyi Rih");
        address.setSuite("Suite 898");
        address.setZipcode("500858");
        Geo geo = new Geo();
        geo.setLat(-54.111);
        geo.setLng(54.034);
        address.setGeo(geo);
        user.setAddress(address);
        Company company = new Company();
        company.setBs("test");
        company.setName("test");
        company.setCatchPhrase("test");
        user.setCompany(company);
        return user;
    }
}
