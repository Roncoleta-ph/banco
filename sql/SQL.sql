CREATE TABLE medico (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    crm VARCHAR(20) NOT NULL,
    especialidade VARCHAR(100)
);

