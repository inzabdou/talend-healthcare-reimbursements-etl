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


public class HealthServiceUtils {

    /**
     * Retourne la catégorie de la prestation de santé selon la logique définie.
     * @param designationActe La désignation de l'acte de santé à évaluer.
     * @return La catégorie de l'acte de santé sous forme de chaîne.
     */
    public static String getServiceCategory(String designationActe) {
        // Vérification si l'acte commence par "PHARMA"
        if (designationActe != null && designationActe.startsWith("PH")) {
            return "PHARMA";
        }

        // Vérification si l'acte commence par "MAJ"
        else if (designationActe != null && designationActe.startsWith("MAJ")) {
            return "MAJ";
        }
        
        // Vérification si l'acte commence par "PREL"
        else if (designationActe != null && designationActe.startsWith("PREL")) {
            return "PREL";
        }
        
        // Vérification si l'acte commence par "PREL"
        else if (designationActe != null && designationActe.startsWith("CHIRUR")) {
            return "CHIRURGIE";
        }
        
        // Vérification si l'acte commence par "RADIO"
        else if (designationActe != null && designationActe.startsWith("RADIO")) {
            return "RADIO";
        }

        // Vérification si l'acte commence par "MAJ"
        else if (designationActe != null && designationActe.startsWith("PREP")) {
            return "PREP";
        }
        
        // Vérification si l'acte commence par "MAJ"
        else if (designationActe != null && designationActe.startsWith("ACTE")) {
            return "ACTES";
        }
        
        // Vérification si l'acte commence par "MAJ"
        else if (designationActe != null && designationActe.startsWith("CONS")) {
            return "CONSULT";
        }
        
        // Vérification si l'acte commence par "MAJ"
        else if (designationActe != null && designationActe.startsWith("DEPL")) {
            return "DEPLACEMENT";
        }
        
        // Vérification si l'acte commence par "MAJ"
        else if (designationActe != null && designationActe.startsWith("FORF")) {
            return "FORFAIT";
        }
        
        // Vérification si l'acte commence par "MAJ"
        else if (designationActe != null && designationActe.startsWith("AN")) {
            return "ANATO";
        }
        
        // Vérification si l'acte commence par "MAJ"
        else if (designationActe != null && designationActe.startsWith("PART")) {
            return "PART";
        }


        // Séparation du texte pour obtenir la première partie avant un espace
        else if (designationActe != null && designationActe.trim().length() > 0) {
            return designationActe.split(" ")[0];
        }

        // Si aucune condition n'est remplie, retourner la valeur originale de DESIGNATION_ACTE
        return designationActe;
    }
}

