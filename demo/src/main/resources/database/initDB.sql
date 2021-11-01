CREATE TABLE IF NOT EXISTS company
(
    company_id bigint NOT NULL,
    symbol character varying(5) NOT NULL,
    sector character varying(50) NOT NULL,
    name character varying(50) NOT NULL,
    market_cap bigint NOT NULL,
    ipo_year integer NOT NULL,
    country character varying(50) NOT NULL,
    CONSTRAINT company_pkey PRIMARY KEY (company_id)
);

--CREATE TABLE IF NOT EXISTS stock
--(
--    stock_id bigint NOT NULL ,
--    date timestamp without time zone NOT NULL,
--    open_price decimal NOT NULL,
--    close_price decimal NOT NULL,
--    high_price decimal NOT NULL,
--    low_price decimal NOT NULL,
--    volume integer NOT NULL,
--    current_price decimal NOT NULL,
--    CONSTRAINT stock_pkey PRIMARY KEY (stock_id),
--    CONSTRAINT stock_company_id_fkey FOREIGN KEY (company_id)
--        REFERENCES company (company_id)
--);

--CREATE TABLE IF NOT EXISTS portfolio
--(
--    portfolio_id bigint NOT NULL ,
--    profitability double precision,
--    creation_date timestamp without time zone NOT NULL,
--    name character varying(50) NOT NULL,
--    stock_id bigint,
--    user_id bigint,
--    CONSTRAINT portfolio_pkey PRIMARY KEY (portfolio_id),
--    CONSTRAINT portfolio_stock_id_fkey FOREIGN KEY (stock_id)
--        REFERENCES stock (stock_id),
--    CONSTRAINT portfolio_user_id_fkey FOREIGN KEY (user_id)
--        REFERENCES user_account (user_id)
--);
--
--
--
--CREATE TABLE IF NOT EXISTS user_account
--(
--    user_id bigint NOT NULL ,
--    login character varying(20) NOT NULL,
--    password character varying(30) NOT NULL,
--    CONSTRAINT user_account_pkey PRIMARY KEY (user_id)
--);