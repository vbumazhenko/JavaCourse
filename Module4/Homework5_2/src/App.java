public class App {
    public static void main(String[] args) {

        String text = "$@London   is   the capital of Great Britain, its political, economic, and commercial centre. It is one of the largest cities in the world and the largest city in Europe. Its population is about 8 million. London is divided into several parts: the City, Westminster, the West End, and the East End. The heart of London is the City, its financial and business centre. Numerous banks, offices, and firms are situated there, including the Bank of England, the Stock Exchange, and the Old Bailey. Few people live here, but over a million people come to the City to work. There are some famous ancient buildings within the City. Perhaps the most striking of them is the St. Paul’s Cathedral, the greatest of English churches. It was built in the 17th century by Sir Christopher Wren. The Tower of London was founded by Julius Caesar and in 1066 rebuilt by William the Conqueror. It was used as a fortress, a royal palace, and a prison. Now it is a museum.";

        // Удаление лишних символов - все, кроме букв и пробелов.
        text = text.replaceAll("[^a-zA-Z\\s]", "");

        // Разделение строки на слова с разделителем "пробел", с учетом того, что пробелов может быть несколько подряд.
        String[] lines = text.split("\\s+");

        for (String str : lines) {
            System.out.println(str);
        }

    }
}
