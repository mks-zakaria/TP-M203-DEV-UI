# AlAmal — M203 Développer des interfaces utilisateurs sous Android

Projet Android Studio des stagiaires (OFPPT · ISTA Khouribga · DEVOM). **Un seul projet pour tout le module** :

- **PLAYGROUND (mode cours)** : un écran **vide**. Pendant le cours, vous y tapez vous-même les exemples montrés
  au tableau / au vidéoprojecteur, et vous les testez tout de suite.
- **MODE TP** : un bouton par TP. Chaque écran du TP existe déjà mais il est **vide** : c'est à vous de le
  construire en suivant l'énoncé que donne le formateur.

Déjà fournis : les **images** du module (dossiers `res/drawable…`, préfixes `sNN_` pour le cours et `tpNN_` pour
les TP) et, pour chaque TP, ses **textes, couleurs, dimensions et styles** (`res/values/tpNN_strings.xml`, `tpNN_colors.xml`,
`tpNN_dimens.xml`, `tpNN_styles.xml`). Les layouts et le code Kotlin, c'est vous qui les écrivez.

## 1. Récupérer le projet (une seule fois, à la maison, avec Internet)

1. Récupérez le dépôt :
   - avec Git : `git clone https://github.com/mks-zakaria/TP-M203-DEV-UI-STUDENTS.git` ;
   - ou sur https://github.com/mks-zakaria/TP-M203-DEV-UI-STUDENTS : **Code › Download ZIP**, puis décompressez le dossier.
2. Android Studio → **File › Open…** → choisissez le dossier du projet (celui qui contient `settings.gradle.kts`)
   → **Trust Project**.
3. Attendez la fin de la synchronisation Gradle (barre de progression en bas à droite).
4. Choisissez l'émulateur **Pixel 9** (ou votre téléphone) puis **▶ Run** : l'écran « Playground » s'affiche.

Toutes les bibliothèques du module (RecyclerView, Glide, Navigation, Compose…) sont déjà déclarées : ensuite, en
salle, le projet s'ouvre et se lance **sans Internet**. **N'ajoutez jamais de bibliothèque** dans `build.gradle.kts`.

## 2. Playground : tester les exemples du cours

- Layout : `app/src/main/res/layout/activity_playground.xml`
- Code : `app/src/main/java/ma/ofppt/ista/alamal/PlaygroundActivity.kt` (dans `onCreate`, après `setContentView`)

Effacez et réécrivez librement : le Playground sert à essayer. Les images et les textes du cours sont déjà là
(`@drawable/s05_…`, `@string/s05_…`, `@color/s05_…`).

## 3. Changer de mode : Playground ↔ TP

L'application démarre sur l'activité qui contient le bloc **MAIN / LAUNCHER** dans
`app/src/main/AndroidManifest.xml` (un seul bloc dans tout le fichier).

1. Ouvrez `app/src/main/AndroidManifest.xml`.
2. Coupez (**Ctrl+X**) les 4 lignes `<intent-filter> … </intent-filter>` de `PlaygroundActivity`.
3. Collez-les (**Ctrl+V**) dans `TpActivity`, à la place du commentaire
   `<!-- (le bloc intent-filter MAIN / LAUNCHER se colle ici) -->`.
4. **▶ Run** : le menu « MODE TP » s'affiche. Pour revenir au Playground, faites l'inverse.

> « Default Activity not found » : le bloc a été supprimé au lieu d'être déplacé → recollez-le.

## 4. Faire un TP

1. Passez en **MODE TP**, lancez ▶ et touchez le TP du jour : l'écran affiche « TP SNN — … : à vous de jouer ».
2. Vos fichiers : le dossier `app/src/main/java/ma/ofppt/ista/alamal/tp/sNN/` (les écrans sont déjà créés et
   déclarés) et les layouts `res/layout/tpNN_….xml`. Si vous créez un nouveau fichier de ressource, donnez-lui le
   préfixe `tpNN_` (exemple : `res/layout/tp05_ligne_poste.xml`).
3. Fournis : les images `res/drawable…/tpNN_…`, les textes `@string/tpNN_…`, les couleurs `@color/tpNN_…`
   (et, pour S14, le dossier `traductions/`).
4. Ne renommez pas les écrans fournis.

Conseil Git : enregistrez votre travail après chaque TP (`git add .` puis `git commit -m "TP S05 terminé"`).

## 5. Les corrigés (après le TP)

Le corrigé de chaque TP est dans une **branche** du dépôt : `corrige-s01`, `corrige-s02`… (le formateur vous dit
quand elle est disponible).

- Sur GitHub : menu **main ▾** (en haut à gauche) › choisissez `corrige-s05` pour lire les fichiers en ligne.
- Dans Android Studio (après avoir enregistré votre travail avec `git commit`) :
  `git fetch` puis `git checkout corrige-s05` ; pour revenir à votre travail : `git checkout main`.

## 6. Les TP

| Séance | TP | Où |
|---|---|---|
| S01 | Écran d'accueil Al Amal | `tp/s01/` · images `tp01_…` |
| S02 | Réserver un poste chez Al Amal | `tp/s02/` · images `tp02_…` |
| S03 | Fiche client typée et validée | `tp/s03/` · images `tp03_…` |
| S04 | Liste « Nos pizzas » | `tp/s04/` · images `tp04_…` |
| S05 | Écran de connexion du cybercafé Al Amal | `tp/s05/` · images `tp05_…` |
| S06 | Tableau de bord du cybercafé Al Amal | `tp/s06/` · images `tp06_…` |
| S07 | Écran d'accueil défilant Al Amal | `tp/s07/` · images `tp07_…` |
| S08 | Converter à deux fragments | `tp/s08/` · images `tp08_…` |
| S09 | Réserver d'un clic, annuler d'un appui long | `tp/s09/` · images `tp09_…` |
| S10 | Accueil Al Amal : focus et swipe | `tp/s10/` · images `tp10_…` |
| S11 | Les stars du tournoi Al Amal | `tp/s11/` · images `tp11_…` |
| S13 | Habiller la fiche d'inscription Al Amal | `tp/s13/` · images `tp13_…` |
| S14 | Carte des services adaptative | `tp/s14/` · images `tp14_…` |
| S15 | Réservation en Material Design | `tp/s15/` · images `tp15_…` |
| S16 | La boule de la salle de jeux | `tp/s16/` · images `tp16_…` |
| S17 | L'enseigne et le poste Al Amal | `tp/s17/` · images `tp17_…` |
| S18 | Les postes du cybercafé Al Amal | `tp/s18/` · images `tp18_…` |
| S19 | Le tiroir d'Al Amal (Navigation Drawer) | `tp/s19/` · images `tp19_…` |
| S20 | Accueil animé d'Al Amal | `tp/s20/` · images `tp20_…` |
| S21 | L'affiche animée du tournoi | `tp/s21/` · images `tp21_…` |
| S22 | Le dé du tournoi | `tp/s22/` · images `tp22_…` |
| S23 | Liste des postes animée | `tp/s23/` · images `tp23_…` |
| S24 | Explode, Slide ou Fade ? | `tp/s24/` · images `tp24_…` |
| S25 | Mini-projet « Tournoi du samedi » | `tp/s25/` · images `tp25_…` |
| S27 | Crossfade entre deux vues | `tp/s27/` · images `tp27_…` |
| S28 | Panneau d'animations sur une carte | `tp/s28/` · images `tp28_…` |
| S29 | Révéler et retourner la carte fidélité | `tp/s29/` · images `tp29_…` |
| S30 | Mini-projet : l'accueil animé d'Al Amal | `tp/s30/` · images `tp30_…` |
| S32 | Premier projet Compose | `tp/s32/` · images `tp32_…` |
| S33 | La fiche d'un poste | `tp/s33/` · images `tp33_…` |
| S34 | L'écran d'accueil en Compose | `tp/s34/` · images `tp34_…` |
| S35 | Styliser l'écran d'accueil avec les modifiers | `tp/s35/` · images `tp35_…` |
| S36 | Vue hybride XML / Compose | `tp/s36/` · images `tp36_…` |
| S37 | Animations Compose : la carte d'un poste | `tp/s37/` · images `tp37_…` |
| S38 | Interface réactive : la caisse Al Amal | `tp/s38/` · images `tp38_…` |
| S39 | Tester l'écran de la caisse | `tp/s39/` · images `tp39_…` |
