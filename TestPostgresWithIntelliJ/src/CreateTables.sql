DROP TABLE IF EXISTS t_Cities;
DROP TABLE IF EXISTS t_Countries;
DROP TABLE IF EXISTS t_RoomsCategories;
DROP TABLE IF EXISTS t_Services;

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
	f_CityID SERIAL,
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

CREATE TABLE IF NOT EXISTS t_RoomsCategories (
	f_CategoryID SERIAL UNIQUE,
	f_CategoryName VARCHAR(50) PRIMARY KEY,
	f_CategoryDescription TEXT
);
INSERT INTO t_RoomsCategories (f_CategoryName, f_CategoryDescription) VALUES ('ΚΑΝΟΝΙΚΟ ΔΩΜΑΤΙΟ', 'Κανονικό δωμάτιο.');
INSERT INTO t_RoomsCategories (f_CategoryName, f_CategoryDescription) VALUES ('ΔΩΜΑΤΙΟ ΜΕ ΘΕΑ', 'Δωμάτιο με θέα στη θάλασσα.');
INSERT INTO t_RoomsCategories (f_CategoryName) VALUES ('ΜΕΣΑΙΑ ΣΟΥΙΤΑ');
INSERT INTO t_RoomsCategories (f_CategoryName, f_CategoryDescription) VALUES ('ΜΕΓΑΛΗ ΣΟΥΙΤΑ', 'Μεγάλη σουίτα γα βασιλιάδες.');

CREATE TABLE IF NOT EXISTS t_Services (
	f_ServiceID SERIAL UNIQUE,
	f_ServiceName VARCHAR(100) PRIMARY KEY,
	f_ServicePrice FLOAT,
	f_ServiceDescription TEXT
);
INSERT INTO t_Services (f_ServiceName, f_ServicePrice) VALUES ('ΔΙΑΝΥΚΤΕΡΕΥΣΗ ΕΝΗΛΙΚΟΥ', 80);
INSERT INTO t_Services (f_ServiceName, f_ServicePrice, f_ServiceDescription) VALUES ('ΔΙΑΝΥΚΤΕΡΕΥΣΗ ΑΝΗΛΙΚΟΥ', 20, 'Διανυκτέρευση ανηλίκου κάτω των 18 ετών.');
INSERT INTO t_Services (f_ServiceName, f_ServicePrice, f_ServiceDescription) VALUES ('ΠΡΩΙΝΟ', 8.50, 'Πρωινό στο εστιατόριο.');
INSERT INTO t_Services (f_ServiceName, f_ServicePrice, f_ServiceDescription) VALUES ('ΠΡΩΙΝΟ ΔΩΜΑΤΙΟΥ', 15.50, 'Πρωινό στο δωμάτιο.');
INSERT INTO t_Services (f_ServiceName, f_ServicePrice) VALUES ('ΣΠΑ', 20);


-- TESTS
-- SELECT t_Cities.f_CityID, t_Cities.f_CityName, t_Countries.f_CountryName AS f_CountryName FROM t_Cities JOIN t_Countries ON t_Cities.f_CountryID = t_Countries.f_CountryID
--select * from t_Cities;
--select * from t_Countries;
--select * from t_RoomsCategories;
--select * from t_Services;
