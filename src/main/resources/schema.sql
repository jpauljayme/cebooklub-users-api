CREATE TABLE IF NOT EXISTS tbl_users (
    id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    fld_name VARCHAR(50) NOT NULL,
    fld_username VARCHAR(20) NOT NULL,
    fld_email VARCHAR(20) NOT NULL,
    fld_password VARCHAR(20) NOT NULL
);