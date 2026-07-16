ALTER TABLE covid_cases
ADD CONSTRAINT uq_country_date
UNIQUE (Country, Date);
