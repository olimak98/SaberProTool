ALTER TABLE Prueba_Programa_Usuario DROP CONSTRAINT FKPrueba_Pro963603;
ALTER TABLE Respuesta_Prueba_Programa_Usuario_Pregunta DROP CONSTRAINT FKRespuesta_860917;
ALTER TABLE Respuesta_Prueba_Programa_Usuario_Pregunta DROP CONSTRAINT FKRespuesta_550839;
ALTER TABLE Prueba_Programa_Usuario_Pregunta DROP CONSTRAINT FKPrueba_Pro708530;
ALTER TABLE Prueba_Programa_Usuario_Pregunta DROP CONSTRAINT FKPrueba_Pro965592;
ALTER TABLE Prueba_Programa_Usuario DROP CONSTRAINT FKPrueba_Pro448518;
ALTER TABLE Prueba_Programa_Usuario DROP CONSTRAINT FKPrueba_Pro62717;
ALTER TABLE Prueba DROP CONSTRAINT FKPrueba881316;
ALTER TABLE Prueba_Modulo DROP CONSTRAINT FKPrueba_Mod371291;
ALTER TABLE Prueba_Modulo DROP CONSTRAINT FKPrueba_Mod924734;
ALTER TABLE Respuesta DROP CONSTRAINT FKRespuesta329003;
ALTER TABLE Pregunta DROP CONSTRAINT FKPregunta566309;
ALTER TABLE Pregunta DROP CONSTRAINT FKPregunta770318;
ALTER TABLE Resultado_Real DROP CONSTRAINT FKResultado_660041;
ALTER TABLE Resultado_Real DROP CONSTRAINT FKResultado_42940;
ALTER TABLE Matricula DROP CONSTRAINT FKMatricula57382;
ALTER TABLE Matricula DROP CONSTRAINT FKMatricula639937;
ALTER TABLE Opcion DROP CONSTRAINT FKOpcion285869;
ALTER TABLE Permiso DROP CONSTRAINT FKPermiso521186;
ALTER TABLE Permiso DROP CONSTRAINT FKPermiso793993;
ALTER TABLE Modulo DROP CONSTRAINT FKModulo476725;
ALTER TABLE Usuario DROP CONSTRAINT FKUsuario12815;
ALTER TABLE Programa_Modulo DROP CONSTRAINT FKPrograma_M109512;
ALTER TABLE Programa_Modulo DROP CONSTRAINT FKPrograma_M775127;
ALTER TABLE Programa_Usuario DROP CONSTRAINT FKPrograma_U742836;
ALTER TABLE Programa_Usuario DROP CONSTRAINT FKPrograma_U800424;
ALTER TABLE Programa DROP CONSTRAINT FKPrograma210184;
DROP TABLE IF EXISTS Estado_Prueba CASCADE;
DROP TABLE IF EXISTS Facultad CASCADE;
DROP TABLE IF EXISTS Grupo_Opcion CASCADE;
DROP TABLE IF EXISTS Matricula CASCADE;
DROP TABLE IF EXISTS Modulo CASCADE;
DROP TABLE IF EXISTS Opcion CASCADE;
DROP TABLE IF EXISTS Parametro CASCADE;
DROP TABLE IF EXISTS Permiso CASCADE;
DROP TABLE IF EXISTS Pregunta CASCADE;
DROP TABLE IF EXISTS Programa CASCADE;
DROP TABLE IF EXISTS Programa_Modulo CASCADE;
DROP TABLE IF EXISTS Programa_Usuario CASCADE;
DROP TABLE IF EXISTS Prueba CASCADE;
DROP TABLE IF EXISTS Prueba_Modulo CASCADE;
DROP TABLE IF EXISTS Prueba_Programa_Usuario CASCADE;
DROP TABLE IF EXISTS Prueba_Programa_Usuario_Pregunta CASCADE;
DROP TABLE IF EXISTS Prueba_Real CASCADE;
DROP TABLE IF EXISTS Respuesta CASCADE;
DROP TABLE IF EXISTS Respuesta_Prueba_Programa_Usuario_Pregunta CASCADE;
DROP TABLE IF EXISTS Resultado_Real CASCADE;
DROP TABLE IF EXISTS Tipo_Modulo CASCADE;
DROP TABLE IF EXISTS Tipo_pregunta CASCADE;
DROP TABLE IF EXISTS Tipo_Prueba CASCADE;
DROP TABLE IF EXISTS Tipo_Usuario CASCADE;
DROP TABLE IF EXISTS Usuario CASCADE;
