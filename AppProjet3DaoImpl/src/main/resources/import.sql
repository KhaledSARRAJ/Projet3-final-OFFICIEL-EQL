INSERT INTO `genre` (id, labelGenre) VALUES (1, "Homme");
INSERT INTO `genre` (id, labelGenre) VALUES (2, "Femme");
INSERT INTO `genre` (id, labelGenre) VALUES (3, "Autre");
INSERT INTO `ville` (id, CP, labelVille) VALUES (1, 92130, "Issy");
INSERT INTO `ville` (id, CP, labelVille) VALUES (2, 93130, "Rosny");
INSERT INTO `ville` (id, CP, labelVille) VALUES (3, 69130, "Caluire");
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (1, "Pas le temps");
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (2, "mauvaises rencontres");
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (3, "pas génereux");

-- remplissage table "activite"
INSERT INTO 'activite' (id, labelActivite) VALUES (1, "promener le chien");
INSERT INTO 'activite' (id, labelActivite) VALUES (1, "faire les courses");
INSERT INTO 'activite' (id, labelActivite) VALUES (1, "aide aux devoirs");
INSERT INTO 'activite' (id, labelActivite) VALUES (1, "faire le ménage");
INSERT INTO 'activite' (id, labelActivite) VALUES (1, "faire du bricolage");

-- remplissage table "motif_annulation"
INSERT INTO 'motif_annulation' (id, labelMotifAnnulation) VALUES (1, "plus de besoin");
INSERT INTO 'motif_annulation' (id, labelMotifAnnulation) VALUES (2, "imprévu");
INSERT INTO 'motif_annulation' (id, labelMotifAnnulation) VALUES (1, "action déjà réalisée");

-- remplissage table "type_finalisation"
INSERT INTO 'type_finalisation' (id, labelTypeFinal) VALUES (1, "standard");
INSERT INTO 'type_finalisation' (id, labelTypeFinal) VALUES (2, "difficultés rencontrées");
INSERT INTO 'type_finalisation' (id, labelTypeFinal) VALUES (3, "non-aboutie");

-- remplissage table "probleme_demande"
INSERT INTO 'probleme_demande' (id, labelProblemDemande) VALUES (1, "bénévole absent");
INSERT INTO 'probleme_demande' (id, labelProblemDemande) VALUES (2, "service impossible à réaliser");
INSERT INTO 'probleme_demande' (id, labelProblemDemande) VALUES (3, "travail mal exécuté");

-- remplissage table "heure"
INSERT INTO 'heure' (id, heure) VALUES (1, 7);
INSERT INTO 'heure' (id, heure) VALUES (1, 8);
INSERT INTO 'heure' (id, heure) VALUES (1, 9);
INSERT INTO 'heure' (id, heure) VALUES (1, 10);
INSERT INTO 'heure' (id, heure) VALUES (1, 11);
INSERT INTO 'heure' (id, heure) VALUES (1, 12);
INSERT INTO 'heure' (id, heure) VALUES (1, 13);
INSERT INTO 'heure' (id, heure) VALUES (1, 14);
INSERT INTO 'heure' (id, heure) VALUES (1, 15);
INSERT INTO 'heure' (id, heure) VALUES (1, 16);
INSERT INTO 'heure' (id, heure) VALUES (1, 17);
INSERT INTO 'heure' (id, heure) VALUES (1, 18);
INSERT INTO 'heure' (id, heure) VALUES (1, 19);
INSERT INTO 'heure' (id, heure) VALUES (1, 20);
INSERT INTO 'heure' (id, heure) VALUES (1, 21);

-- remplissage table "minute"
INSERT INTO 'minute' (id, minute) VALUES (1,0);
INSERT INTO 'minute' (id, minute) VALUES (1,15);
INSERT INTO 'minute' (id, minute) VALUES (1,30);
INSERT INTO 'minute' (id, minute) VALUES (1,45);


INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription)VALUES (1, 1, 1, null, "Jacquot", "Roch", "1991-09-26", "roch.jc@emaildfsdf", "111111", "123 ma voie", "123mdp", "2021-03-10", "Louvet", "Raphael", "1234560", null);
INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription) VALUES (2, 2, 2, 2, "Toto", "Tototo", "1991-08-02", "Toto.jc@emaildfsdf", "2222222", "987 sa voie", "987mdp", "2020-05-29", "Marejus", "Benoit", "99887744", "2021-03-15");
INSERT INTO `demande` (id, ville_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (1, 1, "2021-03-11", "123 ma voie", "2021-03-10", null, null, null, 1);