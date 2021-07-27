DROP TABLE IF EXISTS sgg_country;

CREATE TABLE sgg_country (
    country_id INT NOT NULL AUTO_INCREMENT,
    country_name VARCHAR(100) NOT NULL UNIQUE,
    country_alpha_2 CHAR(2) NOT NULL UNIQUE,
    country_alpha_3 CHAR(3) NOT NULL UNIQUE,
    country_numeric INT NOT NULL UNIQUE,
    PRIMARY KEY  (country_id)
);

CREATE TABLE sgg_gdp_growth (
    gdp_growth_id INT NOT NULL AUTO_INCREMENT,
    gdp_growth_year INT NOT NULL UNIQUE,
    gdp_growth_value DECIMAL(12, 1) NOT NULL UNIQUE,
    gdp_growth_country_alpha_3 CHAR(3) NOT NULL UNIQUE,
    PRIMARY KEY  (gdp_growth_id)
);

CREATE INDEX ix_country_a_country_alpha_3 ON sgg_country (country_alpha_3)
;