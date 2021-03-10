INSERT INTO `genre` (id, labelGenre) VALUES (1, "Homme");
INSERT INTO `genre` (id, labelGenre) VALUES (2, "Femme");
INSERT INTO `genre` (id, labelGenre) VALUES (3, "Autre");
INSERT INTO `ville` (id, CP, labelVille) VALUES (1, 92130, "Issy");
INSERT INTO `ville` (id, CP, labelVille) VALUES (2, 93130, "Rosny");
INSERT INTO `ville` (id, CP, labelVille) VALUES (3, 69130, "Caluire");
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (1, "Pas le temps");
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (2, "mauvaises rencontres");
INSERT INTO `motif_desinscription` (id, raisonDesinscription) VALUES (3, "pas génereux");

INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription)VALUES (1, 1, 1, null, "Jacquot", "Roch", "1991-09-26", "roch.jc@emaildfsdf", "111111", "123 ma voie", "123mdp", "2021-03-10", "Louvet", "Raphael", "1234560", null);
INSERT INTO `user` (id, genre_id, ville_id, desinscription_id, nomUtil, prenomUtil, dateNaissance, emailUtil, telUtil, voieUtil, mdpUtil, dateInscriUtil, nomContactUrg, prenomContactUrg, telContactUrg, dateDesinscription) VALUES (2, 2, 2, 2, "Toto", "Tototo", "1991-08-02", "Toto.jc@emaildfsdf", "2222222", "987 sa voie", "987mdp", "2020-05-29", "Marejus", "Benoit", "99887744", "2021-03-15");
INSERT INTO `demande` (id, ville_id, dateAction, voieAction, dateSoumission, dateAnnulation, dateCloture, noteEvaluation, user_id) VALUES (1, 1, "2021-03-11", "123 ma voie", "2021-03-10", null, null, null, 1);