DROP TABLE IF EXISTS tcountries;
DROP TABLE IF EXISTS Cities;
CREATE TABLE IF NOT EXISTS tcountries
(
    fcountryid SERIAL,
    fcountryname character varying(30) PRIMARY KEY
)

INSERT INTO tCountries (fcountryname) VALUES ('GREECE');
INSERT INTO tCountries (fcountryname) VALUES ('ITALY')
INSERT INTO tCountries (fcountryname) VALUES ('FRANCE')
INSERT INTO tCountries (fcountryname) VALUES ('SPAIN')

CREATE TABLE IF NOT EXISTS tCities
(
	fCityID SERIAL,
	fCountryID Integer,
	fCityName character varying(30) PRIMARY KEY,
	FOREIGN KEY (fCountryID) REFERENCES tcountries(fCountryID) ON DELETE RESTRICT
)
-- CHECK COUNTRIES IDS BEFORE INSERT THE FOLLOWING LINES
INSERT INTO tcities (fcityname, fcountryid) VALUES ('THESSALONIKI', 1);
INSERT INTO tcities (fcityname, fcountryid) VALUES ('ATHENS', 1);
INSERT INTO tcities (fcityname, fcountryid) VALUES ('ROME', 2);
INSERT INTO tcities (fcityname, fcountryid) VALUES ('VENICE', 2);
INSERT INTO tcities (fcityname, fcountryid) VALUES ('PARIS', 3)
INSERT INTO tcities (fcityname, fcountryid) VALUES ('MADRID', 4)


-- TESTS
-- SELECT tCities.fCityID, tCities.fCityName, tCountries.fCountryName AS fCountryName FROM tCities JOIN tCountries ON tCities.fCountryID = tCountries.fCountryID
-- select * from tcities;
-- select * from tcountries;
