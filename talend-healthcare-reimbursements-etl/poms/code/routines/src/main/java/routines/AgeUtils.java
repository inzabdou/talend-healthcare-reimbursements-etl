package routines;

/*
 * user specification: the function's comment should contain keys as follows: 1. write about the function's comment.but
 * it must be before the "{talendTypes}" key.
 * 
 * 2. {talendTypes} 's value must be talend Type, it is required . its value should be one of: String, char | Character,
 * long | Long, int | Integer, boolean | Boolean, byte | Byte, Date, double | Double, float | Float, Object, short |
 * Short
 * 
 * 3. {Category} define a category for the Function. it is required. its value is user-defined .
 * 
 * 4. {param} 's format is: {param} <type>[(<default value or closed list values>)] <name>[ : <comment>]
 * 
 * <type> 's value should be one of: string, int, list, double, object, boolean, long, char, date. <name>'s value is the
 * Function's parameter name. the {param} is optional. so if you the Function without the parameters. the {param} don't
 * added. you can have many parameters for the Function.
 * 
 * 5. {example} gives a example for the Function. it is optional.
 */

public class AgeUtils {

    /**
     * Retourne le groupe d'âge correspondant à un âge donné.
     * @param age L'âge à évaluer
     * @return Le groupe d'âge sous forme de chaîne de caractères
     */
    public static String getAgeGroup(int age) {
        if (age <= 2) {
            return "Bébé";
        } else if (age >= 3 && age <= 13) {
            return "Enfant";
        } else if (age >= 14 && age <= 25) {
            return "Adolescent";
        } else if (age >= 26 && age <= 59) {
            return "Adulte";
        } else {
            return "Sénior";
        }
    }
}

