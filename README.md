
# Projet Talend : ETL pour l'analyse des remboursements de soins

## 📌 Contexte
Ce projet consiste en la modélisation d'un Data Warehouse en étoile pour analyser les remboursements de soins d'une mutuelle. Les données sont extraites, transformées et chargées (ETL) à l'aide de Talend, puis visualisées via des tableaux de bord interactifs sous Tableau.

## 🎯 Objectifs
- Modéliser un Data Warehouse en étoile pour les remboursements de soins.
- Implémenter un processus ETL avec Talend pour charger les données.
- Analyser les tendances de remboursement via des tableaux de bord.


## 📂 Structure du projet
```
.git/
.settings/
code/               # Code source des jobs Talend
components/         # Composants personnalisés
context/            # Contextes Talend (variables d'environnement)
documentations/     # Documentation du projet
images/             # Images utilisées dans la documentation
metadata/           # Métadonnées (connexions, schémas, etc.)
poms/               # Fichiers POM pour la gestion des dépendances
process/            # Processus métier
routes/             # Routes (si utilisation d'ESB)
sqlPatterns/        # Modèles SQL réutilisables
temp/               # Fichiers temporaires
.project            # Fichier de configuration du projet Talend
talend.project      # Fichier de projet Talend
recycle_bin.index   # Fichier de la corbeille Talend
```

## ⚙️ Prérequis
- **Talend Studio** 
- **MySQL** (base de données cible)
- **Accès aux données sources** (fichiers CSV)

## 🛠 Installation et configuration
1. **Cloner le dépôt :**
   ```bash
   git clone https://github.com/inzabdou/talend-healthcare-reimbursements-etl.git
   ```

2. **Importer le projet dans Talend Studio :**
   - Ouvrir Talend Studio.
   - Sélectionner `File > Import > Existing Projects into Workspace`.
   - Choisir le dossier cloné comme racine du projet.
   - Cliquer sur `Finish`.

3. **Configurer la base de données MySQL :**
   - Modifier les paramètres de connexion dans `metadata` pour correspondre à votre environnement :
     - **URL** : `jdbc:mysql://localhost:3306/your_database`
     - **Utilisateur** : `your_username`
     - **Mot de passe** : `your_password`
   - Exécuter le script de création des tables :  
     Le script est disponible dans `script_creation_tables_pour_talend_mysql.txt`.

4. **Configurer les chemins d'accès vers:**
     - Le répertoire `data/raw/` contenant les fichiers sources.
     - Le répertoire `data/logs/` pour les fichiers de log.

## 🚀 Exécution des jobs
Exécuter les jobs dans l'ordre suivant :

1. **`job_acte`**  
   Charge les données liées aux actes médicaux.

2. **`job_adresse`**  
   Charge les données d'adresse des bénéficiaires.

3. **`job_beneficiaires`**  
   Charge les données des bénéficiaires.

4. **`job_contrat`**  
   Charge les données des contrats.

5. **`job_temps`**  
   Charge les dimensions temporelles.

6. **`job_SinisteFact`**  
   Charge les faits de sinistres (remboursements).

## 📊 Résultats attendus
- Un Data Warehouse structuré en étoile dans MySQL.
- Des données nettoyées et transformées prêtes pour l'analyse.
- Des logs d'exécution pour le suivi des erreurs.

## 📝 Documentation supplémentaire
- Consultez le dossier `documentations/` pour :
  - La modélisation du Data Warehouse.
  - Les spécifications des jobs Talend.
  - Les captures d'écran des tableaux de bord Tableau.
