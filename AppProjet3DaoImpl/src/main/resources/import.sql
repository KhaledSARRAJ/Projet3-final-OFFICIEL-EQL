
-- remplissage table "genre"
INSERT INTO `genre` (id, labelGenre) VALUES (1, "Homme");
INSERT INTO `genre` (id, labelGenre) VALUES (2, "Femme");
INSERT INTO `genre` (id, labelGenre) VALUES (3, "Autre");

-- remplissage table "ville"
INSERT INTO `ville` (id, CP, labelVille) VALUES (1, 93300, "Aubervilliers");
INSERT INTO `ville` (id, CP, labelVille) VALUES (2, 93110, "Rosny-sous-bois");
INSERT INTO `ville` (id, CP, labelVille) VALUES (3, 93600, "Aulnay-sous-Bois");
INSERT INTO `ville` (id, CP, labelVille) VALUES (4, 93100, "Montreuil"); 
INSERT INTO `ville` (id, CP, labelVille) VALUES (5, 93260, "Les Lilas");
INSERT INTO `ville` (id, CP, labelVille) VALUES (6, 93200, "Saint-Denis");
INSERT INTO `ville` (id, CP, labelVille) VALUES (7, 44000, "Nantes");
INSERT INTO `ville` (id, CP, labelVille) VALUES (8, 75000, "Paris");
INSERT INTO `ville` (id, CP, labelVille) VALUES (9, 69000, "Lyon");

-- remplissage table "motif_desinscription"
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (1, "Pas le temps");
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (2, "Mauvaises rencontres");
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (3, "Pas génereux");

-- remplissage table "activite"
INSERT INTO `activite` (id, labelActivite) VALUES (1, "promener le chien");
INSERT INTO `activite` (id, labelActivite) VALUES (2, "faire les courses");
INSERT INTO `activite` (id, labelActivite) VALUES (3, "aide aux devoirs");
INSERT INTO `activite` (id, labelActivite) VALUES (4, "faire le ménage");
INSERT INTO `activite` (id, labelActivite) VALUES (5, "faire du bricolage");
INSERT INTO `activite` (id, labelActivite) VALUES (6, "faire du jardinage");
INSERT INTO `activite` (id, labelActivite) VALUES (7, "transport pour rendez-vous");
INSERT INTO `activite` (id, labelActivite) VALUES (8, "achats en pharmacie");

-- remplissage table "motif_annulation"
INSERT INTO `motif_annulation` (id, labelMotifAnnulation) VALUES (1, "plus de besoin");
INSERT INTO `motif_annulation` (id, labelMotifAnnulation) VALUES (2, "imprévu");
INSERT INTO `motif_annulation` (id, labelMotifAnnulation) VALUES (3, "action déjà réalisée");

-- remplissage table "type_finalisation"
INSERT INTO `type_finalisation` (id, labelTypeFinal) VALUES (1, "Réalisé");
INSERT INTO `type_finalisation` (id, labelTypeFinal) VALUES (2, "difficultés rencontrées");
INSERT INTO `type_finalisation` (id, labelTypeFinal) VALUES (3, "non-réalisé");

-- remplissage table "probleme_demande"
INSERT INTO `probleme_demande` (id, labelProblemDemande) VALUES (1, "aucun problème rencontré");
INSERT INTO `probleme_demande` (id, labelProblemDemande) VALUES (2, "bénévole absent");
INSERT INTO `probleme_demande` (id, labelProblemDemande) VALUES (3, "service impossible à réaliser");
INSERT INTO `probleme_demande` (id, labelProblemDemande) VALUES (4, "travail mal exécuté");

-- remplissage table "heure"

INSERT INTO `heure` (id, heure) VALUES (1, "07");
INSERT INTO `heure` (id, heure) VALUES (2, "08");
INSERT INTO `heure` (id, heure) VALUES (3, "09");
INSERT INTO `heure` (id, heure) VALUES (4, "10");
INSERT INTO `heure` (id, heure) VALUES (5, "11");
INSERT INTO `heure` (id, heure) VALUES (6, "12");
INSERT INTO `heure` (id, heure) VALUES (7, "13");
INSERT INTO `heure` (id, heure) VALUES (8, "14");
INSERT INTO `heure` (id, heure) VALUES (9, "15");
INSERT INTO `heure` (id, heure) VALUES (10, "16");
INSERT INTO `heure` (id, heure) VALUES (11, "17");
INSERT INTO `heure` (id, heure) VALUES (12, "18");
INSERT INTO `heure` (id, heure) VALUES (13, "19");
INSERT INTO `heure` (id, heure) VALUES (14, "20");
INSERT INTO `heure` (id, heure) VALUES (15, "21");

-- remplissage table "minute"
INSERT INTO `minute` (id, minute) VALUES (1,"00");
INSERT INTO `minute` (id, minute) VALUES (2,"15");
INSERT INTO `minute` (id, minute) VALUES (3,"30");
INSERT INTO `minute` (id, minute) VALUES (4,"45");

-- remplissage table "user"
INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, login, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription) VALUES (1, 1, 2, null, "Jacquot", "Roch", "1991-09-26", "roch.jc@emaildfsdf", "111111", "123, ma voie","login", "123mdp", "2021-03-10", "Louvet", "Raphael", "1234560", null);
INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, login, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription) VALUES (2, 1, 2, null, "De la Montagne", "Gronounours", "1986-06-06", "adelie@gmail.com", "0768926699", "01, rue des pingouins", "Gronounours", "Gronounours", "2020-05-29", "Husky", "Siberien", "0692007128", null);
INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, login, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription) VALUES (3, 1, 2, null, "Sarraj", "Khaled", "1991-08-02", "khaledsarraj@gmail.com", "0785415256", "15, rue de Paris", "login", "khaled", "2020-05-29", "Marejus", "Benoit", "0685742635", null);
INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, login, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription) VALUES (4, 1, 2, null, "Marejus", "Benoit", "1991-08-02", "benoit@gmail.com", "0785415256", "15, avenue Foch", "login", "khaled", "2020-05-29", "Marejus", "Benoit", "0685742635", null);
INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, login, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription) VALUES (5, 1, 2, null, "Louvet", "Raphael", "1993-01-02", "raphaellouvet@gmail.com", "0185963245", "23, boulevard de Montrouge", "login", "raphael", "2020-05-29", "Marejus", "Benoit", "0685742635", null);
INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, login, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription) VALUES (6, 1, 2, null, "Sam-Yin-Yang", "Mikael", "1992-12-25", "mikaelsamyinyang@gmail.com", "0685741236", "86, rue du château", "login" , "mikael", "2020-05-29", "Marejus", "Benoit", "0685742635", null);

-- remplissage table "demande"
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (1, 1, 2, 12, 1, 13, 1, null, null, null, "2021-03-11", "12, avenue du saumon Gravlax", "2021-03-10", null, null, null, 1);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (2, 1, 2, 12, 1, 13, 1, null, null, null, "2021-03-11", "02, chemin de Traverse", "2021-03-10", null, null, null, 3);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (3, 1, 2, 12, 1, 13, 1, null, null, null, "2021-03-28", "45 voie Lactée", "2021-03-10", null, null, null, 4);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (4, 2, 2, 12, 1, 13, 1, null, null, null, "2021-03-31", "999, voie du Galaxy Express", "2021-03-10", null, null, null, 4);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (5, 2, 2, 12, 1, 13, 1, null, null, null, "2021-03-25", "86 rue de la choucroute garnie", "2021-03-10", null, null, null, 3);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (6, 1, 2, 12, 1, 13, 1, null, null, null, "2021-03-27", "789, voie de la Grande Ourse", "2021-03-10", null, null, null, 2);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (7, 7, 2, 12, 1, 13, 1, null, null, null, "2021-03-29", "13 boulevard de la Banquise", "2021-03-10", null, null, null, 1);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (8, 8, 2, 12, 1, 13, 1, null, null, null, "2021-03-30", "88, avenue de l'Espadon", "2021-03-10", null, null, null, 5);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (9, 9, 2, 12, 1, 13, 1, null, null, null, "2021-03-25", "09, rue des amis", "2021-03-10", null, null, null, 3);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (10, 1, 7, 12, 1, 13, 1, null, null, null, "2021-03-11", "12, avenue du saumon Gravlax", "2021-03-10", null, null, null, 4);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (11, 2, 7, 12, 1, 13, 1, null, null, null, "2021-03-11", "02, chemin de Traverse", "2021-03-10", null, null, null, 2);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (12, 3, 7, 12, 1, 13, 1, null, null, null, "2021-03-28", "45 voie Lactée", "2021-03-10", null, null, null, 1);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (13, 4, 7, 12, 1, 13, 1, null, null, null, "2021-03-31", "999, voie du Galaxy Express", "2021-03-10", null, null, null, 5);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (14, 5, 7, 12, 1, 13, 1, null, null, null, "2021-03-25", "86 rue de la choucroute garnie", "2021-03-10", null, null, null, 4);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (15, 6, 7, 12, 1, 13, 1, null, null, null, "2021-03-27", "789, voie de la Grande Ourse", "2021-03-10", null, null, null, 2);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (16, 7, 7, 12, 1, 13, 1, null, null, null, "2021-03-29", "13 boulevard de la Banquise", "2021-03-10", null, null, null, 3);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (17, 8, 7, 12, 1, 13, 1, null, null, null, "2021-03-30", "88, avenue de l'Espadon", "2021-03-10", null, null, null, 3);
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (18, 9, 7, 12, 1, 13, 1, null, null, null, "2021-03-25", "09, rue des amis", "2021-03-10", null, null, null, 2);



-- remplissage table "reponseAction"
INSERT INTO `reponseAction` (id, dateDesistement, dateRejet, dateReponse, dateSelection, demande_id, motifDesist_id, user_id) VALUES(1, null, null, "2021-03-10", null, 2, null, 2);
INSERT INTO `reponseAction` (id, dateDesistement, dateRejet, dateReponse, dateSelection, demande_id, motifDesist_id, user_id) VALUES(2, null, null, "2021-03-10", null, 2, null, 3);
INSERT INTO `reponseAction` (id, dateDesistement, dateRejet, dateReponse, dateSelection, demande_id, motifDesist_id, user_id) VALUES(3, null, null, "2021-03-10", null, 2, null, 4);
INSERT INTO `reponseAction` (id, dateDesistement, dateRejet, dateReponse, dateSelection, demande_id, motifDesist_id, user_id) VALUES(4, null, null, "2021-03-10", null, 2, null, 5);

INSERT INTO `reponseAction` (id, dateDesistement, dateRejet, dateReponse, dateSelection, demande_id, motifDesist_id, user_id) VALUES(5, null, null, "2021-03-10", null, 5, null, 4);
INSERT INTO `reponseAction` (id, dateDesistement, dateRejet, dateReponse, dateSelection, demande_id, motifDesist_id, user_id) VALUES(6, null, null, "2021-03-10", null, 5, null, 5);
INSERT INTO reponseAction (id, dateDesistement, dateRejet, dateReponse, dateSelection, demande_id, motifDesist_id, user_id) VALUES(7, null, null, "2021-03-10", "2021-03-12", 6, null, 2);
INSERT INTO `reponseAction` (id, dateDesistement, dateRejet, dateReponse, dateSelection, demande_id, motifDesist_id, user_id) VALUES(8, null, null, "2021-03-10", null, 6, null, 3);
