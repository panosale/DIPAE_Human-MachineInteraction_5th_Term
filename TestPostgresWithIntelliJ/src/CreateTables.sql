DROP TABLE IF EXISTS t_Cities;
DROP TABLE IF EXISTS t_Countries;

CREATE TABLE IF NOT EXISTS t_Countries
(
    f_CountryID SERIAL UNIQUE,
    f_CountryName VARCHAR(30) PRIMARY KEY
);
INSERT INTO t_Countries (f_CountryName) VALUES ('GREECE');
INSERT INTO t_Countries (f_CountryName) VALUES ('ITALY');
INSERT INTO t_Countries (f_CountryName) VALUES ('FRANCE');
INSERT INTO t_Countries (f_CountryName) VALUES ('SPAIN');

CREATE TABLE IF NOT EXISTS t_Cities
(
	f_CityID SERIAL UNIQUE,
	f_CountryID Integer,
	f_CityName VARCHAR(30) PRIMARY KEY,
	FOREIGN KEY (f_CountryID) REFERENCES t_Countries(f_CountryID) ON DELETE RESTRICT
);
-- CHECK COUNTRIES IDS BEFORE INSERT THE FOLLOWING LINES
INSERT INTO t_Cities (f_CityName, f_CountryID) VALUES ('THESSALONIKI', 1);
INSERT INTO t_Cities (f_CityName, f_CountryID) VALUES ('ATHENS', 1);
INSERT INTO t_Cities (f_CityName, f_CountryID) VALUES ('ROME', 2);
INSERT INTO t_Cities (f_CityName, f_CountryID) VALUES ('VENICE', 2);
INSERT INTO t_Cities (f_CityName, f_CountryID) VALUES ('PARIS', 3);
INSERT INTO t_Cities (f_CityName, f_CountryID) VALUES ('MADRID', 4);

-- TESTS
-- SELECT t_Cities.f_CityID, t_Cities.f_CityName, t_Countries.f_CountryName AS f_CountryName FROM t_Cities JOIN t_Countries ON t_Cities.f_CountryID = t_Countries.f_CountryID
--select * from t_Cities;
--select * from t_Countries;
