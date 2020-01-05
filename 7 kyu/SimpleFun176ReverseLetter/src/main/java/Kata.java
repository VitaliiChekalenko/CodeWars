/*Task
Given a string str, reverse it omitting all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".

Input/Output
[input] string str

A string consists of lowercase latin letters, digits and symbols.

[output] a string*/

public class Kata {
    public static String reverseLetter(final String s) {
        return new StringBuilder(s.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}


//public class Kata {
//   public static String reverseLetter(final String str) {
//
//       String s = "";
//       String[] st = str.split("");
//        for (String q: st    ) {
//            if(!q.matches("[\\d!\"№;%:?*\\(\\)@#$&{}\\[\\]_<>^\\s\\+\\-/|=\\\\]")){
//                s+=q;
//            }
//        }
//        return new StringBuilder(s).reverse().toString();

//    return new StringBuilder(str.replaceAll("%", "")   // Процент
//                .replaceAll("[\\d]", "")   // Процент
//               .replaceAll(" ", "")   // Пробел
//               .replaceAll("\t", "")  // Табуляция (заменяем на пробел)
//               .replaceAll("\n", "")  // Переход строки (заменяем на пробел)
//               .replaceAll("\r", "")  // Возврат каретки (заменяем на пробел)
//               .replaceAll("!", "")   // Восклицательный знак
//               .replaceAll("\"", "")  // Двойная кавычка
//               .replaceAll("#", "")   // Октоторп, решетка
//               .replaceAll("\\$", "") // Знак доллара
//               .replaceAll("&", "")   // Амперсанд
//               .replaceAll("'", "")   // Одиночная кавычка
//               .replaceAll("\\(", "") // Открывающаяся скобка
//               .replaceAll("\\)", "") // Закрывающаяся скобка
//               .replaceAll("\\*", "") // Звездочка
//               .replaceAll("\\+", "") // Знак плюс
//               .replaceAll(",", "")   // Запятая
//               .replaceAll("-", "")   // Дефис
//               .replaceAll("\\.", "") // Точка
//               .replaceAll("/", "")   // Слеш, косая черта
//               .replaceAll(":", "")   // Двоеточие
//               .replaceAll(";", "")   // Точка с запятой
//               .replaceAll("<", "")   // Открывающаяся угловая скобка
//               .replaceAll("=", "")   // Знак равно
//               .replaceAll(">", "")   // Закрывающаяся угловая скобка
//               .replaceAll("\\?", "") // Вопросительный знак
//               .replaceAll("@", "")   // At sign, по цене, собачка
//               .replaceAll("\\[", "") // Открывающаяся квадратная скобка
//               .replaceAll("\\\\", "") // Одиночный обратный слеш '\'
//               .replaceAll("\\]", "") // Закрывающаяся квадратная скобка
//               .replaceAll("\\^", "") // Циркумфлекс
//               .replaceAll("_", "")   // Нижнее подчеркивание
//               .replaceAll("`", "")   // Гравис
//               .replaceAll("\\{", "") // Открывающаяся фигурная скобка
//               .replaceAll("\\|", "") // Вертикальная черта
//               .replaceAll("\\}", "") // Закрывающаяся фигурная скобка
//               .replaceAll("~", "")  // Тильда.replaceAll("%", "%25")   // Процент
//            .replaceAll(" ", "")   // Пробел
//               .replaceAll("\t", "")  // Табуляция (заменяем на пробел)
//               .replaceAll("\n", "")  // Переход строки (заменяем на пробел)
//               .replaceAll("\r", "")  // Возврат каретки (заменяем на пробел)
//               .replaceAll("!", "")   // Восклицательный знак
//               .replaceAll("\"", "")  // Двойная кавычка
//               .replaceAll("#", "")   // Октоторп, решетка
//               .replaceAll("\\$", "") // Знак доллара
//               .replaceAll("&", "")   // Амперсанд
//               .replaceAll("'", "")   // Одиночная кавычка
//               .replaceAll("\\(", "") // Открывающаяся скобка
//               .replaceAll("\\)", "") // Закрывающаяся скобка
//               .replaceAll("\\*", "") // Звездочка
//               .replaceAll("\\+", "") // Знак плюс
//               .replaceAll(",", "")   // Запятая
//               .replaceAll("-", "")   // Дефис
//               .replaceAll("\\.", "") // Точка
//               .replaceAll("/", "")   // Слеш, косая черта
//               .replaceAll(":", "")   // Двоеточие
//               .replaceAll(";", "")   // Точка с запятой
//               .replaceAll("<", "")   // Открывающаяся угловая скобка
//               .replaceAll("=", "")   // Знак равно
//               .replaceAll(">", "")   // Закрывающаяся угловая скобка
//               .replaceAll("\\?", "") // Вопросительный знак
//               .replaceAll("@", "")   // At sign, по цене, собачка
//               .replaceAll("\\[", "") // Открывающаяся квадратная скобка
//               .replaceAll("\\\\", "") // Одиночный обратный слеш '\'
//               .replaceAll("\\]", "") // Закрывающаяся квадратная скобка
//               .replaceAll("\\^", "") // Циркумфлекс
//               .replaceAll("_", "")   // Нижнее подчеркивание
//               .replaceAll("`", "")   // Гравис
//               .replaceAll("\\{", "") // Открывающаяся фигурная скобка
//               .replaceAll("\\|", "") // Вертикальная черта
//               .replaceAll("\\}", "") // Закрывающаяся фигурная скобка
//               .replaceAll("~", "")).reverse().toString();  // Тильда
//    }
//}