-- remplissage table "genre"
INSERT INTO `genre` (id, labelGenre) VALUES (1, "Homme");
INSERT INTO `genre` (id, labelGenre) VALUES (2, "Femme");
INSERT INTO `genre` (id, labelGenre) VALUES (3, "Autre");

-- remplissage table "ville"
INSERT INTO `ville` (id, CP, labelVille) VALUES (1, 92130, "Issy");
INSERT INTO `ville` (id, CP, labelVille) VALUES (2, 93130, "Rosny");
INSERT INTO `ville` (id, CP, labelVille) VALUES (3, 69130, "Caluire");

-- remplissage table "motif_desinscription"
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (1, "Pas le temps");
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (2, "mauvaises rencontres");
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (3, "pas génereux");

-- remplissage table "activite"
INSERT INTO `activite` (id, labelActivite) VALUES (1, "promener le chien");
INSERT INTO `activite` (id, labelActivite) VALUES (2, "faire les courses");
INSERT INTO `activite` (id, labelActivite) VALUES (3, "aide aux devoirs");
INSERT INTO `activite` (id, labelActivite) VALUES (4, "faire le ménage");
INSERT INTO `activite` (id, labelActivite) VALUES (5, "faire du bricolage");

-- remplissage table "motif_annulation"
INSERT INTO `motif_annulation` (id, labelMotifAnnulation) VALUES (1, "plus de besoin");
INSERT INTO `motif_annulation` (id, labelMotifAnnulation) VALUES (2, "imprévu");
INSERT INTO `motif_annulation` (id, labelMotifAnnulation) VALUES (3, "action déjà réalisée");

-- remplissage table "type_finalisation"
INSERT INTO `type_finalisation` (id, labelTypeFinal) VALUES (1, "standard");
INSERT INTO `type_finalisation` (id, labelTypeFinal) VALUES (2, "difficultés rencontrées");
INSERT INTO `type_finalisation` (id, labelTypeFinal) VALUES (3, "non-aboutie");

-- remplissage table "probleme_demande"
INSERT INTO `probleme_demande` (id, labelProblemDemande) VALUES (1, "bénévole absent");
INSERT INTO `probleme_demande` (id, labelProblemDemande) VALUES (2, "service impossible à réaliser");
INSERT INTO `probleme_demande` (id, labelProblemDemande) VALUES (3, "travail mal exécuté");

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
INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription)VALUES (1, 1, 1, null, "Jacquot", "Roch", "1991-09-26", "roch.jc@emaildfsdf", "111111", "123 ma voie", "123mdp", "2021-03-10", "Louvet", "Raphael", "1234560", null);
INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription) VALUES (2, 2, 2, 2, "Toto", "Tototo", "1991-08-02", "Toto.jc@emaildfsdf", "2222222", "987 sa voie", "987mdp", "2020-05-29", "Marejus", "Benoit", "99887744", "2021-03-15");

-- remplissage table "demande"
INSERT INTO `demande` (id, ville_id, activite_id, heureDebut_id, minuteDebut_id, heureFin_id, minuteFin_id, motifAnnul_id, finaleDemande_id, probDemande_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (1, 1, 1, 1, 1, 3, 2, null, null, null, "2021-03-11", "123 ma voie", "2021-03-10", null, null, null, 1);